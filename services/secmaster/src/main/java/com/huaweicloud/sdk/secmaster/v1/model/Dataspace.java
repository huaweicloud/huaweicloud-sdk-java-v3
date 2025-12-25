package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Dataspace
 */
public class Dataspace {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataspace_id")

    private String dataspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataspace_name")

    private String dataspaceName;

    /**
     * 数据空间类型；可选值：system-defined(系统预定义)、user-defined(用户自定义)
     */
    public static final class DataspaceTypeEnum {

        /**
         * Enum SYSTEM_DEFINED for value: "system-defined"
         */
        public static final DataspaceTypeEnum SYSTEM_DEFINED = new DataspaceTypeEnum("system-defined");

        /**
         * Enum USER_DEFINED for value: "user-defined"
         */
        public static final DataspaceTypeEnum USER_DEFINED = new DataspaceTypeEnum("user-defined");

        private static final Map<String, DataspaceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DataspaceTypeEnum> createStaticFields() {
            Map<String, DataspaceTypeEnum> map = new HashMap<>();
            map.put("system-defined", SYSTEM_DEFINED);
            map.put("user-defined", USER_DEFINED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DataspaceTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DataspaceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DataspaceTypeEnum(value));
        }

        public static DataspaceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DataspaceTypeEnum) {
                return this.value.equals(((DataspaceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataspace_type")

    private DataspaceTypeEnum dataspaceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public Dataspace withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建者
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Dataspace withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 10000000000000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Dataspace withDataspaceId(String dataspaceId) {
        this.dataspaceId = dataspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return dataspaceId
     */
    public String getDataspaceId() {
        return dataspaceId;
    }

    public void setDataspaceId(String dataspaceId) {
        this.dataspaceId = dataspaceId;
    }

    public Dataspace withDataspaceName(String dataspaceName) {
        this.dataspaceName = dataspaceName;
        return this;
    }

    /**
     * 工作空间名称
     * @return dataspaceName
     */
    public String getDataspaceName() {
        return dataspaceName;
    }

    public void setDataspaceName(String dataspaceName) {
        this.dataspaceName = dataspaceName;
    }

    public Dataspace withDataspaceType(DataspaceTypeEnum dataspaceType) {
        this.dataspaceType = dataspaceType;
        return this;
    }

    /**
     * 数据空间类型；可选值：system-defined(系统预定义)、user-defined(用户自定义)
     * @return dataspaceType
     */
    public DataspaceTypeEnum getDataspaceType() {
        return dataspaceType;
    }

    public void setDataspaceType(DataspaceTypeEnum dataspaceType) {
        this.dataspaceType = dataspaceType;
    }

    public Dataspace withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Dataspace withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public Dataspace withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Dataspace withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * region ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public Dataspace withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 更新者
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Dataspace withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * minimum: 0
     * maximum: 10000000000000
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Dataspace that = (Dataspace) obj;
        return Objects.equals(this.createBy, that.createBy) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.dataspaceId, that.dataspaceId)
            && Objects.equals(this.dataspaceName, that.dataspaceName)
            && Objects.equals(this.dataspaceType, that.dataspaceType)
            && Objects.equals(this.description, that.description) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.updateBy, that.updateBy) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createBy,
            createTime,
            dataspaceId,
            dataspaceName,
            dataspaceType,
            description,
            domainId,
            projectId,
            regionId,
            updateBy,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Dataspace {\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    dataspaceId: ").append(toIndentedString(dataspaceId)).append("\n");
        sb.append("    dataspaceName: ").append(toIndentedString(dataspaceName)).append("\n");
        sb.append("    dataspaceType: ").append(toIndentedString(dataspaceType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
