package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 策略时间调度规则
 */
public class BackupTriggerRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private BackupTriggerPropertiesRequestInfo properties;

    public BackupTriggerRequestInfo withProperties(BackupTriggerPropertiesRequestInfo properties) {
        this.properties = properties;
        return this;
    }

    public BackupTriggerRequestInfo withProperties(Consumer<BackupTriggerPropertiesRequestInfo> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new BackupTriggerPropertiesRequestInfo();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public BackupTriggerPropertiesRequestInfo getProperties() {
        return properties;
    }

    public void setProperties(BackupTriggerPropertiesRequestInfo properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupTriggerRequestInfo that = (BackupTriggerRequestInfo) obj;
        return Objects.equals(this.properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupTriggerRequestInfo {\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
