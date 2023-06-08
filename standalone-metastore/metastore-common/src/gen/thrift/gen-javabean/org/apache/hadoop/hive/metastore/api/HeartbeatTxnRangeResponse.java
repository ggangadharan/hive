/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class HeartbeatTxnRangeResponse implements org.apache.thrift.TBase<HeartbeatTxnRangeResponse, HeartbeatTxnRangeResponse._Fields>, java.io.Serializable, Cloneable, Comparable<HeartbeatTxnRangeResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HeartbeatTxnRangeResponse");

  private static final org.apache.thrift.protocol.TField ABORTED_FIELD_DESC = new org.apache.thrift.protocol.TField("aborted", org.apache.thrift.protocol.TType.SET, (short)1);
  private static final org.apache.thrift.protocol.TField NOSUCH_FIELD_DESC = new org.apache.thrift.protocol.TField("nosuch", org.apache.thrift.protocol.TType.SET, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new HeartbeatTxnRangeResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new HeartbeatTxnRangeResponseTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.Set<java.lang.Long> aborted; // required
  private @org.apache.thrift.annotation.Nullable java.util.Set<java.lang.Long> nosuch; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ABORTED((short)1, "aborted"),
    NOSUCH((short)2, "nosuch");

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
        case 1: // ABORTED
          return ABORTED;
        case 2: // NOSUCH
          return NOSUCH;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ABORTED, new org.apache.thrift.meta_data.FieldMetaData("aborted", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.NOSUCH, new org.apache.thrift.meta_data.FieldMetaData("nosuch", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HeartbeatTxnRangeResponse.class, metaDataMap);
  }

  public HeartbeatTxnRangeResponse() {
  }

  public HeartbeatTxnRangeResponse(
    java.util.Set<java.lang.Long> aborted,
    java.util.Set<java.lang.Long> nosuch)
  {
    this();
    this.aborted = aborted;
    this.nosuch = nosuch;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HeartbeatTxnRangeResponse(HeartbeatTxnRangeResponse other) {
    if (other.isSetAborted()) {
      java.util.Set<java.lang.Long> __this__aborted = new java.util.HashSet<java.lang.Long>(other.aborted);
      this.aborted = __this__aborted;
    }
    if (other.isSetNosuch()) {
      java.util.Set<java.lang.Long> __this__nosuch = new java.util.HashSet<java.lang.Long>(other.nosuch);
      this.nosuch = __this__nosuch;
    }
  }

  public HeartbeatTxnRangeResponse deepCopy() {
    return new HeartbeatTxnRangeResponse(this);
  }

  @Override
  public void clear() {
    this.aborted = null;
    this.nosuch = null;
  }

  public int getAbortedSize() {
    return (this.aborted == null) ? 0 : this.aborted.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Long> getAbortedIterator() {
    return (this.aborted == null) ? null : this.aborted.iterator();
  }

  public void addToAborted(long elem) {
    if (this.aborted == null) {
      this.aborted = new java.util.HashSet<java.lang.Long>();
    }
    this.aborted.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Set<java.lang.Long> getAborted() {
    return this.aborted;
  }

  public void setAborted(@org.apache.thrift.annotation.Nullable java.util.Set<java.lang.Long> aborted) {
    this.aborted = aborted;
  }

  public void unsetAborted() {
    this.aborted = null;
  }

  /** Returns true if field aborted is set (has been assigned a value) and false otherwise */
  public boolean isSetAborted() {
    return this.aborted != null;
  }

  public void setAbortedIsSet(boolean value) {
    if (!value) {
      this.aborted = null;
    }
  }

  public int getNosuchSize() {
    return (this.nosuch == null) ? 0 : this.nosuch.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Long> getNosuchIterator() {
    return (this.nosuch == null) ? null : this.nosuch.iterator();
  }

  public void addToNosuch(long elem) {
    if (this.nosuch == null) {
      this.nosuch = new java.util.HashSet<java.lang.Long>();
    }
    this.nosuch.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Set<java.lang.Long> getNosuch() {
    return this.nosuch;
  }

  public void setNosuch(@org.apache.thrift.annotation.Nullable java.util.Set<java.lang.Long> nosuch) {
    this.nosuch = nosuch;
  }

  public void unsetNosuch() {
    this.nosuch = null;
  }

  /** Returns true if field nosuch is set (has been assigned a value) and false otherwise */
  public boolean isSetNosuch() {
    return this.nosuch != null;
  }

  public void setNosuchIsSet(boolean value) {
    if (!value) {
      this.nosuch = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ABORTED:
      if (value == null) {
        unsetAborted();
      } else {
        setAborted((java.util.Set<java.lang.Long>)value);
      }
      break;

    case NOSUCH:
      if (value == null) {
        unsetNosuch();
      } else {
        setNosuch((java.util.Set<java.lang.Long>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ABORTED:
      return getAborted();

    case NOSUCH:
      return getNosuch();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ABORTED:
      return isSetAborted();
    case NOSUCH:
      return isSetNosuch();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof HeartbeatTxnRangeResponse)
      return this.equals((HeartbeatTxnRangeResponse)that);
    return false;
  }

  public boolean equals(HeartbeatTxnRangeResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_aborted = true && this.isSetAborted();
    boolean that_present_aborted = true && that.isSetAborted();
    if (this_present_aborted || that_present_aborted) {
      if (!(this_present_aborted && that_present_aborted))
        return false;
      if (!this.aborted.equals(that.aborted))
        return false;
    }

    boolean this_present_nosuch = true && this.isSetNosuch();
    boolean that_present_nosuch = true && that.isSetNosuch();
    if (this_present_nosuch || that_present_nosuch) {
      if (!(this_present_nosuch && that_present_nosuch))
        return false;
      if (!this.nosuch.equals(that.nosuch))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAborted()) ? 131071 : 524287);
    if (isSetAborted())
      hashCode = hashCode * 8191 + aborted.hashCode();

    hashCode = hashCode * 8191 + ((isSetNosuch()) ? 131071 : 524287);
    if (isSetNosuch())
      hashCode = hashCode * 8191 + nosuch.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(HeartbeatTxnRangeResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetAborted(), other.isSetAborted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAborted()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.aborted, other.aborted);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetNosuch(), other.isSetNosuch());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNosuch()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nosuch, other.nosuch);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("HeartbeatTxnRangeResponse(");
    boolean first = true;

    sb.append("aborted:");
    if (this.aborted == null) {
      sb.append("null");
    } else {
      sb.append(this.aborted);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nosuch:");
    if (this.nosuch == null) {
      sb.append("null");
    } else {
      sb.append(this.nosuch);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetAborted()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'aborted' is unset! Struct:" + toString());
    }

    if (!isSetNosuch()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nosuch' is unset! Struct:" + toString());
    }

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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HeartbeatTxnRangeResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HeartbeatTxnRangeResponseStandardScheme getScheme() {
      return new HeartbeatTxnRangeResponseStandardScheme();
    }
  }

  private static class HeartbeatTxnRangeResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<HeartbeatTxnRangeResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HeartbeatTxnRangeResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ABORTED
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set876 = iprot.readSetBegin();
                struct.aborted = new java.util.HashSet<java.lang.Long>(2*_set876.size);
                long _elem877;
                for (int _i878 = 0; _i878 < _set876.size; ++_i878)
                {
                  _elem877 = iprot.readI64();
                  struct.aborted.add(_elem877);
                }
                iprot.readSetEnd();
              }
              struct.setAbortedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NOSUCH
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set879 = iprot.readSetBegin();
                struct.nosuch = new java.util.HashSet<java.lang.Long>(2*_set879.size);
                long _elem880;
                for (int _i881 = 0; _i881 < _set879.size; ++_i881)
                {
                  _elem880 = iprot.readI64();
                  struct.nosuch.add(_elem880);
                }
                iprot.readSetEnd();
              }
              struct.setNosuchIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HeartbeatTxnRangeResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.aborted != null) {
        oprot.writeFieldBegin(ABORTED_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, struct.aborted.size()));
          for (long _iter882 : struct.aborted)
          {
            oprot.writeI64(_iter882);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.nosuch != null) {
        oprot.writeFieldBegin(NOSUCH_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, struct.nosuch.size()));
          for (long _iter883 : struct.nosuch)
          {
            oprot.writeI64(_iter883);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HeartbeatTxnRangeResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HeartbeatTxnRangeResponseTupleScheme getScheme() {
      return new HeartbeatTxnRangeResponseTupleScheme();
    }
  }

  private static class HeartbeatTxnRangeResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<HeartbeatTxnRangeResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HeartbeatTxnRangeResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.aborted.size());
        for (long _iter884 : struct.aborted)
        {
          oprot.writeI64(_iter884);
        }
      }
      {
        oprot.writeI32(struct.nosuch.size());
        for (long _iter885 : struct.nosuch)
        {
          oprot.writeI64(_iter885);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HeartbeatTxnRangeResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TSet _set886 = iprot.readSetBegin(org.apache.thrift.protocol.TType.I64);
        struct.aborted = new java.util.HashSet<java.lang.Long>(2*_set886.size);
        long _elem887;
        for (int _i888 = 0; _i888 < _set886.size; ++_i888)
        {
          _elem887 = iprot.readI64();
          struct.aborted.add(_elem887);
        }
      }
      struct.setAbortedIsSet(true);
      {
        org.apache.thrift.protocol.TSet _set889 = iprot.readSetBegin(org.apache.thrift.protocol.TType.I64);
        struct.nosuch = new java.util.HashSet<java.lang.Long>(2*_set889.size);
        long _elem890;
        for (int _i891 = 0; _i891 < _set889.size; ++_i891)
        {
          _elem890 = iprot.readI64();
          struct.nosuch.add(_elem890);
        }
      }
      struct.setNosuchIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

