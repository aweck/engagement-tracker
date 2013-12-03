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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HeartRate implements org.apache.thrift.TBase<HeartRate, HeartRate._Fields>, java.io.Serializable, Cloneable, Comparable<HeartRate> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HeartRate");

  private static final org.apache.thrift.protocol.TField MILLSECOND_TIME_STAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("millsecondTimeStamp", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField BPM_FIELD_DESC = new org.apache.thrift.protocol.TField("bpm", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HeartRateStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HeartRateTupleSchemeFactory());
  }

  public String millsecondTimeStamp; // optional
  public int bpm; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MILLSECOND_TIME_STAMP((short)1, "millsecondTimeStamp"),
    BPM((short)2, "bpm");

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
        case 1: // MILLSECOND_TIME_STAMP
          return MILLSECOND_TIME_STAMP;
        case 2: // BPM
          return BPM;
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
  private static final int __BPM_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.MILLSECOND_TIME_STAMP,_Fields.BPM};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MILLSECOND_TIME_STAMP, new org.apache.thrift.meta_data.FieldMetaData("millsecondTimeStamp", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Timestamp")));
    tmpMap.put(_Fields.BPM, new org.apache.thrift.meta_data.FieldMetaData("bpm", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HeartRate.class, metaDataMap);
  }

  public HeartRate() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HeartRate(HeartRate other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMillsecondTimeStamp()) {
      this.millsecondTimeStamp = other.millsecondTimeStamp;
    }
    this.bpm = other.bpm;
  }

  public HeartRate deepCopy() {
    return new HeartRate(this);
  }

  @Override
  public void clear() {
    this.millsecondTimeStamp = null;
    setBpmIsSet(false);
    this.bpm = 0;
  }

  public String getMillsecondTimeStamp() {
    return this.millsecondTimeStamp;
  }

  public HeartRate setMillsecondTimeStamp(String millsecondTimeStamp) {
    this.millsecondTimeStamp = millsecondTimeStamp;
    return this;
  }

  public void unsetMillsecondTimeStamp() {
    this.millsecondTimeStamp = null;
  }

  /** Returns true if field millsecondTimeStamp is set (has been assigned a value) and false otherwise */
  public boolean isSetMillsecondTimeStamp() {
    return this.millsecondTimeStamp != null;
  }

  public void setMillsecondTimeStampIsSet(boolean value) {
    if (!value) {
      this.millsecondTimeStamp = null;
    }
  }

  public int getBpm() {
    return this.bpm;
  }

  public HeartRate setBpm(int bpm) {
    this.bpm = bpm;
    setBpmIsSet(true);
    return this;
  }

  public void unsetBpm() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BPM_ISSET_ID);
  }

  /** Returns true if field bpm is set (has been assigned a value) and false otherwise */
  public boolean isSetBpm() {
    return EncodingUtils.testBit(__isset_bitfield, __BPM_ISSET_ID);
  }

  public void setBpmIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BPM_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MILLSECOND_TIME_STAMP:
      if (value == null) {
        unsetMillsecondTimeStamp();
      } else {
        setMillsecondTimeStamp((String)value);
      }
      break;

    case BPM:
      if (value == null) {
        unsetBpm();
      } else {
        setBpm((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MILLSECOND_TIME_STAMP:
      return getMillsecondTimeStamp();

    case BPM:
      return Integer.valueOf(getBpm());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MILLSECOND_TIME_STAMP:
      return isSetMillsecondTimeStamp();
    case BPM:
      return isSetBpm();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HeartRate)
      return this.equals((HeartRate)that);
    return false;
  }

  public boolean equals(HeartRate that) {
    if (that == null)
      return false;

    boolean this_present_millsecondTimeStamp = true && this.isSetMillsecondTimeStamp();
    boolean that_present_millsecondTimeStamp = true && that.isSetMillsecondTimeStamp();
    if (this_present_millsecondTimeStamp || that_present_millsecondTimeStamp) {
      if (!(this_present_millsecondTimeStamp && that_present_millsecondTimeStamp))
        return false;
      if (!this.millsecondTimeStamp.equals(that.millsecondTimeStamp))
        return false;
    }

    boolean this_present_bpm = true && this.isSetBpm();
    boolean that_present_bpm = true && that.isSetBpm();
    if (this_present_bpm || that_present_bpm) {
      if (!(this_present_bpm && that_present_bpm))
        return false;
      if (this.bpm != that.bpm)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(HeartRate other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMillsecondTimeStamp()).compareTo(other.isSetMillsecondTimeStamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMillsecondTimeStamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.millsecondTimeStamp, other.millsecondTimeStamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBpm()).compareTo(other.isSetBpm());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBpm()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bpm, other.bpm);
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
    StringBuilder sb = new StringBuilder("HeartRate(");
    boolean first = true;

    if (isSetMillsecondTimeStamp()) {
      sb.append("millsecondTimeStamp:");
      if (this.millsecondTimeStamp == null) {
        sb.append("null");
      } else {
        sb.append(this.millsecondTimeStamp);
      }
      first = false;
    }
    if (isSetBpm()) {
      if (!first) sb.append(", ");
      sb.append("bpm:");
      sb.append(this.bpm);
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

  private static class HeartRateStandardSchemeFactory implements SchemeFactory {
    public HeartRateStandardScheme getScheme() {
      return new HeartRateStandardScheme();
    }
  }

  private static class HeartRateStandardScheme extends StandardScheme<HeartRate> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HeartRate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MILLSECOND_TIME_STAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.millsecondTimeStamp = iprot.readString();
              struct.setMillsecondTimeStampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BPM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.bpm = iprot.readI32();
              struct.setBpmIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HeartRate struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.millsecondTimeStamp != null) {
        if (struct.isSetMillsecondTimeStamp()) {
          oprot.writeFieldBegin(MILLSECOND_TIME_STAMP_FIELD_DESC);
          oprot.writeString(struct.millsecondTimeStamp);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetBpm()) {
        oprot.writeFieldBegin(BPM_FIELD_DESC);
        oprot.writeI32(struct.bpm);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HeartRateTupleSchemeFactory implements SchemeFactory {
    public HeartRateTupleScheme getScheme() {
      return new HeartRateTupleScheme();
    }
  }

  private static class HeartRateTupleScheme extends TupleScheme<HeartRate> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HeartRate struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMillsecondTimeStamp()) {
        optionals.set(0);
      }
      if (struct.isSetBpm()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMillsecondTimeStamp()) {
        oprot.writeString(struct.millsecondTimeStamp);
      }
      if (struct.isSetBpm()) {
        oprot.writeI32(struct.bpm);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HeartRate struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.millsecondTimeStamp = iprot.readString();
        struct.setMillsecondTimeStampIsSet(true);
      }
      if (incoming.get(1)) {
        struct.bpm = iprot.readI32();
        struct.setBpmIsSet(true);
      }
    }
  }

}

