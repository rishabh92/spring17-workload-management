/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.cloud.aurora.client.sdk;

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

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Result of the getJobUpdateSummaries call.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-10-21")
public class GetJobUpdateSummariesResult implements org.apache.thrift.TBase<GetJobUpdateSummariesResult, GetJobUpdateSummariesResult._Fields>, java.io.Serializable, Cloneable, Comparable<GetJobUpdateSummariesResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetJobUpdateSummariesResult");

  private static final org.apache.thrift.protocol.TField UPDATE_SUMMARIES_FIELD_DESC = new org.apache.thrift.protocol.TField("updateSummaries", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetJobUpdateSummariesResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetJobUpdateSummariesResultTupleSchemeFactory());
  }

  public List<JobUpdateSummary> updateSummaries; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UPDATE_SUMMARIES((short)1, "updateSummaries");

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
        case 1: // UPDATE_SUMMARIES
          return UPDATE_SUMMARIES;
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
    tmpMap.put(_Fields.UPDATE_SUMMARIES, new org.apache.thrift.meta_data.FieldMetaData("updateSummaries", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JobUpdateSummary.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetJobUpdateSummariesResult.class, metaDataMap);
  }

  public GetJobUpdateSummariesResult() {
  }

  public GetJobUpdateSummariesResult(
    List<JobUpdateSummary> updateSummaries)
  {
    this();
    this.updateSummaries = updateSummaries;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetJobUpdateSummariesResult(GetJobUpdateSummariesResult other) {
    if (other.isSetUpdateSummaries()) {
      List<JobUpdateSummary> __this__updateSummaries = new ArrayList<JobUpdateSummary>(other.updateSummaries.size());
      for (JobUpdateSummary other_element : other.updateSummaries) {
        __this__updateSummaries.add(new JobUpdateSummary(other_element));
      }
      this.updateSummaries = __this__updateSummaries;
    }
  }

  public GetJobUpdateSummariesResult deepCopy() {
    return new GetJobUpdateSummariesResult(this);
  }

  @Override
  public void clear() {
    this.updateSummaries = null;
  }

  public int getUpdateSummariesSize() {
    return (this.updateSummaries == null) ? 0 : this.updateSummaries.size();
  }

  public java.util.Iterator<JobUpdateSummary> getUpdateSummariesIterator() {
    return (this.updateSummaries == null) ? null : this.updateSummaries.iterator();
  }

  public void addToUpdateSummaries(JobUpdateSummary elem) {
    if (this.updateSummaries == null) {
      this.updateSummaries = new ArrayList<JobUpdateSummary>();
    }
    this.updateSummaries.add(elem);
  }

  public List<JobUpdateSummary> getUpdateSummaries() {
    return this.updateSummaries;
  }

  public GetJobUpdateSummariesResult setUpdateSummaries(List<JobUpdateSummary> updateSummaries) {
    this.updateSummaries = updateSummaries;
    return this;
  }

  public void unsetUpdateSummaries() {
    this.updateSummaries = null;
  }

  /** Returns true if field updateSummaries is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdateSummaries() {
    return this.updateSummaries != null;
  }

  public void setUpdateSummariesIsSet(boolean value) {
    if (!value) {
      this.updateSummaries = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UPDATE_SUMMARIES:
      if (value == null) {
        unsetUpdateSummaries();
      } else {
        setUpdateSummaries((List<JobUpdateSummary>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UPDATE_SUMMARIES:
      return getUpdateSummaries();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UPDATE_SUMMARIES:
      return isSetUpdateSummaries();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetJobUpdateSummariesResult)
      return this.equals((GetJobUpdateSummariesResult)that);
    return false;
  }

  public boolean equals(GetJobUpdateSummariesResult that) {
    if (that == null)
      return false;

    boolean this_present_updateSummaries = true && this.isSetUpdateSummaries();
    boolean that_present_updateSummaries = true && that.isSetUpdateSummaries();
    if (this_present_updateSummaries || that_present_updateSummaries) {
      if (!(this_present_updateSummaries && that_present_updateSummaries))
        return false;
      if (!this.updateSummaries.equals(that.updateSummaries))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_updateSummaries = true && (isSetUpdateSummaries());
    list.add(present_updateSummaries);
    if (present_updateSummaries)
      list.add(updateSummaries);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetJobUpdateSummariesResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUpdateSummaries()).compareTo(other.isSetUpdateSummaries());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdateSummaries()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updateSummaries, other.updateSummaries);
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
    StringBuilder sb = new StringBuilder("GetJobUpdateSummariesResult(");
    boolean first = true;

    sb.append("updateSummaries:");
    if (this.updateSummaries == null) {
      sb.append("null");
    } else {
      sb.append(this.updateSummaries);
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

  private static class GetJobUpdateSummariesResultStandardSchemeFactory implements SchemeFactory {
    public GetJobUpdateSummariesResultStandardScheme getScheme() {
      return new GetJobUpdateSummariesResultStandardScheme();
    }
  }

  private static class GetJobUpdateSummariesResultStandardScheme extends StandardScheme<GetJobUpdateSummariesResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetJobUpdateSummariesResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UPDATE_SUMMARIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list326 = iprot.readListBegin();
                struct.updateSummaries = new ArrayList<JobUpdateSummary>(_list326.size);
                JobUpdateSummary _elem327;
                for (int _i328 = 0; _i328 < _list326.size; ++_i328)
                {
                  _elem327 = new JobUpdateSummary();
                  _elem327.read(iprot);
                  struct.updateSummaries.add(_elem327);
                }
                iprot.readListEnd();
              }
              struct.setUpdateSummariesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetJobUpdateSummariesResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.updateSummaries != null) {
        oprot.writeFieldBegin(UPDATE_SUMMARIES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.updateSummaries.size()));
          for (JobUpdateSummary _iter329 : struct.updateSummaries)
          {
            _iter329.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetJobUpdateSummariesResultTupleSchemeFactory implements SchemeFactory {
    public GetJobUpdateSummariesResultTupleScheme getScheme() {
      return new GetJobUpdateSummariesResultTupleScheme();
    }
  }

  private static class GetJobUpdateSummariesResultTupleScheme extends TupleScheme<GetJobUpdateSummariesResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetJobUpdateSummariesResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUpdateSummaries()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetUpdateSummaries()) {
        {
          oprot.writeI32(struct.updateSummaries.size());
          for (JobUpdateSummary _iter330 : struct.updateSummaries)
          {
            _iter330.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetJobUpdateSummariesResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list331 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.updateSummaries = new ArrayList<JobUpdateSummary>(_list331.size);
          JobUpdateSummary _elem332;
          for (int _i333 = 0; _i333 < _list331.size; ++_i333)
          {
            _elem332 = new JobUpdateSummary();
            _elem332.read(iprot);
            struct.updateSummaries.add(_elem332);
          }
        }
        struct.setUpdateSummariesIsSet(true);
      }
    }
  }

}

