/*
 * package com.singhkis.parquet;
 * 
 * import org.apache.avro.Schema;
 * 
 * public class UserRank implements org.apache.avro.specific.SpecificRecord{
 * 
 * 
 * public static final org.apache.avro.Schema SCHEMA$ = new
 * org.apache.avro.Schema.Parser().parse(
 * "{\"type\":\"record\",\"name\":\"UserRank\",\"namespace\":\"com.singhkis.parquet\",\"fields\":[{\"name\":\"userId\",\"type\":\"int\"},{\"name\":\"rank\",\"type\":\"int\"}]}"
 * );
 * 
 * private int userId; private int rank;
 * 
 * 
 * public UserRank(int userId, int rank) { super(); this.userId = userId;
 * this.rank = rank; }
 * 
 * public int getUserId() { return userId; } public void setUserId(int userId) {
 * this.userId = userId; } public int getRank() { return rank; } public void
 * setRank(int rank) { this.rank = rank; }
 * 
 * @Override
 * 
 * @SuppressWarnings(value="unchecked") public void put(int field$,
 * java.lang.Object value$) { switch (field$) { case 0: userId =
 * (java.lang.Integer)value$; break; case 1: rank = (java.lang.Integer)value$;
 * break; default: throw new org.apache.avro.AvroRuntimeException("Bad index");
 * } }
 * 
 * @Override public java.lang.Object get(int field$) { switch (field$) { case 0:
 * return userId; case 1: return rank; default: throw new
 * org.apache.avro.AvroRuntimeException("Bad index"); } }
 * 
 * 
 * @Override public Schema getSchema() { return SCHEMA$; }
 * 
 * @Override public String toString() { return "UserRank [userId=" + userId +
 * ", rank=" + rank + "]"; }
 * 
 * 
 * }
 */


/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.singhkis.parquet;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class UserRank extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserRank\",\"namespace\":\"com.singhkis.parquet\",\"fields\":[{\"name\":\"userId\",\"type\":\"int\"},{\"name\":\"rank\",\"type\":\"int\"}]}");

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<UserRank> ENCODER =
      new BinaryMessageEncoder<UserRank>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<UserRank> DECODER =
      new BinaryMessageDecoder<UserRank>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<UserRank> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<UserRank> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<UserRank> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<UserRank>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this UserRank to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a UserRank from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a UserRank instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static UserRank fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int userId;
  @Deprecated public int rank;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UserRank() {}

  /**
   * All-args constructor.
   * @param userId The new value for userId
   * @param rank The new value for rank
   */
  public UserRank(java.lang.Integer userId, java.lang.Integer rank) {
    this.userId = userId;
    this.rank = rank;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return userId;
    case 1: return rank;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: userId = (java.lang.Integer)value$; break;
    case 1: rank = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'userId' field.
   * @return The value of the 'userId' field.
   */
  public int getUserId() {
    return userId;
  }


  /**
   * Sets the value of the 'userId' field.
   * @param value the value to set.
   */
  public void setUserId(int value) {
    this.userId = value;
  }

  /**
   * Gets the value of the 'rank' field.
   * @return The value of the 'rank' field.
   */
  public int getRank() {
    return rank;
  }


  /**
   * Sets the value of the 'rank' field.
   * @param value the value to set.
   */
  public void setRank(int value) {
    this.rank = value;
  }

  /**
   * Creates a new UserRank RecordBuilder.
   * @return A new UserRank RecordBuilder
   */
  public static com.singhkis.parquet.UserRank.Builder newBuilder() {
    return new com.singhkis.parquet.UserRank.Builder();
  }

  /**
   * Creates a new UserRank RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UserRank RecordBuilder
   */
  public static com.singhkis.parquet.UserRank.Builder newBuilder(com.singhkis.parquet.UserRank.Builder other) {
    if (other == null) {
      return new com.singhkis.parquet.UserRank.Builder();
    } else {
      return new com.singhkis.parquet.UserRank.Builder(other);
    }
  }

  /**
   * Creates a new UserRank RecordBuilder by copying an existing UserRank instance.
   * @param other The existing instance to copy.
   * @return A new UserRank RecordBuilder
   */
  public static com.singhkis.parquet.UserRank.Builder newBuilder(com.singhkis.parquet.UserRank other) {
    if (other == null) {
      return new com.singhkis.parquet.UserRank.Builder();
    } else {
      return new com.singhkis.parquet.UserRank.Builder(other);
    }
  }

  /**
   * RecordBuilder for UserRank instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserRank>
    implements org.apache.avro.data.RecordBuilder<UserRank> {

    private int userId;
    private int rank;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.singhkis.parquet.UserRank.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.userId)) {
        this.userId = data().deepCopy(fields()[0].schema(), other.userId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.rank)) {
        this.rank = data().deepCopy(fields()[1].schema(), other.rank);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing UserRank instance
     * @param other The existing instance to copy.
     */
    private Builder(com.singhkis.parquet.UserRank other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.userId)) {
        this.userId = data().deepCopy(fields()[0].schema(), other.userId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.rank)) {
        this.rank = data().deepCopy(fields()[1].schema(), other.rank);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'userId' field.
      * @return The value.
      */
    public int getUserId() {
      return userId;
    }


    /**
      * Sets the value of the 'userId' field.
      * @param value The value of 'userId'.
      * @return This builder.
      */
    public com.singhkis.parquet.UserRank.Builder setUserId(int value) {
      validate(fields()[0], value);
      this.userId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'userId' field has been set.
      * @return True if the 'userId' field has been set, false otherwise.
      */
    public boolean hasUserId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'userId' field.
      * @return This builder.
      */
    public com.singhkis.parquet.UserRank.Builder clearUserId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'rank' field.
      * @return The value.
      */
    public int getRank() {
      return rank;
    }


    /**
      * Sets the value of the 'rank' field.
      * @param value The value of 'rank'.
      * @return This builder.
      */
    public com.singhkis.parquet.UserRank.Builder setRank(int value) {
      validate(fields()[1], value);
      this.rank = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'rank' field has been set.
      * @return True if the 'rank' field has been set, false otherwise.
      */
    public boolean hasRank() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'rank' field.
      * @return This builder.
      */
    public com.singhkis.parquet.UserRank.Builder clearRank() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public UserRank build() {
      try {
        UserRank record = new UserRank();
        record.userId = fieldSetFlags()[0] ? this.userId : (java.lang.Integer) defaultValue(fields()[0]);
        record.rank = fieldSetFlags()[1] ? this.rank : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<UserRank>
    WRITER$ = (org.apache.avro.io.DatumWriter<UserRank>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<UserRank>
    READER$ = (org.apache.avro.io.DatumReader<UserRank>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.userId);

    out.writeInt(this.rank);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.userId = in.readInt();

      this.rank = in.readInt();

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.userId = in.readInt();
          break;

        case 1:
          this.rank = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









