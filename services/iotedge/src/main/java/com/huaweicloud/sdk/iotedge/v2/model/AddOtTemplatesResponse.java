package com.huaweicloud.sdk.iotedge.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class AddOtTemplatesResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tpl_id")
    

    private String tplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datasource_meta")
    

    private Object datasourceMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="point_meta")
    

    private Object pointMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    

    private String updateTime;

    public AddOtTemplatesResponse withTplId(String tplId) {
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

    

    public AddOtTemplatesResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 模板名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public AddOtTemplatesResponse withDescription(String description) {
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

    

    public AddOtTemplatesResponse withDatasourceMeta(Object datasourceMeta) {
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

    

    public AddOtTemplatesResponse withPointMeta(Object pointMeta) {
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

    

    public AddOtTemplatesResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public AddOtTemplatesResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 最后一次修改时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddOtTemplatesResponse addOtTemplatesResponse = (AddOtTemplatesResponse) o;
        return Objects.equals(this.tplId, addOtTemplatesResponse.tplId) &&
            Objects.equals(this.name, addOtTemplatesResponse.name) &&
            Objects.equals(this.description, addOtTemplatesResponse.description) &&
            Objects.equals(this.datasourceMeta, addOtTemplatesResponse.datasourceMeta) &&
            Objects.equals(this.pointMeta, addOtTemplatesResponse.pointMeta) &&
            Objects.equals(this.createTime, addOtTemplatesResponse.createTime) &&
            Objects.equals(this.updateTime, addOtTemplatesResponse.updateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tplId, name, description, datasourceMeta, pointMeta, createTime, updateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddOtTemplatesResponse {\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    datasourceMeta: ").append(toIndentedString(datasourceMeta)).append("\n");
        sb.append("    pointMeta: ").append(toIndentedString(pointMeta)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

