package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 生成发送短信请求体。
 */
public class CreateVmsSendTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_id")

    private String tplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_time")

    private Integer expirationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mobiles")

    private List<String> mobiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dync_params")

    private List<ContentParam> dyncParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exdata")

    private String exdata;

    public CreateVmsSendTaskRequestBody withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public CreateVmsSendTaskRequestBody withTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }

    /**
     * 智能信息基础版模板ID。
     * @return tplId
     */
    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    public CreateVmsSendTaskRequestBody withExpirationTime(Integer expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * 失效时间（小时，范围是1~72小时）。
     * minimum: 1
     * maximum: 72
     * @return expirationTime
     */
    public Integer getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Integer expirationTime) {
        this.expirationTime = expirationTime;
    }

    public CreateVmsSendTaskRequestBody withMobiles(List<String> mobiles) {
        this.mobiles = mobiles;
        return this;
    }

    public CreateVmsSendTaskRequestBody addMobilesItem(String mobilesItem) {
        if (this.mobiles == null) {
            this.mobiles = new ArrayList<>();
        }
        this.mobiles.add(mobilesItem);
        return this;
    }

    public CreateVmsSendTaskRequestBody withMobiles(Consumer<List<String>> mobilesSetter) {
        if (this.mobiles == null) {
            this.mobiles = new ArrayList<>();
        }
        mobilesSetter.accept(this.mobiles);
        return this;
    }

    /**
     * 号码列表，最多支持5000个号码。
     * @return mobiles
     */
    public List<String> getMobiles() {
        return mobiles;
    }

    public void setMobiles(List<String> mobiles) {
        this.mobiles = mobiles;
    }

    public CreateVmsSendTaskRequestBody withDyncParams(List<ContentParam> dyncParams) {
        this.dyncParams = dyncParams;
        return this;
    }

    public CreateVmsSendTaskRequestBody addDyncParamsItem(ContentParam dyncParamsItem) {
        if (this.dyncParams == null) {
            this.dyncParams = new ArrayList<>();
        }
        this.dyncParams.add(dyncParamsItem);
        return this;
    }

    public CreateVmsSendTaskRequestBody withDyncParams(Consumer<List<ContentParam>> dyncParamsSetter) {
        if (this.dyncParams == null) {
            this.dyncParams = new ArrayList<>();
        }
        dyncParamsSetter.accept(this.dyncParams);
        return this;
    }

    /**
     * 动态参数数组。  > 参数顺序按照模板创建时参数占位符的顺序传入，例如创建模板时设置动参有#p_1#、#p_2#、#p_3#，则传入的参数数组顺序第一个元素为#p_1#，第二个元素是#p_2#，第三个元素为#p_3#。 
     * @return dyncParams
     */
    public List<ContentParam> getDyncParams() {
        return dyncParams;
    }

    public void setDyncParams(List<ContentParam> dyncParams) {
        this.dyncParams = dyncParams;
    }

    public CreateVmsSendTaskRequestBody withExdata(String exdata) {
        this.exdata = exdata;
        return this;
    }

    /**
     * 智能信息基础版扩展字段。
     * @return exdata
     */
    public String getExdata() {
        return exdata;
    }

    public void setExdata(String exdata) {
        this.exdata = exdata;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVmsSendTaskRequestBody createVmsSendTaskRequestBody = (CreateVmsSendTaskRequestBody) o;
        return Objects.equals(this.taskName, createVmsSendTaskRequestBody.taskName)
            && Objects.equals(this.tplId, createVmsSendTaskRequestBody.tplId)
            && Objects.equals(this.expirationTime, createVmsSendTaskRequestBody.expirationTime)
            && Objects.equals(this.mobiles, createVmsSendTaskRequestBody.mobiles)
            && Objects.equals(this.dyncParams, createVmsSendTaskRequestBody.dyncParams)
            && Objects.equals(this.exdata, createVmsSendTaskRequestBody.exdata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, tplId, expirationTime, mobiles, dyncParams, exdata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVmsSendTaskRequestBody {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
        sb.append("    mobiles: ").append(toIndentedString(mobiles)).append("\n");
        sb.append("    dyncParams: ").append(toIndentedString(dyncParams)).append("\n");
        sb.append("    exdata: ").append(toIndentedString(exdata)).append("\n");
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
