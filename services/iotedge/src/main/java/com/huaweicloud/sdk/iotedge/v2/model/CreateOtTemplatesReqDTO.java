package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建OT数采模板请求体
 */
public class CreateOtTemplatesReqDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_id")

    private String tplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_meta")

    private Object datasourceMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "point_meta")

    private Object pointMeta;

    public CreateOtTemplatesReqDTO withTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }

    /**
     * 模板id
     * @return tplId
     */
    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    public CreateOtTemplatesReqDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板名称，允许中、数字、英文大小写、下划线、中划线
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateOtTemplatesReqDTO withDescription(String description) {
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

    public CreateOtTemplatesReqDTO withDatasourceMeta(Object datasourceMeta) {
        this.datasourceMeta = datasourceMeta;
        return this;
    }

    /**
     * 数据源元数据
     * @return datasourceMeta
     */
    public Object getDatasourceMeta() {
        return datasourceMeta;
    }

    public void setDatasourceMeta(Object datasourceMeta) {
        this.datasourceMeta = datasourceMeta;
    }

    public CreateOtTemplatesReqDTO withPointMeta(Object pointMeta) {
        this.pointMeta = pointMeta;
        return this;
    }

    /**
     * 点位表元数据
     * @return pointMeta
     */
    public Object getPointMeta() {
        return pointMeta;
    }

    public void setPointMeta(Object pointMeta) {
        this.pointMeta = pointMeta;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOtTemplatesReqDTO that = (CreateOtTemplatesReqDTO) obj;
        return Objects.equals(this.tplId, that.tplId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.datasourceMeta, that.datasourceMeta)
            && Objects.equals(this.pointMeta, that.pointMeta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tplId, name, description, datasourceMeta, pointMeta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOtTemplatesReqDTO {\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    datasourceMeta: ").append(toIndentedString(datasourceMeta)).append("\n");
        sb.append("    pointMeta: ").append(toIndentedString(pointMeta)).append("\n");
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
