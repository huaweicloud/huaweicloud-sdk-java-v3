package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChangeServerChargeModeRequestBody
 */
public class ChangeServerChargeModeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ids")

    private List<String> serverIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prepaid_options")

    private ChangeServerChargeModePrepaidOption prepaidOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    public ChangeServerChargeModeRequestBody withServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }

    public ChangeServerChargeModeRequestBody addServerIdsItem(String serverIdsItem) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        this.serverIds.add(serverIdsItem);
        return this;
    }

    public ChangeServerChargeModeRequestBody withServerIds(Consumer<List<String>> serverIdsSetter) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        serverIdsSetter.accept(this.serverIds);
        return this;
    }

    /**
     * 云服务器ID列表
     * @return serverIds
     */
    public List<String> getServerIds() {
        return serverIds;
    }

    public void setServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
    }

    public ChangeServerChargeModeRequestBody withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 更换后的计费模式：prePaid包周期计费模式
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ChangeServerChargeModeRequestBody withPrepaidOptions(ChangeServerChargeModePrepaidOption prepaidOptions) {
        this.prepaidOptions = prepaidOptions;
        return this;
    }

    public ChangeServerChargeModeRequestBody withPrepaidOptions(
        Consumer<ChangeServerChargeModePrepaidOption> prepaidOptionsSetter) {
        if (this.prepaidOptions == null) {
            this.prepaidOptions = new ChangeServerChargeModePrepaidOption();
            prepaidOptionsSetter.accept(this.prepaidOptions);
        }

        return this;
    }

    /**
     * Get prepaidOptions
     * @return prepaidOptions
     */
    public ChangeServerChargeModePrepaidOption getPrepaidOptions() {
        return prepaidOptions;
    }

    public void setPrepaidOptions(ChangeServerChargeModePrepaidOption prepaidOptions) {
        this.prepaidOptions = prepaidOptions;
    }

    public ChangeServerChargeModeRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * 是否预先校验此次请求。 true: 发送检查请求，不触发真正的计费转换操作 false: 发送正常请求，触发计费转换操作。 默认值为false
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeServerChargeModeRequestBody changeServerChargeModeRequestBody = (ChangeServerChargeModeRequestBody) o;
        return Objects.equals(this.serverIds, changeServerChargeModeRequestBody.serverIds)
            && Objects.equals(this.chargeMode, changeServerChargeModeRequestBody.chargeMode)
            && Objects.equals(this.prepaidOptions, changeServerChargeModeRequestBody.prepaidOptions)
            && Objects.equals(this.dryRun, changeServerChargeModeRequestBody.dryRun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverIds, chargeMode, prepaidOptions, dryRun);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeServerChargeModeRequestBody {\n");
        sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    prepaidOptions: ").append(toIndentedString(prepaidOptions)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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
