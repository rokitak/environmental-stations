package com.agh.environmental.stations.demo.model;

public class Param {
    Long idParam;
    String paramName;
    String paramFormula;
    String paramCode;

    public Long getIdParam() {
        return idParam;
    }

    public void setIdParam(Long pIdParam) {
        idParam = pIdParam;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String pParamName) {
        paramName = pParamName;
    }

    public String getParamFormula() {
        return paramFormula;
    }

    public void setParamFormula(String pParamFormula) {
        paramFormula = pParamFormula;
    }

    public String getParamCode() {
        return paramCode;
    }

    public void setParamCode(String pParamCode) {
        paramCode = pParamCode;
    }

    @Override
    public String toString() {
        return "Param{" +
                "idParam=" + idParam +
                ", paramName='" + paramName + '\'' +
                ", paramFormula='" + paramFormula + '\'' +
                ", paramCode='" + paramCode + '\'' +
                '}';
    }
}
