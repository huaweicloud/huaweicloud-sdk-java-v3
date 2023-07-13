package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VpcBaseInfo
 */
public class VpcBaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs_id")

    private String ecsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs_name")

    private String ecsName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cascade_flag")

    private Boolean cascadeFlag;

    public VpcBaseInfo withEcsId(String ecsId) {
        this.ecsId = ecsId;
        return this;
    }

    /**
     * 云服务器ID
     * @return ecsId
     */
    public String getEcsId() {
        return ecsId;
    }

    public void setEcsId(String ecsId) {
        this.ecsId = ecsId;
    }

    public VpcBaseInfo withEcsName(String ecsName) {
        this.ecsName = ecsName;
        return this;
    }

    /**
     * 云服务器名称
     * @return ecsName
     */
    public String getEcsName() {
        return ecsName;
    }

    public void setEcsName(String ecsName) {
        this.ecsName = ecsName;
    }

    public VpcBaseInfo withCascadeFlag(Boolean cascadeFlag) {
        this.cascadeFlag = cascadeFlag;
        return this;
    }

    /**
     * 是否使用级联方式  暂不支持
     * @return cascadeFlag
     */
    public Boolean getCascadeFlag() {
        return cascadeFlag;
    }

    public void setCascadeFlag(Boolean cascadeFlag) {
        this.cascadeFlag = cascadeFlag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VpcBaseInfo that = (VpcBaseInfo) obj;
        return Objects.equals(this.ecsId, that.ecsId) && Objects.equals(this.ecsName, that.ecsName)
            && Objects.equals(this.cascadeFlag, that.cascadeFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ecsId, ecsName, cascadeFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcBaseInfo {\n");
        sb.append("    ecsId: ").append(toIndentedString(ecsId)).append("\n");
        sb.append("    ecsName: ").append(toIndentedString(ecsName)).append("\n");
        sb.append("    cascadeFlag: ").append(toIndentedString(cascadeFlag)).append("\n");
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
