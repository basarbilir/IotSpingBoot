package com.iotexam.entities;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

import java.time.LocalDateTime;

@Entity
public class Userr {
    @Id
    String id;
    Long rowId;
    String avalue;
    Integer addressout;
    Integer addressin;
    String bvalue;
    Integer bitPosition;
    String buttonPath;
    String code;
    Boolean decimal;
    Integer defaultValue;
    Integer delay;
    Integer delta;
    String description;
    Integer dimension;
    Integer frequency;
    String functionCode;
    Integer grpCategory;
    Integer idGroup;
    Integer idHshVariable;
    Integer idVarmdl;
    Integer idVariable;
    String imageOff;
    String imageon;
    LocalDateTime insertTime;
    Boolean isActive;
    Boolean isCancelled;
    Boolean isHaccp;
    Boolean isLogic;
    Boolean isOnchange;
    LocalDateTime lastUpdate;
    Integer length;
    String maximum;
    String meausereUnit;
    Integer minimum;
    Integer priority;
    Integer readWrite;
    Boolean signed;
    String toDisplay;
    Integer type;
    String varEncoding;
    String detailId;
    String deviceModel;

    public Userr() {
    }

    public Userr(String id, Long rowId, String avalue, Integer addressout, Integer addressin, String bvalue, Integer bitPosition, String buttonPath, String code, Boolean decimal, Integer defaultValue, Integer delay, Integer delta, String description, Integer dimension, Integer frequency, String functionCode, Integer grpCategory, Integer idGroup, Integer idHshVariable, Integer idVarmdl, Integer idVariable, String imageOff, String imageon, LocalDateTime insertTime, Boolean isActive, Boolean isCancelled, Boolean isHaccp, Boolean isLogic, Boolean isOnchange, LocalDateTime lastUpdate, Integer length, String maximum, String meausereUnit, Integer minimum, Integer priority, Integer readWrite, Boolean signed, String toDisplay, Integer type, String varEncoding, String detailId, String deviceModel) {
        this.id = id;
        this.rowId = rowId;
        this.avalue = avalue;
        this.addressout = addressout;
        this.addressin = addressin;
        this.bvalue = bvalue;
        this.bitPosition = bitPosition;
        this.buttonPath = buttonPath;
        this.code = code;
        this.decimal = decimal;
        this.defaultValue = defaultValue;
        this.delay = delay;
        this.delta = delta;
        this.description = description;
        this.dimension = dimension;
        this.frequency = frequency;
        this.functionCode = functionCode;
        this.grpCategory = grpCategory;
        this.idGroup = idGroup;
        this.idHshVariable = idHshVariable;
        this.idVarmdl = idVarmdl;
        this.idVariable = idVariable;
        this.imageOff = imageOff;
        this.imageon = imageon;
        this.insertTime = insertTime;
        this.isActive = isActive;
        this.isCancelled = isCancelled;
        this.isHaccp = isHaccp;
        this.isLogic = isLogic;
        this.isOnchange = isOnchange;
        this.lastUpdate = lastUpdate;
        this.length = length;
        this.maximum = maximum;
        this.meausereUnit = meausereUnit;
        this.minimum = minimum;
        this.priority = priority;
        this.readWrite = readWrite;
        this.signed = signed;
        this.toDisplay = toDisplay;
        this.type = type;
        this.varEncoding = varEncoding;
        this.detailId = detailId;
        this.deviceModel = deviceModel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getRowId() {
        return rowId;
    }

    public void setRowId(Long rowId) {
        this.rowId = rowId;
    }

    public String getAvalue() {
        return avalue;
    }

    public void setAvalue(String avalue) {
        this.avalue = avalue;
    }

    public Integer getAddressout() {
        return addressout;
    }

    public void setAddressout(Integer addressout) {
        this.addressout = addressout;
    }

    public Integer getAddressin() {
        return addressin;
    }

    public void setAddressin(Integer addressin) {
        this.addressin = addressin;
    }

    public String getBvalue() {
        return bvalue;
    }

    public void setBvalue(String bvalue) {
        this.bvalue = bvalue;
    }

    public Integer getBitPosition() {
        return bitPosition;
    }

    public void setBitPosition(Integer bitPosition) {
        this.bitPosition = bitPosition;
    }

    public String getButtonPath() {
        return buttonPath;
    }

    public void setButtonPath(String buttonPath) {
        this.buttonPath = buttonPath;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getDecimal() {
        return decimal;
    }

    public void setDecimal(Boolean decimal) {
        this.decimal = decimal;
    }

    public Integer getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Integer defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public Integer getDelta() {
        return delta;
    }

    public void setDelta(Integer delta) {
        this.delta = delta;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDimension() {
        return dimension;
    }

    public void setDimension(Integer dimension) {
        this.dimension = dimension;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    public Integer getGrpCategory() {
        return grpCategory;
    }

    public void setGrpCategory(Integer grpCategory) {
        this.grpCategory = grpCategory;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public Integer getIdHshVariable() {
        return idHshVariable;
    }

    public void setIdHshVariable(Integer idHshVariable) {
        this.idHshVariable = idHshVariable;
    }

    public Integer getIdVarmdl() {
        return idVarmdl;
    }

    public void setIdVarmdl(Integer idVarmdl) {
        this.idVarmdl = idVarmdl;
    }

    public Integer getIdVariable() {
        return idVariable;
    }

    public void setIdVariable(Integer idVariable) {
        this.idVariable = idVariable;
    }

    public String getImageOff() {
        return imageOff;
    }

    public void setImageOff(String imageOff) {
        this.imageOff = imageOff;
    }

    public String getImageon() {
        return imageon;
    }

    public void setImageon(String imageon) {
        this.imageon = imageon;
    }

    public LocalDateTime getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(LocalDateTime insertTime) {
        this.insertTime = insertTime;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getCancelled() {
        return isCancelled;
    }

    public void setCancelled(Boolean cancelled) {
        isCancelled = cancelled;
    }

    public Boolean getHaccp() {
        return isHaccp;
    }

    public void setHaccp(Boolean haccp) {
        isHaccp = haccp;
    }

    public Boolean getLogic() {
        return isLogic;
    }

    public void setLogic(Boolean logic) {
        isLogic = logic;
    }

    public Boolean getOnchange() {
        return isOnchange;
    }

    public void setOnchange(Boolean onchange) {
        isOnchange = onchange;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getMaximum() {
        return maximum;
    }

    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }

    public String getMeausereUnit() {
        return meausereUnit;
    }

    public void setMeausereUnit(String meausereUnit) {
        this.meausereUnit = meausereUnit;
    }

    public Integer getMinimum() {
        return minimum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getReadWrite() {
        return readWrite;
    }

    public void setReadWrite(Integer readWrite) {
        this.readWrite = readWrite;
    }

    public Boolean getSigned() {
        return signed;
    }

    public void setSigned(Boolean signed) {
        this.signed = signed;
    }

    public String getToDisplay() {
        return toDisplay;
    }

    public void setToDisplay(String toDisplay) {
        this.toDisplay = toDisplay;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getVarEncoding() {
        return varEncoding;
    }

    public void setVarEncoding(String varEncoding) {
        this.varEncoding = varEncoding;
    }

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }
}
