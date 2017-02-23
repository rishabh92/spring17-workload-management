/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.sga.commons.model;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-02-22")
public class Experiment implements org.apache.thrift.TBase<Experiment, Experiment._Fields>, java.io.Serializable, Cloneable, Comparable<Experiment> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Experiment");

  private static final org.apache.thrift.protocol.TField EXPERIMENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("experimentId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField WORKING_DIR_FIELD_DESC = new org.apache.thrift.protocol.TField("workingDir", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NUM_CPU_FIELD_DESC = new org.apache.thrift.protocol.TField("numCPU", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField DISK_MB_FIELD_DESC = new org.apache.thrift.protocol.TField("diskMB", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField RAM_MB_FIELD_DESC = new org.apache.thrift.protocol.TField("ramMB", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ExperimentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ExperimentTupleSchemeFactory());
  }

  public String experimentId; // required
  public String workingDir; // optional
  public double numCPU; // required
  public long diskMB; // required
  public long ramMB; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXPERIMENT_ID((short)1, "experimentId"),
    WORKING_DIR((short)2, "workingDir"),
    NUM_CPU((short)3, "numCPU"),
    DISK_MB((short)4, "diskMB"),
    RAM_MB((short)5, "ramMB");

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
        case 1: // EXPERIMENT_ID
          return EXPERIMENT_ID;
        case 2: // WORKING_DIR
          return WORKING_DIR;
        case 3: // NUM_CPU
          return NUM_CPU;
        case 4: // DISK_MB
          return DISK_MB;
        case 5: // RAM_MB
          return RAM_MB;
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
  private static final int __NUMCPU_ISSET_ID = 0;
  private static final int __DISKMB_ISSET_ID = 1;
  private static final int __RAMMB_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.WORKING_DIR};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXPERIMENT_ID, new org.apache.thrift.meta_data.FieldMetaData("experimentId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WORKING_DIR, new org.apache.thrift.meta_data.FieldMetaData("workingDir", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NUM_CPU, new org.apache.thrift.meta_data.FieldMetaData("numCPU", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.DISK_MB, new org.apache.thrift.meta_data.FieldMetaData("diskMB", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "long")));
    tmpMap.put(_Fields.RAM_MB, new org.apache.thrift.meta_data.FieldMetaData("ramMB", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "long")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Experiment.class, metaDataMap);
  }

  public Experiment() {
    this.numCPU = 0.2;

    this.diskMB = 10L;

    this.ramMB = 128L;

  }

  public Experiment(
    String experimentId,
    double numCPU,
    long diskMB,
    long ramMB)
  {
    this();
    this.experimentId = experimentId;
    this.numCPU = numCPU;
    setNumCPUIsSet(true);
    this.diskMB = diskMB;
    setDiskMBIsSet(true);
    this.ramMB = ramMB;
    setRamMBIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Experiment(Experiment other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetExperimentId()) {
      this.experimentId = other.experimentId;
    }
    if (other.isSetWorkingDir()) {
      this.workingDir = other.workingDir;
    }
    this.numCPU = other.numCPU;
    this.diskMB = other.diskMB;
    this.ramMB = other.ramMB;
  }

  public Experiment deepCopy() {
    return new Experiment(this);
  }

  @Override
  public void clear() {
    this.experimentId = null;
    this.workingDir = null;
    this.numCPU = 0.2;

    this.diskMB = 10L;

    this.ramMB = 128L;

  }

  public String getExperimentId() {
    return this.experimentId;
  }

  public Experiment setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public void unsetExperimentId() {
    this.experimentId = null;
  }

  /** Returns true if field experimentId is set (has been assigned a value) and false otherwise */
  public boolean isSetExperimentId() {
    return this.experimentId != null;
  }

  public void setExperimentIdIsSet(boolean value) {
    if (!value) {
      this.experimentId = null;
    }
  }

  public String getWorkingDir() {
    return this.workingDir;
  }

  public Experiment setWorkingDir(String workingDir) {
    this.workingDir = workingDir;
    return this;
  }

  public void unsetWorkingDir() {
    this.workingDir = null;
  }

  /** Returns true if field workingDir is set (has been assigned a value) and false otherwise */
  public boolean isSetWorkingDir() {
    return this.workingDir != null;
  }

  public void setWorkingDirIsSet(boolean value) {
    if (!value) {
      this.workingDir = null;
    }
  }

  public double getNumCPU() {
    return this.numCPU;
  }

  public Experiment setNumCPU(double numCPU) {
    this.numCPU = numCPU;
    setNumCPUIsSet(true);
    return this;
  }

  public void unsetNumCPU() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUMCPU_ISSET_ID);
  }

  /** Returns true if field numCPU is set (has been assigned a value) and false otherwise */
  public boolean isSetNumCPU() {
    return EncodingUtils.testBit(__isset_bitfield, __NUMCPU_ISSET_ID);
  }

  public void setNumCPUIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUMCPU_ISSET_ID, value);
  }

  public long getDiskMB() {
    return this.diskMB;
  }

  public Experiment setDiskMB(long diskMB) {
    this.diskMB = diskMB;
    setDiskMBIsSet(true);
    return this;
  }

  public void unsetDiskMB() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DISKMB_ISSET_ID);
  }

  /** Returns true if field diskMB is set (has been assigned a value) and false otherwise */
  public boolean isSetDiskMB() {
    return EncodingUtils.testBit(__isset_bitfield, __DISKMB_ISSET_ID);
  }

  public void setDiskMBIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DISKMB_ISSET_ID, value);
  }

  public long getRamMB() {
    return this.ramMB;
  }

  public Experiment setRamMB(long ramMB) {
    this.ramMB = ramMB;
    setRamMBIsSet(true);
    return this;
  }

  public void unsetRamMB() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RAMMB_ISSET_ID);
  }

  /** Returns true if field ramMB is set (has been assigned a value) and false otherwise */
  public boolean isSetRamMB() {
    return EncodingUtils.testBit(__isset_bitfield, __RAMMB_ISSET_ID);
  }

  public void setRamMBIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RAMMB_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXPERIMENT_ID:
      if (value == null) {
        unsetExperimentId();
      } else {
        setExperimentId((String)value);
      }
      break;

    case WORKING_DIR:
      if (value == null) {
        unsetWorkingDir();
      } else {
        setWorkingDir((String)value);
      }
      break;

    case NUM_CPU:
      if (value == null) {
        unsetNumCPU();
      } else {
        setNumCPU((Double)value);
      }
      break;

    case DISK_MB:
      if (value == null) {
        unsetDiskMB();
      } else {
        setDiskMB((Long)value);
      }
      break;

    case RAM_MB:
      if (value == null) {
        unsetRamMB();
      } else {
        setRamMB((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXPERIMENT_ID:
      return getExperimentId();

    case WORKING_DIR:
      return getWorkingDir();

    case NUM_CPU:
      return getNumCPU();

    case DISK_MB:
      return getDiskMB();

    case RAM_MB:
      return getRamMB();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXPERIMENT_ID:
      return isSetExperimentId();
    case WORKING_DIR:
      return isSetWorkingDir();
    case NUM_CPU:
      return isSetNumCPU();
    case DISK_MB:
      return isSetDiskMB();
    case RAM_MB:
      return isSetRamMB();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Experiment)
      return this.equals((Experiment)that);
    return false;
  }

  public boolean equals(Experiment that) {
    if (that == null)
      return false;

    boolean this_present_experimentId = true && this.isSetExperimentId();
    boolean that_present_experimentId = true && that.isSetExperimentId();
    if (this_present_experimentId || that_present_experimentId) {
      if (!(this_present_experimentId && that_present_experimentId))
        return false;
      if (!this.experimentId.equals(that.experimentId))
        return false;
    }

    boolean this_present_workingDir = true && this.isSetWorkingDir();
    boolean that_present_workingDir = true && that.isSetWorkingDir();
    if (this_present_workingDir || that_present_workingDir) {
      if (!(this_present_workingDir && that_present_workingDir))
        return false;
      if (!this.workingDir.equals(that.workingDir))
        return false;
    }

    boolean this_present_numCPU = true;
    boolean that_present_numCPU = true;
    if (this_present_numCPU || that_present_numCPU) {
      if (!(this_present_numCPU && that_present_numCPU))
        return false;
      if (this.numCPU != that.numCPU)
        return false;
    }

    boolean this_present_diskMB = true;
    boolean that_present_diskMB = true;
    if (this_present_diskMB || that_present_diskMB) {
      if (!(this_present_diskMB && that_present_diskMB))
        return false;
      if (this.diskMB != that.diskMB)
        return false;
    }

    boolean this_present_ramMB = true;
    boolean that_present_ramMB = true;
    if (this_present_ramMB || that_present_ramMB) {
      if (!(this_present_ramMB && that_present_ramMB))
        return false;
      if (this.ramMB != that.ramMB)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_experimentId = true && (isSetExperimentId());
    list.add(present_experimentId);
    if (present_experimentId)
      list.add(experimentId);

    boolean present_workingDir = true && (isSetWorkingDir());
    list.add(present_workingDir);
    if (present_workingDir)
      list.add(workingDir);

    boolean present_numCPU = true;
    list.add(present_numCPU);
    if (present_numCPU)
      list.add(numCPU);

    boolean present_diskMB = true;
    list.add(present_diskMB);
    if (present_diskMB)
      list.add(diskMB);

    boolean present_ramMB = true;
    list.add(present_ramMB);
    if (present_ramMB)
      list.add(ramMB);

    return list.hashCode();
  }

  @Override
  public int compareTo(Experiment other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetExperimentId()).compareTo(other.isSetExperimentId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExperimentId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.experimentId, other.experimentId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWorkingDir()).compareTo(other.isSetWorkingDir());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWorkingDir()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.workingDir, other.workingDir);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNumCPU()).compareTo(other.isSetNumCPU());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumCPU()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.numCPU, other.numCPU);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDiskMB()).compareTo(other.isSetDiskMB());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDiskMB()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.diskMB, other.diskMB);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRamMB()).compareTo(other.isSetRamMB());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRamMB()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ramMB, other.ramMB);
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
    StringBuilder sb = new StringBuilder("Experiment(");
    boolean first = true;

    sb.append("experimentId:");
    if (this.experimentId == null) {
      sb.append("null");
    } else {
      sb.append(this.experimentId);
    }
    first = false;
    if (isSetWorkingDir()) {
      if (!first) sb.append(", ");
      sb.append("workingDir:");
      if (this.workingDir == null) {
        sb.append("null");
      } else {
        sb.append(this.workingDir);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("numCPU:");
    sb.append(this.numCPU);
    first = false;
    if (!first) sb.append(", ");
    sb.append("diskMB:");
    sb.append(this.diskMB);
    first = false;
    if (!first) sb.append(", ");
    sb.append("ramMB:");
    sb.append(this.ramMB);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (experimentId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'experimentId' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'numCPU' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'diskMB' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'ramMB' because it's a primitive and you chose the non-beans generator.
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

  private static class ExperimentStandardSchemeFactory implements SchemeFactory {
    public ExperimentStandardScheme getScheme() {
      return new ExperimentStandardScheme();
    }
  }

  private static class ExperimentStandardScheme extends StandardScheme<Experiment> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Experiment struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXPERIMENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.experimentId = iprot.readString();
              struct.setExperimentIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WORKING_DIR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.workingDir = iprot.readString();
              struct.setWorkingDirIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NUM_CPU
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.numCPU = iprot.readDouble();
              struct.setNumCPUIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DISK_MB
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.diskMB = iprot.readI64();
              struct.setDiskMBIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RAM_MB
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.ramMB = iprot.readI64();
              struct.setRamMBIsSet(true);
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
      if (!struct.isSetNumCPU()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'numCPU' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetDiskMB()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'diskMB' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetRamMB()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'ramMB' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Experiment struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.experimentId != null) {
        oprot.writeFieldBegin(EXPERIMENT_ID_FIELD_DESC);
        oprot.writeString(struct.experimentId);
        oprot.writeFieldEnd();
      }
      if (struct.workingDir != null) {
        if (struct.isSetWorkingDir()) {
          oprot.writeFieldBegin(WORKING_DIR_FIELD_DESC);
          oprot.writeString(struct.workingDir);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(NUM_CPU_FIELD_DESC);
      oprot.writeDouble(struct.numCPU);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DISK_MB_FIELD_DESC);
      oprot.writeI64(struct.diskMB);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RAM_MB_FIELD_DESC);
      oprot.writeI64(struct.ramMB);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ExperimentTupleSchemeFactory implements SchemeFactory {
    public ExperimentTupleScheme getScheme() {
      return new ExperimentTupleScheme();
    }
  }

  private static class ExperimentTupleScheme extends TupleScheme<Experiment> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Experiment struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.experimentId);
      oprot.writeDouble(struct.numCPU);
      oprot.writeI64(struct.diskMB);
      oprot.writeI64(struct.ramMB);
      BitSet optionals = new BitSet();
      if (struct.isSetWorkingDir()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetWorkingDir()) {
        oprot.writeString(struct.workingDir);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Experiment struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.experimentId = iprot.readString();
      struct.setExperimentIdIsSet(true);
      struct.numCPU = iprot.readDouble();
      struct.setNumCPUIsSet(true);
      struct.diskMB = iprot.readI64();
      struct.setDiskMBIsSet(true);
      struct.ramMB = iprot.readI64();
      struct.setRamMBIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.workingDir = iprot.readString();
        struct.setWorkingDirIsSet(true);
      }
    }
  }

}

