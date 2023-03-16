package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建数据源配置请求结构体
 */
public class CreateDcDsReqDTO  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ds_id")
    

    private String dsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config")
    

    private Object config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="module_id")
    

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tpl_id")
    

    private String tplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quality_report")
    

    private Boolean qualityReport;

    public CreateDcDsReqDTO withDsId(String dsId) {
        this.dsId = dsId;
        return this;
    }

    


    /**
     * 采集数据源id，节点下唯一
     * @return dsId
     */
    public String getDsId() {
        return dsId;
    }

    public void setDsId(String dsId) {
        this.dsId = dsId;
    }

    

    public CreateDcDsReqDTO withConfig(Object config) {
        this.config = config;
        return this;
    }

    


    /**
     * 数据源的连接及采集信息
     * @return config
     */
    public Object getConfig() {
        return config;
    }

    public void setConfig(Object config) {
        this.config = config;
    }

    

    public CreateDcDsReqDTO withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 采集数据源名称，允许中、数字、英文大小写、下划线、中划线
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateDcDsReqDTO withModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    


    /**
     * 模块id
     * @return moduleId
     */
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    

    public CreateDcDsReqDTO withTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }

    


    /**
     * 模板id，节点下唯一
     * @return tplId
     */
    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    

    public CreateDcDsReqDTO withQualityReport(Boolean qualityReport) {
        this.qualityReport = qualityReport;
        return this;
    }

    


    /**
     * 质量上报开关，不携带或值不为true，默认为false
     * @return qualityReport
     */
    public Boolean getQualityReport() {
        return qualityReport;
    }

    public void setQualityReport(Boolean qualityReport) {
        this.qualityReport = qualityReport;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDcDsReqDTO createDcDsReqDTO = (CreateDcDsReqDTO) o;
        return Objects.equals(this.dsId, createDcDsReqDTO.dsId) &&
            Objects.equals(this.config, createDcDsReqDTO.config) &&
            Objects.equals(this.name, createDcDsReqDTO.name) &&
            Objects.equals(this.moduleId, createDcDsReqDTO.moduleId) &&
            Objects.equals(this.tplId, createDcDsReqDTO.tplId) &&
            Objects.equals(this.qualityReport, createDcDsReqDTO.qualityReport);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dsId, config, name, moduleId, tplId, qualityReport);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDcDsReqDTO {\n");
        sb.append("    dsId: ").append(toIndentedString(dsId)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    qualityReport: ").append(toIndentedString(qualityReport)).append("\n");
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

