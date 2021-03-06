/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.demo.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Book extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -52248260890772472L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Book\",\"namespace\":\"org.demo.model\",\"fields\":[{\"name\":\"title\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"totalPages\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"author\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"category\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Book> ENCODER =
      new BinaryMessageEncoder<Book>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Book> DECODER =
      new BinaryMessageDecoder<Book>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Book> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Book> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Book> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Book>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Book to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Book from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Book instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Book fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String title;
   private java.lang.String totalPages;
   private java.lang.String author;
   private java.lang.String category;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Book() {}

  /**
   * All-args constructor.
   * @param title The new value for title
   * @param totalPages The new value for totalPages
   * @param author The new value for author
   * @param category The new value for category
   */
  public Book(java.lang.String title, java.lang.String totalPages, java.lang.String author, java.lang.String category) {
    this.title = title;
    this.totalPages = totalPages;
    this.author = author;
    this.category = category;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return title;
    case 1: return totalPages;
    case 2: return author;
    case 3: return category;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: title = value$ != null ? value$.toString() : null; break;
    case 1: totalPages = value$ != null ? value$.toString() : null; break;
    case 2: author = value$ != null ? value$.toString() : null; break;
    case 3: category = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'title' field.
   * @return The value of the 'title' field.
   */
  public java.lang.String getTitle() {
    return title;
  }


  /**
   * Sets the value of the 'title' field.
   * @param value the value to set.
   */
  public void setTitle(java.lang.String value) {
    this.title = value;
  }

  /**
   * Gets the value of the 'totalPages' field.
   * @return The value of the 'totalPages' field.
   */
  public java.lang.String getTotalPages() {
    return totalPages;
  }


  /**
   * Sets the value of the 'totalPages' field.
   * @param value the value to set.
   */
  public void setTotalPages(java.lang.String value) {
    this.totalPages = value;
  }

  /**
   * Gets the value of the 'author' field.
   * @return The value of the 'author' field.
   */
  public java.lang.String getAuthor() {
    return author;
  }


  /**
   * Sets the value of the 'author' field.
   * @param value the value to set.
   */
  public void setAuthor(java.lang.String value) {
    this.author = value;
  }

  /**
   * Gets the value of the 'category' field.
   * @return The value of the 'category' field.
   */
  public java.lang.String getCategory() {
    return category;
  }


  /**
   * Sets the value of the 'category' field.
   * @param value the value to set.
   */
  public void setCategory(java.lang.String value) {
    this.category = value;
  }

  /**
   * Creates a new Book RecordBuilder.
   * @return A new Book RecordBuilder
   */
  public static org.demo.model.Book.Builder newBuilder() {
    return new org.demo.model.Book.Builder();
  }

  /**
   * Creates a new Book RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Book RecordBuilder
   */
  public static org.demo.model.Book.Builder newBuilder(org.demo.model.Book.Builder other) {
    if (other == null) {
      return new org.demo.model.Book.Builder();
    } else {
      return new org.demo.model.Book.Builder(other);
    }
  }

  /**
   * Creates a new Book RecordBuilder by copying an existing Book instance.
   * @param other The existing instance to copy.
   * @return A new Book RecordBuilder
   */
  public static org.demo.model.Book.Builder newBuilder(org.demo.model.Book other) {
    if (other == null) {
      return new org.demo.model.Book.Builder();
    } else {
      return new org.demo.model.Book.Builder(other);
    }
  }

  /**
   * RecordBuilder for Book instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Book>
    implements org.apache.avro.data.RecordBuilder<Book> {

    private java.lang.String title;
    private java.lang.String totalPages;
    private java.lang.String author;
    private java.lang.String category;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.demo.model.Book.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.title)) {
        this.title = data().deepCopy(fields()[0].schema(), other.title);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.totalPages)) {
        this.totalPages = data().deepCopy(fields()[1].schema(), other.totalPages);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.author)) {
        this.author = data().deepCopy(fields()[2].schema(), other.author);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.category)) {
        this.category = data().deepCopy(fields()[3].schema(), other.category);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing Book instance
     * @param other The existing instance to copy.
     */
    private Builder(org.demo.model.Book other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.title)) {
        this.title = data().deepCopy(fields()[0].schema(), other.title);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.totalPages)) {
        this.totalPages = data().deepCopy(fields()[1].schema(), other.totalPages);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.author)) {
        this.author = data().deepCopy(fields()[2].schema(), other.author);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.category)) {
        this.category = data().deepCopy(fields()[3].schema(), other.category);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'title' field.
      * @return The value.
      */
    public java.lang.String getTitle() {
      return title;
    }


    /**
      * Sets the value of the 'title' field.
      * @param value The value of 'title'.
      * @return This builder.
      */
    public org.demo.model.Book.Builder setTitle(java.lang.String value) {
      validate(fields()[0], value);
      this.title = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'title' field has been set.
      * @return True if the 'title' field has been set, false otherwise.
      */
    public boolean hasTitle() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'title' field.
      * @return This builder.
      */
    public org.demo.model.Book.Builder clearTitle() {
      title = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'totalPages' field.
      * @return The value.
      */
    public java.lang.String getTotalPages() {
      return totalPages;
    }


    /**
      * Sets the value of the 'totalPages' field.
      * @param value The value of 'totalPages'.
      * @return This builder.
      */
    public org.demo.model.Book.Builder setTotalPages(java.lang.String value) {
      validate(fields()[1], value);
      this.totalPages = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'totalPages' field has been set.
      * @return True if the 'totalPages' field has been set, false otherwise.
      */
    public boolean hasTotalPages() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'totalPages' field.
      * @return This builder.
      */
    public org.demo.model.Book.Builder clearTotalPages() {
      totalPages = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'author' field.
      * @return The value.
      */
    public java.lang.String getAuthor() {
      return author;
    }


    /**
      * Sets the value of the 'author' field.
      * @param value The value of 'author'.
      * @return This builder.
      */
    public org.demo.model.Book.Builder setAuthor(java.lang.String value) {
      validate(fields()[2], value);
      this.author = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'author' field has been set.
      * @return True if the 'author' field has been set, false otherwise.
      */
    public boolean hasAuthor() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'author' field.
      * @return This builder.
      */
    public org.demo.model.Book.Builder clearAuthor() {
      author = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'category' field.
      * @return The value.
      */
    public java.lang.String getCategory() {
      return category;
    }


    /**
      * Sets the value of the 'category' field.
      * @param value The value of 'category'.
      * @return This builder.
      */
    public org.demo.model.Book.Builder setCategory(java.lang.String value) {
      validate(fields()[3], value);
      this.category = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'category' field has been set.
      * @return True if the 'category' field has been set, false otherwise.
      */
    public boolean hasCategory() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'category' field.
      * @return This builder.
      */
    public org.demo.model.Book.Builder clearCategory() {
      category = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Book build() {
      try {
        Book record = new Book();
        record.title = fieldSetFlags()[0] ? this.title : (java.lang.String) defaultValue(fields()[0]);
        record.totalPages = fieldSetFlags()[1] ? this.totalPages : (java.lang.String) defaultValue(fields()[1]);
        record.author = fieldSetFlags()[2] ? this.author : (java.lang.String) defaultValue(fields()[2]);
        record.category = fieldSetFlags()[3] ? this.category : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Book>
    WRITER$ = (org.apache.avro.io.DatumWriter<Book>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Book>
    READER$ = (org.apache.avro.io.DatumReader<Book>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.title);

    out.writeString(this.totalPages);

    out.writeString(this.author);

    out.writeString(this.category);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.title = in.readString();

      this.totalPages = in.readString();

      this.author = in.readString();

      this.category = in.readString();

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.title = in.readString();
          break;

        case 1:
          this.totalPages = in.readString();
          break;

        case 2:
          this.author = in.readString();
          break;

        case 3:
          this.category = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










