package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ShowAutoKillTransactionConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usernames")

    private List<String> usernames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Long threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_stop")

    private Boolean autoStop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_names")

    private List<String> databaseNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_names_select")

    private List<String> databaseNamesSelect = null;

    public ShowAutoKillTransactionConfigResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 配置类型。 **取值范围**: 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowAutoKillTransactionConfigResponse withUsernames(List<String> usernames) {
        this.usernames = usernames;
        return this;
    }

    public ShowAutoKillTransactionConfigResponse addUsernamesItem(String usernamesItem) {
        if (this.usernames == null) {
            this.usernames = new ArrayList<>();
        }
        this.usernames.add(usernamesItem);
        return this;
    }

    public ShowAutoKillTransactionConfigResponse withUsernames(Consumer<List<String>> usernamesSetter) {
        if (this.usernames == null) {
            this.usernames = new ArrayList<>();
        }
        usernamesSetter.accept(this.usernames);
        return this;
    }

    /**
     * **参数解释**: 筛选用户名。
     * @return usernames
     */
    public List<String> getUsernames() {
        return usernames;
    }

    public void setUsernames(List<String> usernames) {
        this.usernames = usernames;
    }

    public ShowAutoKillTransactionConfigResponse withThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * **参数解释**: 阈值。 **取值范围**: 不涉及。
     * @return threshold
     */
    public Long getThreshold() {
        return threshold;
    }

    public void setThreshold(Long threshold) {
        this.threshold = threshold;
    }

    public ShowAutoKillTransactionConfigResponse withAutoStop(Boolean autoStop) {
        this.autoStop = autoStop;
        return this;
    }

    /**
     * **参数解释**: 配置是否开启。 **取值范围**: 不涉及。
     * @return autoStop
     */
    public Boolean getAutoStop() {
        return autoStop;
    }

    public void setAutoStop(Boolean autoStop) {
        this.autoStop = autoStop;
    }

    public ShowAutoKillTransactionConfigResponse withDatabaseNames(List<String> databaseNames) {
        this.databaseNames = databaseNames;
        return this;
    }

    public ShowAutoKillTransactionConfigResponse addDatabaseNamesItem(String databaseNamesItem) {
        if (this.databaseNames == null) {
            this.databaseNames = new ArrayList<>();
        }
        this.databaseNames.add(databaseNamesItem);
        return this;
    }

    public ShowAutoKillTransactionConfigResponse withDatabaseNames(Consumer<List<String>> databaseNamesSetter) {
        if (this.databaseNames == null) {
            this.databaseNames = new ArrayList<>();
        }
        databaseNamesSetter.accept(this.databaseNames);
        return this;
    }

    /**
     * **参数解释**: 当前实例包含的所有数据库。
     * @return databaseNames
     */
    public List<String> getDatabaseNames() {
        return databaseNames;
    }

    public void setDatabaseNames(List<String> databaseNames) {
        this.databaseNames = databaseNames;
    }

    public ShowAutoKillTransactionConfigResponse withDatabaseNamesSelect(List<String> databaseNamesSelect) {
        this.databaseNamesSelect = databaseNamesSelect;
        return this;
    }

    public ShowAutoKillTransactionConfigResponse addDatabaseNamesSelectItem(String databaseNamesSelectItem) {
        if (this.databaseNamesSelect == null) {
            this.databaseNamesSelect = new ArrayList<>();
        }
        this.databaseNamesSelect.add(databaseNamesSelectItem);
        return this;
    }

    public ShowAutoKillTransactionConfigResponse withDatabaseNamesSelect(
        Consumer<List<String>> databaseNamesSelectSetter) {
        if (this.databaseNamesSelect == null) {
            this.databaseNamesSelect = new ArrayList<>();
        }
        databaseNamesSelectSetter.accept(this.databaseNamesSelect);
        return this;
    }

    /**
     * **参数解释**: 筛选数据库名。
     * @return databaseNamesSelect
     */
    public List<String> getDatabaseNamesSelect() {
        return databaseNamesSelect;
    }

    public void setDatabaseNamesSelect(List<String> databaseNamesSelect) {
        this.databaseNamesSelect = databaseNamesSelect;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAutoKillTransactionConfigResponse that = (ShowAutoKillTransactionConfigResponse) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.usernames, that.usernames)
            && Objects.equals(this.threshold, that.threshold) && Objects.equals(this.autoStop, that.autoStop)
            && Objects.equals(this.databaseNames, that.databaseNames)
            && Objects.equals(this.databaseNamesSelect, that.databaseNamesSelect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, usernames, threshold, autoStop, databaseNames, databaseNamesSelect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutoKillTransactionConfigResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    usernames: ").append(toIndentedString(usernames)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    autoStop: ").append(toIndentedString(autoStop)).append("\n");
        sb.append("    databaseNames: ").append(toIndentedString(databaseNames)).append("\n");
        sb.append("    databaseNamesSelect: ").append(toIndentedString(databaseNamesSelect)).append("\n");
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
