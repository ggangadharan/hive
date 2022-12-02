/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class ShowCompactRequest implements org.apache.thrift.TBase<ShowCompactRequest, ShowCompactRequest._Fields>, java.io.Serializable, Cloneable, Comparable<ShowCompactRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ShowCompactRequest");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField POOL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("poolName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DBNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbname", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TABLENAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tablename", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField PARTITIONNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("partitionname", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ShowCompactRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ShowCompactRequestTupleSchemeFactory();

  private long id; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String poolName; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String dbname; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String tablename; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String partitionname; // optional
  private @org.apache.thrift.annotation.Nullable CompactionType type; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String state; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    POOL_NAME((short)2, "poolName"),
    DBNAME((short)3, "dbname"),
    TABLENAME((short)4, "tablename"),
    PARTITIONNAME((short)5, "partitionname"),
    /**
     * 
     * @see CompactionType
     */
    TYPE((short)6, "type"),
    STATE((short)7, "state");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // POOL_NAME
          return POOL_NAME;
        case 3: // DBNAME
          return DBNAME;
        case 4: // TABLENAME
          return TABLENAME;
        case 5: // PARTITIONNAME
          return PARTITIONNAME;
        case 6: // TYPE
          return TYPE;
        case 7: // STATE
          return STATE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ID,_Fields.POOL_NAME,_Fields.DBNAME,_Fields.TABLENAME,_Fields.PARTITIONNAME,_Fields.TYPE,_Fields.STATE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.POOL_NAME, new org.apache.thrift.meta_data.FieldMetaData("poolName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DBNAME, new org.apache.thrift.meta_data.FieldMetaData("dbname", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLENAME, new org.apache.thrift.meta_data.FieldMetaData("tablename", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARTITIONNAME, new org.apache.thrift.meta_data.FieldMetaData("partitionname", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, CompactionType.class)));
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ShowCompactRequest.class, metaDataMap);
  }

  public ShowCompactRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ShowCompactRequest(ShowCompactRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetPoolName()) {
      this.poolName = other.poolName;
    }
    if (other.isSetDbname()) {
      this.dbname = other.dbname;
    }
    if (other.isSetTablename()) {
      this.tablename = other.tablename;
    }
    if (other.isSetPartitionname()) {
      this.partitionname = other.partitionname;
    }
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetState()) {
      this.state = other.state;
    }
  }

  public ShowCompactRequest deepCopy() {
    return new ShowCompactRequest(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.poolName = null;
    this.dbname = null;
    this.tablename = null;
    this.partitionname = null;
    this.type = null;
    this.state = null;
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
    setIdIsSet(true);
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPoolName() {
    return this.poolName;
  }

  public void setPoolName(@org.apache.thrift.annotation.Nullable java.lang.String poolName) {
    this.poolName = poolName;
  }

  public void unsetPoolName() {
    this.poolName = null;
  }

  /** Returns true if field poolName is set (has been assigned a value) and false otherwise */
  public boolean isSetPoolName() {
    return this.poolName != null;
  }

  public void setPoolNameIsSet(boolean value) {
    if (!value) {
      this.poolName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDbname() {
    return this.dbname;
  }

  public void setDbname(@org.apache.thrift.annotation.Nullable java.lang.String dbname) {
    this.dbname = dbname;
  }

  public void unsetDbname() {
    this.dbname = null;
  }

  /** Returns true if field dbname is set (has been assigned a value) and false otherwise */
  public boolean isSetDbname() {
    return this.dbname != null;
  }

  public void setDbnameIsSet(boolean value) {
    if (!value) {
      this.dbname = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTablename() {
    return this.tablename;
  }

  public void setTablename(@org.apache.thrift.annotation.Nullable java.lang.String tablename) {
    this.tablename = tablename;
  }

  public void unsetTablename() {
    this.tablename = null;
  }

  /** Returns true if field tablename is set (has been assigned a value) and false otherwise */
  public boolean isSetTablename() {
    return this.tablename != null;
  }

  public void setTablenameIsSet(boolean value) {
    if (!value) {
      this.tablename = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPartitionname() {
    return this.partitionname;
  }

  public void setPartitionname(@org.apache.thrift.annotation.Nullable java.lang.String partitionname) {
    this.partitionname = partitionname;
  }

  public void unsetPartitionname() {
    this.partitionname = null;
  }

  /** Returns true if field partitionname is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionname() {
    return this.partitionname != null;
  }

  public void setPartitionnameIsSet(boolean value) {
    if (!value) {
      this.partitionname = null;
    }
  }

  /**
   * 
   * @see CompactionType
   */
  @org.apache.thrift.annotation.Nullable
  public CompactionType getType() {
    return this.type;
  }

  /**
   * 
   * @see CompactionType
   */
  public void setType(@org.apache.thrift.annotation.Nullable CompactionType type) {
    this.type = type;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getState() {
    return this.state;
  }

  public void setState(@org.apache.thrift.annotation.Nullable java.lang.String state) {
    this.state = state;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Long)value);
      }
      break;

    case POOL_NAME:
      if (value == null) {
        unsetPoolName();
      } else {
        setPoolName((java.lang.String)value);
      }
      break;

    case DBNAME:
      if (value == null) {
        unsetDbname();
      } else {
        setDbname((java.lang.String)value);
      }
      break;

    case TABLENAME:
      if (value == null) {
        unsetTablename();
      } else {
        setTablename((java.lang.String)value);
      }
      break;

    case PARTITIONNAME:
      if (value == null) {
        unsetPartitionname();
      } else {
        setPartitionname((java.lang.String)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((CompactionType)value);
      }
      break;

    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case POOL_NAME:
      return getPoolName();

    case DBNAME:
      return getDbname();

    case TABLENAME:
      return getTablename();

    case PARTITIONNAME:
      return getPartitionname();

    case TYPE:
      return getType();

    case STATE:
      return getState();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case POOL_NAME:
      return isSetPoolName();
    case DBNAME:
      return isSetDbname();
    case TABLENAME:
      return isSetTablename();
    case PARTITIONNAME:
      return isSetPartitionname();
    case TYPE:
      return isSetType();
    case STATE:
      return isSetState();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ShowCompactRequest)
      return this.equals((ShowCompactRequest)that);
    return false;
  }

  public boolean equals(ShowCompactRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_poolName = true && this.isSetPoolName();
    boolean that_present_poolName = true && that.isSetPoolName();
    if (this_present_poolName || that_present_poolName) {
      if (!(this_present_poolName && that_present_poolName))
        return false;
      if (!this.poolName.equals(that.poolName))
        return false;
    }

    boolean this_present_dbname = true && this.isSetDbname();
    boolean that_present_dbname = true && that.isSetDbname();
    if (this_present_dbname || that_present_dbname) {
      if (!(this_present_dbname && that_present_dbname))
        return false;
      if (!this.dbname.equals(that.dbname))
        return false;
    }

    boolean this_present_tablename = true && this.isSetTablename();
    boolean that_present_tablename = true && that.isSetTablename();
    if (this_present_tablename || that_present_tablename) {
      if (!(this_present_tablename && that_present_tablename))
        return false;
      if (!this.tablename.equals(that.tablename))
        return false;
    }

    boolean this_present_partitionname = true && this.isSetPartitionname();
    boolean that_present_partitionname = true && that.isSetPartitionname();
    if (this_present_partitionname || that_present_partitionname) {
      if (!(this_present_partitionname && that_present_partitionname))
        return false;
      if (!this.partitionname.equals(that.partitionname))
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(id);

    hashCode = hashCode * 8191 + ((isSetPoolName()) ? 131071 : 524287);
    if (isSetPoolName())
      hashCode = hashCode * 8191 + poolName.hashCode();

    hashCode = hashCode * 8191 + ((isSetDbname()) ? 131071 : 524287);
    if (isSetDbname())
      hashCode = hashCode * 8191 + dbname.hashCode();

    hashCode = hashCode * 8191 + ((isSetTablename()) ? 131071 : 524287);
    if (isSetTablename())
      hashCode = hashCode * 8191 + tablename.hashCode();

    hashCode = hashCode * 8191 + ((isSetPartitionname()) ? 131071 : 524287);
    if (isSetPartitionname())
      hashCode = hashCode * 8191 + partitionname.hashCode();

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.getValue();

    hashCode = hashCode * 8191 + ((isSetState()) ? 131071 : 524287);
    if (isSetState())
      hashCode = hashCode * 8191 + state.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ShowCompactRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetId(), other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPoolName(), other.isSetPoolName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPoolName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.poolName, other.poolName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDbname(), other.isSetDbname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbname, other.dbname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTablename(), other.isSetTablename());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTablename()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tablename, other.tablename);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPartitionname(), other.isSetPartitionname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitionname, other.partitionname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetType(), other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetState(), other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, other.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowCompactRequest(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetPoolName()) {
      if (!first) sb.append(", ");
      sb.append("poolName:");
      if (this.poolName == null) {
        sb.append("null");
      } else {
        sb.append(this.poolName);
      }
      first = false;
    }
    if (isSetDbname()) {
      if (!first) sb.append(", ");
      sb.append("dbname:");
      if (this.dbname == null) {
        sb.append("null");
      } else {
        sb.append(this.dbname);
      }
      first = false;
    }
    if (isSetTablename()) {
      if (!first) sb.append(", ");
      sb.append("tablename:");
      if (this.tablename == null) {
        sb.append("null");
      } else {
        sb.append(this.tablename);
      }
      first = false;
    }
    if (isSetPartitionname()) {
      if (!first) sb.append(", ");
      sb.append("partitionname:");
      if (this.partitionname == null) {
        sb.append("null");
      } else {
        sb.append(this.partitionname);
      }
      first = false;
    }
    if (isSetType()) {
      if (!first) sb.append(", ");
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (isSetState()) {
      if (!first) sb.append(", ");
      sb.append("state:");
      if (this.state == null) {
        sb.append("null");
      } else {
        sb.append(this.state);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ShowCompactRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ShowCompactRequestStandardScheme getScheme() {
      return new ShowCompactRequestStandardScheme();
    }
  }

  private static class ShowCompactRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<ShowCompactRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ShowCompactRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // POOL_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.poolName = iprot.readString();
              struct.setPoolNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DBNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbname = iprot.readString();
              struct.setDbnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TABLENAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tablename = iprot.readString();
              struct.setTablenameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PARTITIONNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.partitionname = iprot.readString();
              struct.setPartitionnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = org.apache.hadoop.hive.metastore.api.CompactionType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.state = iprot.readString();
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ShowCompactRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI64(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.poolName != null) {
        if (struct.isSetPoolName()) {
          oprot.writeFieldBegin(POOL_NAME_FIELD_DESC);
          oprot.writeString(struct.poolName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.dbname != null) {
        if (struct.isSetDbname()) {
          oprot.writeFieldBegin(DBNAME_FIELD_DESC);
          oprot.writeString(struct.dbname);
          oprot.writeFieldEnd();
        }
      }
      if (struct.tablename != null) {
        if (struct.isSetTablename()) {
          oprot.writeFieldBegin(TABLENAME_FIELD_DESC);
          oprot.writeString(struct.tablename);
          oprot.writeFieldEnd();
        }
      }
      if (struct.partitionname != null) {
        if (struct.isSetPartitionname()) {
          oprot.writeFieldBegin(PARTITIONNAME_FIELD_DESC);
          oprot.writeString(struct.partitionname);
          oprot.writeFieldEnd();
        }
      }
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeI32(struct.type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.state != null) {
        if (struct.isSetState()) {
          oprot.writeFieldBegin(STATE_FIELD_DESC);
          oprot.writeString(struct.state);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ShowCompactRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ShowCompactRequestTupleScheme getScheme() {
      return new ShowCompactRequestTupleScheme();
    }
  }

  private static class ShowCompactRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<ShowCompactRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ShowCompactRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetPoolName()) {
        optionals.set(1);
      }
      if (struct.isSetDbname()) {
        optionals.set(2);
      }
      if (struct.isSetTablename()) {
        optionals.set(3);
      }
      if (struct.isSetPartitionname()) {
        optionals.set(4);
      }
      if (struct.isSetType()) {
        optionals.set(5);
      }
      if (struct.isSetState()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
      if (struct.isSetPoolName()) {
        oprot.writeString(struct.poolName);
      }
      if (struct.isSetDbname()) {
        oprot.writeString(struct.dbname);
      }
      if (struct.isSetTablename()) {
        oprot.writeString(struct.tablename);
      }
      if (struct.isSetPartitionname()) {
        oprot.writeString(struct.partitionname);
      }
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetState()) {
        oprot.writeString(struct.state);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ShowCompactRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.poolName = iprot.readString();
        struct.setPoolNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.dbname = iprot.readString();
        struct.setDbnameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.tablename = iprot.readString();
        struct.setTablenameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.partitionname = iprot.readString();
        struct.setPartitionnameIsSet(true);
      }
      if (incoming.get(5)) {
        struct.type = org.apache.hadoop.hive.metastore.api.CompactionType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(6)) {
        struct.state = iprot.readString();
        struct.setStateIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

