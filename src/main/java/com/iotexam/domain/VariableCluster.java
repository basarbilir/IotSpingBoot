package com.iotexam.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "variables")
@Data
public class VariableCluster {
    String id;
    Long rowid;
    String avalue;
    Integer addressout;
    Integer addressin;
    String bvalue;
    Integer bit_position;
    String buttonpath;
    String code;
    Boolean decimal;
    Integer defaultvalue;
    Integer delay;
    Integer delta;
    String description;
    Integer dimension;
    Integer frequency;
    String functioncode;
    Integer grpcategory;
    Integer idgroup;
    Integer idhsvariable;
    Integer idvarmdl;
    Integer idvariable;
    String imageoff;
    String imageon;
    LocalDateTime inserttime;
    Boolean isactive;
    Boolean iscancelled;
    Boolean ishaccp;
    Boolean islogic;
    Boolean isonchange;
    LocalDateTime lastupdate;
    Integer length;
    String maximum;
    String meausereunit;
    String minimum;
    Integer priority;
    Integer readwrite;
    Boolean signed;
    String todisplay;
    Integer type;
    String varencoding;
    String detailid;
    String devicemodel;

    public VariableCluster() {
    }

    public VariableCluster(String id, Long rowId, String avalue, Integer addressout, Integer addressin, String bvalue, Integer bitPosition, String buttonPath, String code, Boolean decimal, Integer defaultValue, Integer delay, Integer delta, String description, Integer dimension, Integer frequency, String functionCode, Integer grpCategory, Integer idGroup, Integer idHshVariable, Integer idVarmdl, Integer idVariable, String imageOff, String imageon, LocalDateTime insertTime, Boolean isActive, Boolean isCancelled, Boolean isHaccp, Boolean isLogic, Boolean isOnchange, LocalDateTime lastUpdate, Integer length, String maximum, String meausereUnit, String minimum, Integer priority, Integer readWrite, Boolean signed, String toDisplay, Integer type, String varEncoding, String detailId, String deviceModel) {
        this.id = id;
        this.rowid = rowId;
        this.avalue = avalue;
        this.addressout = addressout;
        this.addressin = addressin;
        this.bvalue = bvalue;
        this.bit_position = bitPosition;
        this.buttonpath = buttonPath;
        this.code = code;
        this.decimal = decimal;
        this.defaultvalue = defaultValue;
        this.delay = delay;
        this.delta = delta;
        this.description = description;
        this.dimension = dimension;
        this.frequency = frequency;
        this.functioncode = functionCode;
        this.grpcategory = grpCategory;
        this.idgroup = idGroup;
        this.idhsvariable = idHshVariable;
        this.idvarmdl = idVarmdl;
        this.idvariable = idVariable;
        this.imageoff = imageOff;
        this.imageon = imageon;
        this.inserttime = insertTime;
        this.isactive = isActive;
        this.iscancelled = isCancelled;
        this.ishaccp = isHaccp;
        this.islogic = isLogic;
        this.isonchange = isOnchange;
        this.lastupdate = lastUpdate;
        this.length = length;
        this.maximum = maximum;
        this.meausereunit = meausereUnit;
        this.minimum = minimum;
        this.priority = priority;
        this.readwrite = readWrite;
        this.signed = signed;
        this.todisplay = toDisplay;
        this.type = type;
        this.varencoding = varEncoding;
        this.detailid = detailId;
        this.devicemodel = deviceModel;
    }

}
