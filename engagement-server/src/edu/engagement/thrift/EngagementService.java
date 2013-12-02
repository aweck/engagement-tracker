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
public class EngagementService {

  public interface Iface {

    public void syncEngagementInformation(EngagementInformation info) throws EngagementServiceUnavailable, org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void syncEngagementInformation(EngagementInformation info, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public void syncEngagementInformation(EngagementInformation info) throws EngagementServiceUnavailable, org.apache.thrift.TException
    {
      send_syncEngagementInformation(info);
      recv_syncEngagementInformation();
    }

    public void send_syncEngagementInformation(EngagementInformation info) throws org.apache.thrift.TException
    {
      syncEngagementInformation_args args = new syncEngagementInformation_args();
      args.setInfo(info);
      sendBase("syncEngagementInformation", args);
    }

    public void recv_syncEngagementInformation() throws EngagementServiceUnavailable, org.apache.thrift.TException
    {
      syncEngagementInformation_result result = new syncEngagementInformation_result();
      receiveBase(result, "syncEngagementInformation");
      if (result.unavailable != null) {
        throw result.unavailable;
      }
      return;
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void syncEngagementInformation(EngagementInformation info, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException {
      checkReady();
      syncEngagementInformation_call method_call = new syncEngagementInformation_call(info, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class syncEngagementInformation_call extends org.apache.thrift.async.TAsyncMethodCall {
      private EngagementInformation info;
      public syncEngagementInformation_call(EngagementInformation info, org.apache.thrift.async.AsyncMethodCallback resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.info = info;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("syncEngagementInformation", org.apache.thrift.protocol.TMessageType.CALL, 0));
        syncEngagementInformation_args args = new syncEngagementInformation_args();
        args.setInfo(info);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public void getResult() throws EngagementServiceUnavailable, org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        (new Client(prot)).recv_syncEngagementInformation();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("syncEngagementInformation", new syncEngagementInformation());
      return processMap;
    }

    public static class syncEngagementInformation<I extends Iface> extends org.apache.thrift.ProcessFunction<I, syncEngagementInformation_args> {
      public syncEngagementInformation() {
        super("syncEngagementInformation");
      }

      public syncEngagementInformation_args getEmptyArgsInstance() {
        return new syncEngagementInformation_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public syncEngagementInformation_result getResult(I iface, syncEngagementInformation_args args) throws org.apache.thrift.TException {
        syncEngagementInformation_result result = new syncEngagementInformation_result();
        try {
          iface.syncEngagementInformation(args.info);
        } catch (EngagementServiceUnavailable unavailable) {
          result.unavailable = unavailable;
        }
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("syncEngagementInformation", new syncEngagementInformation());
      return processMap;
    }

    public static class syncEngagementInformation<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, syncEngagementInformation_args, Void> {
      public syncEngagementInformation() {
        super("syncEngagementInformation");
      }

      public syncEngagementInformation_args getEmptyArgsInstance() {
        return new syncEngagementInformation_args();
      }

      public AsyncMethodCallback<Void> getResultHandler(final AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new AsyncMethodCallback<Void>() { 
          public void onComplete(Void o) {
            syncEngagementInformation_result result = new syncEngagementInformation_result();
            try {
              fcall.sendResponse(fb,result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
              return;
            } catch (Exception e) {
              LOGGER.error("Exception writing to internal frame buffer", e);
            }
            fb.close();
          }
          public void onError(Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TBase msg;
            syncEngagementInformation_result result = new syncEngagementInformation_result();
            if (e instanceof EngagementServiceUnavailable) {
                        result.unavailable = (EngagementServiceUnavailable) e;
                        result.setUnavailableIsSet(true);
                        msg = result;
            }
             else 
            {
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TBase)new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
              return;
            } catch (Exception ex) {
              LOGGER.error("Exception writing to internal frame buffer", ex);
            }
            fb.close();
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, syncEngagementInformation_args args, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler) throws TException {
        iface.syncEngagementInformation(args.info,resultHandler);
      }
    }

  }

  public static class syncEngagementInformation_args implements org.apache.thrift.TBase<syncEngagementInformation_args, syncEngagementInformation_args._Fields>, java.io.Serializable, Cloneable, Comparable<syncEngagementInformation_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("syncEngagementInformation_args");

    private static final org.apache.thrift.protocol.TField INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("info", org.apache.thrift.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new syncEngagementInformation_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new syncEngagementInformation_argsTupleSchemeFactory());
    }

    public EngagementInformation info; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      INFO((short)1, "info");

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
          case 1: // INFO
            return INFO;
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
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.INFO, new org.apache.thrift.meta_data.FieldMetaData("info", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, EngagementInformation.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(syncEngagementInformation_args.class, metaDataMap);
    }

    public syncEngagementInformation_args() {
    }

    public syncEngagementInformation_args(
      EngagementInformation info)
    {
      this();
      this.info = info;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public syncEngagementInformation_args(syncEngagementInformation_args other) {
      if (other.isSetInfo()) {
        this.info = new EngagementInformation(other.info);
      }
    }

    public syncEngagementInformation_args deepCopy() {
      return new syncEngagementInformation_args(this);
    }

    @Override
    public void clear() {
      this.info = null;
    }

    public EngagementInformation getInfo() {
      return this.info;
    }

    public syncEngagementInformation_args setInfo(EngagementInformation info) {
      this.info = info;
      return this;
    }

    public void unsetInfo() {
      this.info = null;
    }

    /** Returns true if field info is set (has been assigned a value) and false otherwise */
    public boolean isSetInfo() {
      return this.info != null;
    }

    public void setInfoIsSet(boolean value) {
      if (!value) {
        this.info = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case INFO:
        if (value == null) {
          unsetInfo();
        } else {
          setInfo((EngagementInformation)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case INFO:
        return getInfo();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case INFO:
        return isSetInfo();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof syncEngagementInformation_args)
        return this.equals((syncEngagementInformation_args)that);
      return false;
    }

    public boolean equals(syncEngagementInformation_args that) {
      if (that == null)
        return false;

      boolean this_present_info = true && this.isSetInfo();
      boolean that_present_info = true && that.isSetInfo();
      if (this_present_info || that_present_info) {
        if (!(this_present_info && that_present_info))
          return false;
        if (!this.info.equals(that.info))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    @Override
    public int compareTo(syncEngagementInformation_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetInfo()).compareTo(other.isSetInfo());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetInfo()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.info, other.info);
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
      StringBuilder sb = new StringBuilder("syncEngagementInformation_args(");
      boolean first = true;

      sb.append("info:");
      if (this.info == null) {
        sb.append("null");
      } else {
        sb.append(this.info);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (info != null) {
        info.validate();
      }
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
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class syncEngagementInformation_argsStandardSchemeFactory implements SchemeFactory {
      public syncEngagementInformation_argsStandardScheme getScheme() {
        return new syncEngagementInformation_argsStandardScheme();
      }
    }

    private static class syncEngagementInformation_argsStandardScheme extends StandardScheme<syncEngagementInformation_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, syncEngagementInformation_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // INFO
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.info = new EngagementInformation();
                struct.info.read(iprot);
                struct.setInfoIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, syncEngagementInformation_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.info != null) {
          oprot.writeFieldBegin(INFO_FIELD_DESC);
          struct.info.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class syncEngagementInformation_argsTupleSchemeFactory implements SchemeFactory {
      public syncEngagementInformation_argsTupleScheme getScheme() {
        return new syncEngagementInformation_argsTupleScheme();
      }
    }

    private static class syncEngagementInformation_argsTupleScheme extends TupleScheme<syncEngagementInformation_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, syncEngagementInformation_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetInfo()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetInfo()) {
          struct.info.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, syncEngagementInformation_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.info = new EngagementInformation();
          struct.info.read(iprot);
          struct.setInfoIsSet(true);
        }
      }
    }

  }

  public static class syncEngagementInformation_result implements org.apache.thrift.TBase<syncEngagementInformation_result, syncEngagementInformation_result._Fields>, java.io.Serializable, Cloneable, Comparable<syncEngagementInformation_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("syncEngagementInformation_result");

    private static final org.apache.thrift.protocol.TField UNAVAILABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("unavailable", org.apache.thrift.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new syncEngagementInformation_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new syncEngagementInformation_resultTupleSchemeFactory());
    }

    public EngagementServiceUnavailable unavailable; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      UNAVAILABLE((short)1, "unavailable");

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
          case 1: // UNAVAILABLE
            return UNAVAILABLE;
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
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.UNAVAILABLE, new org.apache.thrift.meta_data.FieldMetaData("unavailable", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(syncEngagementInformation_result.class, metaDataMap);
    }

    public syncEngagementInformation_result() {
    }

    public syncEngagementInformation_result(
      EngagementServiceUnavailable unavailable)
    {
      this();
      this.unavailable = unavailable;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public syncEngagementInformation_result(syncEngagementInformation_result other) {
      if (other.isSetUnavailable()) {
        this.unavailable = new EngagementServiceUnavailable(other.unavailable);
      }
    }

    public syncEngagementInformation_result deepCopy() {
      return new syncEngagementInformation_result(this);
    }

    @Override
    public void clear() {
      this.unavailable = null;
    }

    public EngagementServiceUnavailable getUnavailable() {
      return this.unavailable;
    }

    public syncEngagementInformation_result setUnavailable(EngagementServiceUnavailable unavailable) {
      this.unavailable = unavailable;
      return this;
    }

    public void unsetUnavailable() {
      this.unavailable = null;
    }

    /** Returns true if field unavailable is set (has been assigned a value) and false otherwise */
    public boolean isSetUnavailable() {
      return this.unavailable != null;
    }

    public void setUnavailableIsSet(boolean value) {
      if (!value) {
        this.unavailable = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case UNAVAILABLE:
        if (value == null) {
          unsetUnavailable();
        } else {
          setUnavailable((EngagementServiceUnavailable)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case UNAVAILABLE:
        return getUnavailable();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case UNAVAILABLE:
        return isSetUnavailable();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof syncEngagementInformation_result)
        return this.equals((syncEngagementInformation_result)that);
      return false;
    }

    public boolean equals(syncEngagementInformation_result that) {
      if (that == null)
        return false;

      boolean this_present_unavailable = true && this.isSetUnavailable();
      boolean that_present_unavailable = true && that.isSetUnavailable();
      if (this_present_unavailable || that_present_unavailable) {
        if (!(this_present_unavailable && that_present_unavailable))
          return false;
        if (!this.unavailable.equals(that.unavailable))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    @Override
    public int compareTo(syncEngagementInformation_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetUnavailable()).compareTo(other.isSetUnavailable());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetUnavailable()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unavailable, other.unavailable);
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
      StringBuilder sb = new StringBuilder("syncEngagementInformation_result(");
      boolean first = true;

      sb.append("unavailable:");
      if (this.unavailable == null) {
        sb.append("null");
      } else {
        sb.append(this.unavailable);
      }
      first = false;
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
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class syncEngagementInformation_resultStandardSchemeFactory implements SchemeFactory {
      public syncEngagementInformation_resultStandardScheme getScheme() {
        return new syncEngagementInformation_resultStandardScheme();
      }
    }

    private static class syncEngagementInformation_resultStandardScheme extends StandardScheme<syncEngagementInformation_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, syncEngagementInformation_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // UNAVAILABLE
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.unavailable = new EngagementServiceUnavailable();
                struct.unavailable.read(iprot);
                struct.setUnavailableIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, syncEngagementInformation_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.unavailable != null) {
          oprot.writeFieldBegin(UNAVAILABLE_FIELD_DESC);
          struct.unavailable.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class syncEngagementInformation_resultTupleSchemeFactory implements SchemeFactory {
      public syncEngagementInformation_resultTupleScheme getScheme() {
        return new syncEngagementInformation_resultTupleScheme();
      }
    }

    private static class syncEngagementInformation_resultTupleScheme extends TupleScheme<syncEngagementInformation_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, syncEngagementInformation_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetUnavailable()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetUnavailable()) {
          struct.unavailable.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, syncEngagementInformation_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.unavailable = new EngagementServiceUnavailable();
          struct.unavailable.read(iprot);
          struct.setUnavailableIsSet(true);
        }
      }
    }

  }

}
