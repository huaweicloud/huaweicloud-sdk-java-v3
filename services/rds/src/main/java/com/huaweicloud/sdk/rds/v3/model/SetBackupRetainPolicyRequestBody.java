package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**  设置备份保留策略请求体  **约束限制**  不涉及  **取值范围**  不涉及  **默认取值**  不涉及
 */
public class SetBackupRetainPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto")

    private String auto;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manual")

    private String manual;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceids")

    private List<String> instanceids = null;

    public SetBackupRetainPolicyRequestBody withAuto(String auto) {
        this.auto = auto;
        return this;
    }

    /**
     * **参数解释**  自动备份保留策略。NONE不保留，LAST保留最后一个，ALL全部保留。  **约束限制**  不涉及       **取值范围**  NONE、LAST、ALL  **默认取值**  不涉及。
     * @return auto
     */
    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public SetBackupRetainPolicyRequestBody withManual(String manual) {
        this.manual = manual;
        return this;
    }

    /**
     * **参数解释**  手动备份保留策略。NONE不保留，LAST保留最后一个，ALL全部保留。  **约束限制**  不涉及      **取值范围**  NONE、LAST、ALL  **默认取值**  不涉及。
     * @return manual
     */
    public String getManual() {
        return manual;
    }

    public void setManual(String manual) {
        this.manual = manual;
    }

    public SetBackupRetainPolicyRequestBody withInstanceids(List<String> instanceids) {
        this.instanceids = instanceids;
        return this;
    }

    public SetBackupRetainPolicyRequestBody addInstanceidsItem(String instanceidsItem) {
        if (this.instanceids == null) {
            this.instanceids = new ArrayList<>();
        }
        this.instanceids.add(instanceidsItem);
        return this;
    }

    public SetBackupRetainPolicyRequestBody withInstanceids(Consumer<List<String>> instanceidsSetter) {
        if (this.instanceids == null) {
            this.instanceids = new ArrayList<>();
        }
        instanceidsSetter.accept(this.instanceids);
        return this;
    }

    /**
     * **参数解释**  实例ID列表，实例ID是实例的唯一标识。  **约束限制**  不涉及。  **取值范围**  实例ID只能由英文字母、数字组成，长度为36个字符。  **默认取值**  不涉及。
     * @return instanceids
     */
    public List<String> getInstanceids() {
        return instanceids;
    }

    public void setInstanceids(List<String> instanceids) {
        this.instanceids = instanceids;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetBackupRetainPolicyRequestBody that = (SetBackupRetainPolicyRequestBody) obj;
        return Objects.equals(this.auto, that.auto) && Objects.equals(this.manual, that.manual)
            && Objects.equals(this.instanceids, that.instanceids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auto, manual, instanceids);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetBackupRetainPolicyRequestBody {\n");
        sb.append("    auto: ").append(toIndentedString(auto)).append("\n");
        sb.append("    manual: ").append(toIndentedString(manual)).append("\n");
        sb.append("    instanceids: ").append(toIndentedString(instanceids)).append("\n");
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
