package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ComputeFlavors
 */
public class ComputeFlavors {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "typeCode")

    private String typeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iaasCode")

    private String iaasCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem")

    private String mem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxConnections")

    private String maxConnections;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverType")

    private String serverType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "architecture")

    private String architecture;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "azStatus")

    private Object azStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regionStatus")

    private String regionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groupType")

    private String groupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dbType")

    private String dbType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendFields")

    private Object extendFields;

    public ComputeFlavors withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规格id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ComputeFlavors withTypeCode(String typeCode) {
        this.typeCode = typeCode;
        return this;
    }

    /**
     * 资源类型编码。
     * @return typeCode
     */
    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public ComputeFlavors withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * DDM内部记录的虚机规格类型。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ComputeFlavors withIaasCode(String iaasCode) {
        this.iaasCode = iaasCode;
        return this;
    }

    /**
     * iaas记录的虚机规格类型。
     * @return iaasCode
     */
    public String getIaasCode() {
        return iaasCode;
    }

    public void setIaasCode(String iaasCode) {
        this.iaasCode = iaasCode;
    }

    public ComputeFlavors withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * cpu核数。
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public ComputeFlavors withMem(String mem) {
        this.mem = mem;
        return this;
    }

    /**
     * 内存大小,单位:G。
     * @return mem
     */
    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public ComputeFlavors withMaxConnections(String maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }

    /**
     * 最大连接数。
     * @return maxConnections
     */
    public String getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(String maxConnections) {
        this.maxConnections = maxConnections;
    }

    public ComputeFlavors withServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * 计算资源服务类型。
     * @return serverType
     */
    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    public ComputeFlavors withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * 计算资源架构类型，目前分X86和ARM两种。
     * @return architecture
     */
    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public ComputeFlavors withAzStatus(Object azStatus) {
        this.azStatus = azStatus;
        return this;
    }

    /**
     * 可用区状态。
     * @return azStatus
     */
    public Object getAzStatus() {
        return azStatus;
    }

    public void setAzStatus(Object azStatus) {
        this.azStatus = azStatus;
    }

    public ComputeFlavors withRegionStatus(String regionStatus) {
        this.regionStatus = regionStatus;
        return this;
    }

    /**
     * 局点状态。
     * @return regionStatus
     */
    public String getRegionStatus() {
        return regionStatus;
    }

    public void setRegionStatus(String regionStatus) {
        this.regionStatus = regionStatus;
    }

    public ComputeFlavors withGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * 计算资源架构类型，目前分X86和ARM两种。
     * @return groupType
     */
    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public ComputeFlavors withDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * 服务引擎类型。
     * @return dbType
     */
    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public ComputeFlavors withExtendFields(Object extendFields) {
        this.extendFields = extendFields;
        return this;
    }

    /**
     * 扩展字段，目前存储可用区相关信息。
     * @return extendFields
     */
    public Object getExtendFields() {
        return extendFields;
    }

    public void setExtendFields(Object extendFields) {
        this.extendFields = extendFields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComputeFlavors that = (ComputeFlavors) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.typeCode, that.typeCode)
            && Objects.equals(this.code, that.code) && Objects.equals(this.iaasCode, that.iaasCode)
            && Objects.equals(this.cpu, that.cpu) && Objects.equals(this.mem, that.mem)
            && Objects.equals(this.maxConnections, that.maxConnections)
            && Objects.equals(this.serverType, that.serverType) && Objects.equals(this.architecture, that.architecture)
            && Objects.equals(this.azStatus, that.azStatus) && Objects.equals(this.regionStatus, that.regionStatus)
            && Objects.equals(this.groupType, that.groupType) && Objects.equals(this.dbType, that.dbType)
            && Objects.equals(this.extendFields, that.extendFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            typeCode,
            code,
            iaasCode,
            cpu,
            mem,
            maxConnections,
            serverType,
            architecture,
            azStatus,
            regionStatus,
            groupType,
            dbType,
            extendFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComputeFlavors {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    iaasCode: ").append(toIndentedString(iaasCode)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
        sb.append("    maxConnections: ").append(toIndentedString(maxConnections)).append("\n");
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    azStatus: ").append(toIndentedString(azStatus)).append("\n");
        sb.append("    regionStatus: ").append(toIndentedString(regionStatus)).append("\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
        sb.append("    extendFields: ").append(toIndentedString(extendFields)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
