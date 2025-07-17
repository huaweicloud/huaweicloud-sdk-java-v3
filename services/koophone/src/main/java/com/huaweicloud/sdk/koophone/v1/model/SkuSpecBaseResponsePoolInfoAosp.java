package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SkuSpecBaseResponsePoolInfoAosp
 */
public class SkuSpecBaseResponsePoolInfoAosp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resPoolId")

    private String resPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public SkuSpecBaseResponsePoolInfoAosp withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * aosp版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public SkuSpecBaseResponsePoolInfoAosp withResPoolId(String resPoolId) {
        this.resPoolId = resPoolId;
        return this;
    }

    /**
     * 资源池id
     * @return resPoolId
     */
    public String getResPoolId() {
        return resPoolId;
    }

    public void setResPoolId(String resPoolId) {
        this.resPoolId = resPoolId;
    }

    public SkuSpecBaseResponsePoolInfoAosp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * sku表该数据主键id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SkuSpecBaseResponsePoolInfoAosp that = (SkuSpecBaseResponsePoolInfoAosp) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.resPoolId, that.resPoolId)
            && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, resPoolId, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkuSpecBaseResponsePoolInfoAosp {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    resPoolId: ").append(toIndentedString(resPoolId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
