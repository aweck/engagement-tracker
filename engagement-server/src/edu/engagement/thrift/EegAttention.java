/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.engagement.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2013-11-11")
public class EegAttention implements org.apache.thrift.TBase<EegAttention, EegAttention._Fields>, java.io.Serializable, Cloneable, Comparable<EegAttention> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EegAttention");

  private static final org.apache.thrift.protocol.TField MILLISECOND_TIME_STAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("millisecondTimeStamp", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ATTENTION_FIELD_DESC = new org.apache.thrift.protocol.TField("attention", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EegAttentionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EegAttentionTupleSchemeFactory());
  }

  public String millisecondTimeStamp; // optional
  public int attention; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MILLISECOND_TIME_STAMP((short)1, "millisecondTimeStamp"),
    ATTENTION((short)2, "attention");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MILLISECOND_TIME_STAMP
          return MILLISECOND_TIME_STAMP;
        case 2: // ATTENTION
          return ATTENTION;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ATTENTION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.MILLISECOND_TIME_STAMP,_Fields.ATTENTION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MILLISECOND_TIME_STAMP, new org.apache.thrift.meta_data.FieldMetaData("millisecondTimeStamp", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Timestamp")));
    tmpMap.put(_Fields.ATTENTION, new org.apache.thrift.meta_data.FieldMetaData("attention", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EegAttention.class, metaDataMap);
  }

  public EegAttention() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EegAttention(EegAttention other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMillisecondTimeStamp()) {
      this.millisecondTimeStamp = other.millisecondTimeStamp;
    }
    this.attention = other.attention;
  }

  public EegAttention deepCopy() {
    return new EegAttention(this);
  }

  @Override
  public void clear() {
    this.millisecondTimeStamp = null;
    setAttentionIsSet(false);
    this.attention = 0;
  }

  public String getMillisecondTimeStamp() {
    return this.millisecondTimeStamp;
  }

  public EegAttention setMillisecondTimeStamp(String millisecondTimeStamp) {
    this.millisecondTimeStamp = millisecondTimeStamp;
    return this;
  }

  public void unsetMillisecondTimeStamp() {
    this.millisecondTimeStamp = null;
  }

  /** Returns true if field millisecondTimeStamp is set (has been assigned a value) and false otherwise */
  public boolean isSetMillisecondTimeStamp() {
    return this.millisecondTimeStamp != null;
  }

  public void setMillisecondTimeStampIsSet(boolean value) {
    if (!value) {
      this.millisecondTimeStamp = null;
    }
  }

  public int getAttention() {
    return this.attention;
  }

  public EegAttention setAttention(int attention) {
    this.attention = attention;
    setAttentionIsSet(true);
    return this;
  }

  public void unsetAttention() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ATTENTION_ISSET_ID);
  }

  /** Returns true if field attention is set (has been assigned a value) and false otherwise */
  public boolean isSetAttention() {
    return EncodingUtils.testBit(__isset_bitfield, __ATTENTION_ISSET_ID);
  }

  public void setAttentionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ATTENTION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MILLISECOND_TIME_STAMP:
      if (value == null) {
        unsetMillisecondTimeStamp();
      } else {
        setMillisecondTimeStamp((String)value);
      }
      break;

    case ATTENTION:
      if (value == null) {
        unsetAttention();
      } else {
        setAttention((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MILLISECOND_TIME_STAMP:
      return getMillisecondTimeStamp();

    case ATTENTION:
      return Integer.valueOf(getAttention());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MILLISECOND_TIME_STAMP:
      return isSetMillisecondTimeStamp();
    case ATTENTION:
      return isSetAttention();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EegAttention)
      return this.equals((EegAttention)that);
    return false;
  }

  public boolean equals(EegAttention that) {
    if (that == null)
      return false;

    boolean this_present_millisecondTimeStamp = true && this.isSetMillisecondTimeStamp();
    boolean that_present_millisecondTimeStamp = true && that.isSetMillisecondTimeStamp();
    if (this_present_millisecondTimeStamp || that_present_millisecondTimeStamp) {
      if (!(this_present_millisecondTimeStamp && that_present_millisecondTimeStamp))
        return false;
      if (!this.millisecondTimeStamp.equals(that.millisecondTimeStamp))
        return false;
    }

    boolean this_present_attention = true && this.isSetAttention();
    boolean that_present_attention = true && that.isSetAttention();
    if (this_present_attention || that_present_attention) {
      if (!(this_present_attention && that_present_attention))
        return false;
      if (this.attention != that.attention)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(EegAttention other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMillisecondTimeStamp()).compareTo(other.isSetMillisecondTimeStamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMillisecondTimeStamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.millisecondTimeStamp, other.millisecondTimeStamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAttention()).compareTo(other.isSetAttention());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttention()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.attention, other.attention);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("EegAttention(");
    boolean first = true;

    if (isSetMillisecondTimeStamp()) {
      sb.append("millisecondTimeStamp:");
      if (this.millisecondTimeStamp == null) {
        sb.append("null");
      } else {
        sb.append(this.millisecondTimeStamp);
      }
      first = false;
    }
    if (isSetAttention()) {
      if (!first) sb.append(", ");
      sb.append("attention:");
      sb.append(this.attention);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EegAttentionStandardSchemeFactory implements SchemeFactory {
    public EegAttentionStandardScheme getScheme() {
      return new EegAttentionStandardScheme();
    }
  }

  private static class EegAttentionStandardScheme extends StandardScheme<EegAttention> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EegAttention struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MILLISECOND_TIME_STAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.millisecondTimeStamp = iprot.readString();
              struct.setMillisecondTimeStampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ATTENTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.attention = iprot.readI32();
              struct.setAttentionIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, EegAttention struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.millisecondTimeStamp != null) {
        if (struct.isSetMillisecondTimeStamp()) {
          oprot.writeFieldBegin(MILLISECOND_TIME_STAMP_FIELD_DESC);
          oprot.writeString(struct.millisecondTimeStamp);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetAttention()) {
        oprot.writeFieldBegin(ATTENTION_FIELD_DESC);
        oprot.writeI32(struct.attention);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EegAttentionTupleSchemeFactory implements SchemeFactory {
    public EegAttentionTupleScheme getScheme() {
      return new EegAttentionTupleScheme();
    }
  }

  private static class EegAttentionTupleScheme extends TupleScheme<EegAttention> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EegAttention struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMillisecondTimeStamp()) {
        optionals.set(0);
      }
      if (struct.isSetAttention()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMillisecondTimeStamp()) {
        oprot.writeString(struct.millisecondTimeStamp);
      }
      if (struct.isSetAttention()) {
        oprot.writeI32(struct.attention);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EegAttention struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.millisecondTimeStamp = iprot.readString();
        struct.setMillisecondTimeStampIsSet(true);
      }
      if (incoming.get(1)) {
        struct.attention = iprot.readI32();
        struct.setAttentionIsSet(true);
      }
    }
  }

}

