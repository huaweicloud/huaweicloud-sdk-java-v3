package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchDeleteAlertNoticeConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_notice_configs")

    private List<AlertNoticeConfig> alertNoticeConfigs = null;

    public BatchDeleteAlertNoticeConfigResponse withAlertNoticeConfigs(List<AlertNoticeConfig> alertNoticeConfigs) {
        this.alertNoticeConfigs = alertNoticeConfigs;
        return this;
    }

    public BatchDeleteAlertNoticeConfigResponse addAlertNoticeConfigsItem(AlertNoticeConfig alertNoticeConfigsItem) {
        if (this.alertNoticeConfigs == null) {
            this.alertNoticeConfigs = new ArrayList<>();
        }
        this.alertNoticeConfigs.add(alertNoticeConfigsItem);
        return this;
    }

    public BatchDeleteAlertNoticeConfigResponse withAlertNoticeConfigs(
        Consumer<List<AlertNoticeConfig>> alertNoticeConfigsSetter) {
        if (this.alertNoticeConfigs == null) {
            this.alertNoticeConfigs = new ArrayList<>();
        }
        alertNoticeConfigsSetter.accept(this.alertNoticeConfigs);
        return this;
    }

    /**
     * **参数解释：** 告警通知配置列表，包含多条告警通知配置信息 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return alertNoticeConfigs
     */
    public List<AlertNoticeConfig> getAlertNoticeConfigs() {
        return alertNoticeConfigs;
    }

    public void setAlertNoticeConfigs(List<AlertNoticeConfig> alertNoticeConfigs) {
        this.alertNoticeConfigs = alertNoticeConfigs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteAlertNoticeConfigResponse that = (BatchDeleteAlertNoticeConfigResponse) obj;
        return Objects.equals(this.alertNoticeConfigs, that.alertNoticeConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alertNoticeConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteAlertNoticeConfigResponse {\n");
        sb.append("    alertNoticeConfigs: ").append(toIndentedString(alertNoticeConfigs)).append("\n");
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
