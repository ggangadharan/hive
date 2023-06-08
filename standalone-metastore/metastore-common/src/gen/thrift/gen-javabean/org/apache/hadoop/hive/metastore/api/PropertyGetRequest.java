/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class PropertyGetRequest implements org.apache.thrift.TBase<PropertyGetRequest, PropertyGetRequest._Fields>, java.io.Serializable, Cloneable, Comparable<PropertyGetRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PropertyGetRequest");

  private static final org.apache.thrift.protocol.TField NAME_SPACE_FIELD_DESC = new org.apache.thrift.protocol.TField("nameSpace", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MAP_PREFIX_FIELD_DESC = new org.apache.thrift.protocol.TField("mapPrefix", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MAP_PREDICATE_FIELD_DESC = new org.apache.thrift.protocol.TField("mapPredicate", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField MAP_SELECTION_FIELD_DESC = new org.apache.thrift.protocol.TField("mapSelection", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PropertyGetRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PropertyGetRequestTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String nameSpace; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String mapPrefix; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String mapPredicate; // optional
  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> mapSelection; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME_SPACE((short)1, "nameSpace"),
    MAP_PREFIX((short)2, "mapPrefix"),
    MAP_PREDICATE((short)3, "mapPredicate"),
    MAP_SELECTION((short)4, "mapSelection");

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
        case 1: // NAME_SPACE
          return NAME_SPACE;
        case 2: // MAP_PREFIX
          return MAP_PREFIX;
        case 3: // MAP_PREDICATE
          return MAP_PREDICATE;
        case 4: // MAP_SELECTION
          return MAP_SELECTION;
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
  private static final _Fields optionals[] = {_Fields.MAP_PREDICATE,_Fields.MAP_SELECTION};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME_SPACE, new org.apache.thrift.meta_data.FieldMetaData("nameSpace", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MAP_PREFIX, new org.apache.thrift.meta_data.FieldMetaData("mapPrefix", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MAP_PREDICATE, new org.apache.thrift.meta_data.FieldMetaData("mapPredicate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MAP_SELECTION, new org.apache.thrift.meta_data.FieldMetaData("mapSelection", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PropertyGetRequest.class, metaDataMap);
  }

  public PropertyGetRequest() {
  }

  public PropertyGetRequest(
    java.lang.String nameSpace,
    java.lang.String mapPrefix)
  {
    this();
    this.nameSpace = nameSpace;
    this.mapPrefix = mapPrefix;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PropertyGetRequest(PropertyGetRequest other) {
    if (other.isSetNameSpace()) {
      this.nameSpace = other.nameSpace;
    }
    if (other.isSetMapPrefix()) {
      this.mapPrefix = other.mapPrefix;
    }
    if (other.isSetMapPredicate()) {
      this.mapPredicate = other.mapPredicate;
    }
    if (other.isSetMapSelection()) {
      java.util.List<java.lang.String> __this__mapSelection = new java.util.ArrayList<java.lang.String>(other.mapSelection);
      this.mapSelection = __this__mapSelection;
    }
  }

  public PropertyGetRequest deepCopy() {
    return new PropertyGetRequest(this);
  }

  @Override
  public void clear() {
    this.nameSpace = null;
    this.mapPrefix = null;
    this.mapPredicate = null;
    this.mapSelection = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getNameSpace() {
    return this.nameSpace;
  }

  public void setNameSpace(@org.apache.thrift.annotation.Nullable java.lang.String nameSpace) {
    this.nameSpace = nameSpace;
  }

  public void unsetNameSpace() {
    this.nameSpace = null;
  }

  /** Returns true if field nameSpace is set (has been assigned a value) and false otherwise */
  public boolean isSetNameSpace() {
    return this.nameSpace != null;
  }

  public void setNameSpaceIsSet(boolean value) {
    if (!value) {
      this.nameSpace = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getMapPrefix() {
    return this.mapPrefix;
  }

  public void setMapPrefix(@org.apache.thrift.annotation.Nullable java.lang.String mapPrefix) {
    this.mapPrefix = mapPrefix;
  }

  public void unsetMapPrefix() {
    this.mapPrefix = null;
  }

  /** Returns true if field mapPrefix is set (has been assigned a value) and false otherwise */
  public boolean isSetMapPrefix() {
    return this.mapPrefix != null;
  }

  public void setMapPrefixIsSet(boolean value) {
    if (!value) {
      this.mapPrefix = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getMapPredicate() {
    return this.mapPredicate;
  }

  public void setMapPredicate(@org.apache.thrift.annotation.Nullable java.lang.String mapPredicate) {
    this.mapPredicate = mapPredicate;
  }

  public void unsetMapPredicate() {
    this.mapPredicate = null;
  }

  /** Returns true if field mapPredicate is set (has been assigned a value) and false otherwise */
  public boolean isSetMapPredicate() {
    return this.mapPredicate != null;
  }

  public void setMapPredicateIsSet(boolean value) {
    if (!value) {
      this.mapPredicate = null;
    }
  }

  public int getMapSelectionSize() {
    return (this.mapSelection == null) ? 0 : this.mapSelection.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getMapSelectionIterator() {
    return (this.mapSelection == null) ? null : this.mapSelection.iterator();
  }

  public void addToMapSelection(java.lang.String elem) {
    if (this.mapSelection == null) {
      this.mapSelection = new java.util.ArrayList<java.lang.String>();
    }
    this.mapSelection.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getMapSelection() {
    return this.mapSelection;
  }

  public void setMapSelection(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> mapSelection) {
    this.mapSelection = mapSelection;
  }

  public void unsetMapSelection() {
    this.mapSelection = null;
  }

  /** Returns true if field mapSelection is set (has been assigned a value) and false otherwise */
  public boolean isSetMapSelection() {
    return this.mapSelection != null;
  }

  public void setMapSelectionIsSet(boolean value) {
    if (!value) {
      this.mapSelection = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NAME_SPACE:
      if (value == null) {
        unsetNameSpace();
      } else {
        setNameSpace((java.lang.String)value);
      }
      break;

    case MAP_PREFIX:
      if (value == null) {
        unsetMapPrefix();
      } else {
        setMapPrefix((java.lang.String)value);
      }
      break;

    case MAP_PREDICATE:
      if (value == null) {
        unsetMapPredicate();
      } else {
        setMapPredicate((java.lang.String)value);
      }
      break;

    case MAP_SELECTION:
      if (value == null) {
        unsetMapSelection();
      } else {
        setMapSelection((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME_SPACE:
      return getNameSpace();

    case MAP_PREFIX:
      return getMapPrefix();

    case MAP_PREDICATE:
      return getMapPredicate();

    case MAP_SELECTION:
      return getMapSelection();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NAME_SPACE:
      return isSetNameSpace();
    case MAP_PREFIX:
      return isSetMapPrefix();
    case MAP_PREDICATE:
      return isSetMapPredicate();
    case MAP_SELECTION:
      return isSetMapSelection();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof PropertyGetRequest)
      return this.equals((PropertyGetRequest)that);
    return false;
  }

  public boolean equals(PropertyGetRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_nameSpace = true && this.isSetNameSpace();
    boolean that_present_nameSpace = true && that.isSetNameSpace();
    if (this_present_nameSpace || that_present_nameSpace) {
      if (!(this_present_nameSpace && that_present_nameSpace))
        return false;
      if (!this.nameSpace.equals(that.nameSpace))
        return false;
    }

    boolean this_present_mapPrefix = true && this.isSetMapPrefix();
    boolean that_present_mapPrefix = true && that.isSetMapPrefix();
    if (this_present_mapPrefix || that_present_mapPrefix) {
      if (!(this_present_mapPrefix && that_present_mapPrefix))
        return false;
      if (!this.mapPrefix.equals(that.mapPrefix))
        return false;
    }

    boolean this_present_mapPredicate = true && this.isSetMapPredicate();
    boolean that_present_mapPredicate = true && that.isSetMapPredicate();
    if (this_present_mapPredicate || that_present_mapPredicate) {
      if (!(this_present_mapPredicate && that_present_mapPredicate))
        return false;
      if (!this.mapPredicate.equals(that.mapPredicate))
        return false;
    }

    boolean this_present_mapSelection = true && this.isSetMapSelection();
    boolean that_present_mapSelection = true && that.isSetMapSelection();
    if (this_present_mapSelection || that_present_mapSelection) {
      if (!(this_present_mapSelection && that_present_mapSelection))
        return false;
      if (!this.mapSelection.equals(that.mapSelection))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetNameSpace()) ? 131071 : 524287);
    if (isSetNameSpace())
      hashCode = hashCode * 8191 + nameSpace.hashCode();

    hashCode = hashCode * 8191 + ((isSetMapPrefix()) ? 131071 : 524287);
    if (isSetMapPrefix())
      hashCode = hashCode * 8191 + mapPrefix.hashCode();

    hashCode = hashCode * 8191 + ((isSetMapPredicate()) ? 131071 : 524287);
    if (isSetMapPredicate())
      hashCode = hashCode * 8191 + mapPredicate.hashCode();

    hashCode = hashCode * 8191 + ((isSetMapSelection()) ? 131071 : 524287);
    if (isSetMapSelection())
      hashCode = hashCode * 8191 + mapSelection.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(PropertyGetRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetNameSpace(), other.isSetNameSpace());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNameSpace()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nameSpace, other.nameSpace);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMapPrefix(), other.isSetMapPrefix());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMapPrefix()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mapPrefix, other.mapPrefix);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMapPredicate(), other.isSetMapPredicate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMapPredicate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mapPredicate, other.mapPredicate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMapSelection(), other.isSetMapSelection());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMapSelection()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mapSelection, other.mapSelection);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PropertyGetRequest(");
    boolean first = true;

    sb.append("nameSpace:");
    if (this.nameSpace == null) {
      sb.append("null");
    } else {
      sb.append(this.nameSpace);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mapPrefix:");
    if (this.mapPrefix == null) {
      sb.append("null");
    } else {
      sb.append(this.mapPrefix);
    }
    first = false;
    if (isSetMapPredicate()) {
      if (!first) sb.append(", ");
      sb.append("mapPredicate:");
      if (this.mapPredicate == null) {
        sb.append("null");
      } else {
        sb.append(this.mapPredicate);
      }
      first = false;
    }
    if (isSetMapSelection()) {
      if (!first) sb.append(", ");
      sb.append("mapSelection:");
      if (this.mapSelection == null) {
        sb.append("null");
      } else {
        sb.append(this.mapSelection);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetNameSpace()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nameSpace' is unset! Struct:" + toString());
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

  private static class PropertyGetRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PropertyGetRequestStandardScheme getScheme() {
      return new PropertyGetRequestStandardScheme();
    }
  }

  private static class PropertyGetRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<PropertyGetRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PropertyGetRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME_SPACE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nameSpace = iprot.readString();
              struct.setNameSpaceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MAP_PREFIX
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mapPrefix = iprot.readString();
              struct.setMapPrefixIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MAP_PREDICATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mapPredicate = iprot.readString();
              struct.setMapPredicateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MAP_SELECTION
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list76 = iprot.readListBegin();
                struct.mapSelection = new java.util.ArrayList<java.lang.String>(_list76.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem77;
                for (int _i78 = 0; _i78 < _list76.size; ++_i78)
                {
                  _elem77 = iprot.readString();
                  struct.mapSelection.add(_elem77);
                }
                iprot.readListEnd();
              }
              struct.setMapSelectionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PropertyGetRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nameSpace != null) {
        oprot.writeFieldBegin(NAME_SPACE_FIELD_DESC);
        oprot.writeString(struct.nameSpace);
        oprot.writeFieldEnd();
      }
      if (struct.mapPrefix != null) {
        oprot.writeFieldBegin(MAP_PREFIX_FIELD_DESC);
        oprot.writeString(struct.mapPrefix);
        oprot.writeFieldEnd();
      }
      if (struct.mapPredicate != null) {
        if (struct.isSetMapPredicate()) {
          oprot.writeFieldBegin(MAP_PREDICATE_FIELD_DESC);
          oprot.writeString(struct.mapPredicate);
          oprot.writeFieldEnd();
        }
      }
      if (struct.mapSelection != null) {
        if (struct.isSetMapSelection()) {
          oprot.writeFieldBegin(MAP_SELECTION_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.mapSelection.size()));
            for (java.lang.String _iter79 : struct.mapSelection)
            {
              oprot.writeString(_iter79);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PropertyGetRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PropertyGetRequestTupleScheme getScheme() {
      return new PropertyGetRequestTupleScheme();
    }
  }

  private static class PropertyGetRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<PropertyGetRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PropertyGetRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.nameSpace);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMapPrefix()) {
        optionals.set(0);
      }
      if (struct.isSetMapPredicate()) {
        optionals.set(1);
      }
      if (struct.isSetMapSelection()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetMapPrefix()) {
        oprot.writeString(struct.mapPrefix);
      }
      if (struct.isSetMapPredicate()) {
        oprot.writeString(struct.mapPredicate);
      }
      if (struct.isSetMapSelection()) {
        {
          oprot.writeI32(struct.mapSelection.size());
          for (java.lang.String _iter80 : struct.mapSelection)
          {
            oprot.writeString(_iter80);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PropertyGetRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.nameSpace = iprot.readString();
      struct.setNameSpaceIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.mapPrefix = iprot.readString();
        struct.setMapPrefixIsSet(true);
      }
      if (incoming.get(1)) {
        struct.mapPredicate = iprot.readString();
        struct.setMapPredicateIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list81 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.mapSelection = new java.util.ArrayList<java.lang.String>(_list81.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem82;
          for (int _i83 = 0; _i83 < _list81.size; ++_i83)
          {
            _elem82 = iprot.readString();
            struct.mapSelection.add(_elem82);
          }
        }
        struct.setMapSelectionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

