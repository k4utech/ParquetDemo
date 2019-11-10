package com.singhkis.parquet;


import java.io.IOException;
import java.time.Instant;

import org.apache.hadoop.fs.Path;
import org.apache.parquet.avro.AvroParquetReader;
import org.apache.parquet.avro.AvroParquetWriter;
import org.apache.parquet.hadoop.metadata.CompressionCodecName;

public class MainParquet {
	
	static final String filePathRoot = "D:/parquet/";
	static final int blockSize = 1024;
	static final int pageSize = 65535;
    
	public static void main(String[] args) throws IOException {
		Path parquetFileName = new Path(filePathRoot + Instant.now().getEpochSecond() + ".parquet");
		
		writeToParquetFile(parquetFileName);
		readFromParquetFile(parquetFileName);
	}
	
	private static void readFromParquetFile(Path parquetFileName) throws IOException {
		AvroParquetReader<UserRank> reader = new AvroParquetReader<UserRank>(parquetFileName);
		while(true) {
			UserRank a = reader.read();
			if(a==null) 
				break;
			System.out.println(a);
		}
		reader.close();
	}

	private static void writeToParquetFile(Path parquetFileName) throws IOException {
		AvroParquetWriter parquetWriter = new AvroParquetWriter(parquetFileName, 
				UserRank.SCHEMA$, CompressionCodecName.SNAPPY, blockSize, pageSize);
		
		UserRank[] userRanking = getUserRanking();
		for(UserRank obj : userRanking){
	        parquetWriter.write(obj); 
	    }
		
		parquetWriter.close();
	}

	public static UserRank[] getUserRanking(){
		UserRank dataToWrite[] = new UserRank[]{
			      new UserRank(1, 3),
			      new UserRank(2, 0),
			      new UserRank(3, 100)
			    };
		
		return dataToWrite;
	}

}
