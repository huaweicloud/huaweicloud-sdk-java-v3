package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 录屏审计。
 */
public class PoliciesRecordAudit {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private PoliciesRecordAuditRules rules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_type")

    private String storageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_source")

    private String obsBucketSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_name")

    private String obsBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_duration")

    private Integer retentionDuration;

    public PoliciesRecordAudit withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否开启录屏审计。取值为： false：表示关闭。 true：表示开启。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public PoliciesRecordAudit withRules(PoliciesRecordAuditRules rules) {
        this.rules = rules;
        return this;
    }

    public PoliciesRecordAudit withRules(Consumer<PoliciesRecordAuditRules> rulesSetter) {
        if (this.rules == null) {
            this.rules = new PoliciesRecordAuditRules();
            rulesSetter.accept(this.rules);
        }

        return this;
    }

    /**
     * Get rules
     * @return rules
     */
    public PoliciesRecordAuditRules getRules() {
        return rules;
    }

    public void setRules(PoliciesRecordAuditRules rules) {
        this.rules = rules;
    }

    public PoliciesRecordAudit withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * 存储类型。取值为： OBS：OBS桶类型。 SFTP：SFTP对接类型。
     * @return storageType
     */
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public PoliciesRecordAudit withObsBucketSource(String obsBucketSource) {
        this.obsBucketSource = obsBucketSource;
        return this;
    }

    /**
     * OBS桶来源。取值为： AUTO_CREATE：自动创建。 CREATED：已创建的。
     * @return obsBucketSource
     */
    public String getObsBucketSource() {
        return obsBucketSource;
    }

    public void setObsBucketSource(String obsBucketSource) {
        this.obsBucketSource = obsBucketSource;
    }

    public PoliciesRecordAudit withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * obs 桶名
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public PoliciesRecordAudit withRetentionDuration(Integer retentionDuration) {
        this.retentionDuration = retentionDuration;
        return this;
    }

    /**
     * 录屏文件保留时长（天）。取值为1~180天，0 表示永久保留。
     * minimum: 0
     * maximum: 180
     * @return retentionDuration
     */
    public Integer getRetentionDuration() {
        return retentionDuration;
    }

    public void setRetentionDuration(Integer retentionDuration) {
        this.retentionDuration = retentionDuration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesRecordAudit that = (PoliciesRecordAudit) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.rules, that.rules)
            && Objects.equals(this.storageType, that.storageType)
            && Objects.equals(this.obsBucketSource, that.obsBucketSource)
            && Objects.equals(this.obsBucketName, that.obsBucketName)
            && Objects.equals(this.retentionDuration, that.retentionDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, rules, storageType, obsBucketSource, obsBucketName, retentionDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesRecordAudit {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    obsBucketSource: ").append(toIndentedString(obsBucketSource)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    retentionDuration: ").append(toIndentedString(retentionDuration)).append("\n");
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
