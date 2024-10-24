package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 操作
 */
public class OperationLogItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_info")

    private OpExternalInfo externalInfo;

    public OperationLogItem withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * 操作时间
     * minimum: 0
     * maximum: 2147483647
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public OperationLogItem withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 操作名称,当前已有的action为CREATE_JOB(创建任务),COMMIT_JOB(提交任务),SYSTEM_AUDIT_PASS(系统审核通过),ADMIN_AUDIT_PASS(管理员审核通过),AUDIT_NOT_PASS(审核未通过),TRAINING_FINISH(训练完成),UPLOADING_MODEL(上传语音模型),COMPLETE_JOB(任务完成)
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public OperationLogItem withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 操作者,USER(用户),ADMIN(管理员),SYSTEM(用户)
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public OperationLogItem withExternalInfo(OpExternalInfo externalInfo) {
        this.externalInfo = externalInfo;
        return this;
    }

    public OperationLogItem withExternalInfo(Consumer<OpExternalInfo> externalInfoSetter) {
        if (this.externalInfo == null) {
            this.externalInfo = new OpExternalInfo();
            externalInfoSetter.accept(this.externalInfo);
        }

        return this;
    }

    /**
     * Get externalInfo
     * @return externalInfo
     */
    public OpExternalInfo getExternalInfo() {
        return externalInfo;
    }

    public void setExternalInfo(OpExternalInfo externalInfo) {
        this.externalInfo = externalInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperationLogItem that = (OperationLogItem) obj;
        return Objects.equals(this.time, that.time) && Objects.equals(this.action, that.action)
            && Objects.equals(this.operator, that.operator) && Objects.equals(this.externalInfo, that.externalInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, action, operator, externalInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperationLogItem {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    externalInfo: ").append(toIndentedString(externalInfo)).append("\n");
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
