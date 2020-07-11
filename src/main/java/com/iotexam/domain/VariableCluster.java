package com.iotexam.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "variables")
@Data
public class VariableCluster {
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
    String minimum;
    Integer priority;
    Integer readWrite;
    Boolean signed;
    String toDisplay;
    Integer type;
    String varEncoding;
    String detailId;
    String deviceModel;

    public VariableCluster() {
    }

    public VariableCluster(String id, Long rowId, String avalue, Integer addressout, Integer addressin, String bvalue, Integer bitPosition, String buttonPath, String code, Boolean decimal, Integer defaultValue, Integer delay, Integer delta, String description, Integer dimension, Integer frequency, String functionCode, Integer grpCategory, Integer idGroup, Integer idHshVariable, Integer idVarmdl, Integer idVariable, String imageOff, String imageon, LocalDateTime insertTime, Boolean isActive, Boolean isCancelled, Boolean isHaccp, Boolean isLogic, Boolean isOnchange, LocalDateTime lastUpdate, Integer length, String maximum, String meausereUnit, String minimum, Integer priority, Integer readWrite, Boolean signed, String toDisplay, Integer type, String varEncoding, String detailId, String deviceModel) {
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

}
