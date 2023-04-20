package com.huaweicloud.sdk.iotedge.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateAppInstanceRequestDTO
 */
public class UpdateAppInstanceRequestDTO  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_version")
    

    private String appVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="values")
    

    private Object values;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rollback_version")
    

    private String rollbackVersion;

    public UpdateAppInstanceRequestDTO withAction(String action) {
        this.action = action;
        return this;
    }

    


    /**
     * 动作类型
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    

    public UpdateAppInstanceRequestDTO withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * 命名空间，应用实例部署于非默认命名空间(default)时必填
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    

    public UpdateAppInstanceRequestDTO withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    


    /**
     * 升级的目标版本号，动作类型为upgrade时必填
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    

    public UpdateAppInstanceRequestDTO withValues(Object values) {
        this.values = values;
        return this;
    }

    


    /**
     * 应用实例chart配置，动作类型为upgrade时必填
     * @return values
     */
    public Object getValues() {
        return values;
    }

    public void setValues(Object values) {
        this.values = values;
    }

    

    public UpdateAppInstanceRequestDTO withRollbackVersion(String rollbackVersion) {
        this.rollbackVersion = rollbackVersion;
        return this;
    }

    


    /**
     * 回退的目标版本号，动作类型为rollback时必填
     * @return rollbackVersion
     */
    public String getRollbackVersion() {
        return rollbackVersion;
    }

    public void setRollbackVersion(String rollbackVersion) {
        this.rollbackVersion = rollbackVersion;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAppInstanceRequestDTO updateAppInstanceRequestDTO = (UpdateAppInstanceRequestDTO) o;
        return Objects.equals(this.action, updateAppInstanceRequestDTO.action) &&
            Objects.equals(this.namespace, updateAppInstanceRequestDTO.namespace) &&
            Objects.equals(this.appVersion, updateAppInstanceRequestDTO.appVersion) &&
            Objects.equals(this.values, updateAppInstanceRequestDTO.values) &&
            Objects.equals(this.rollbackVersion, updateAppInstanceRequestDTO.rollbackVersion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(action, namespace, appVersion, values, rollbackVersion);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAppInstanceRequestDTO {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    rollbackVersion: ").append(toIndentedString(rollbackVersion)).append("\n");
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

