package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：  入站认证需要校验的自定义Claim字段锁需要的匹配策略。 **约束限制**: 不涉及。 **取值范围**： 不涉及。 **默认取值**: 不涉及。
 */
public class CoreRunClaimMatchValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_value_string")

    private String matchValueString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_value_string_list")

    private List<String> matchValueStringList = null;

    public CoreRunClaimMatchValue withMatchValueString(String matchValueString) {
        this.matchValueString = matchValueString;
        return this;
    }

    /**
     * **参数解释**：  入站认证需要校验的自定义Claim字段所要匹配的字符串值。 **约束限制**: 不涉及。 **取值范围**： 长度为 1 - 255 个字符，只包含字母数字、下划线、点号和中划线。 **默认取值**: 不涉及。
     * @return matchValueString
     */
    public String getMatchValueString() {
        return matchValueString;
    }

    public void setMatchValueString(String matchValueString) {
        this.matchValueString = matchValueString;
    }

    public CoreRunClaimMatchValue withMatchValueStringList(List<String> matchValueStringList) {
        this.matchValueStringList = matchValueStringList;
        return this;
    }

    public CoreRunClaimMatchValue addMatchValueStringListItem(String matchValueStringListItem) {
        if (this.matchValueStringList == null) {
            this.matchValueStringList = new ArrayList<>();
        }
        this.matchValueStringList.add(matchValueStringListItem);
        return this;
    }

    public CoreRunClaimMatchValue withMatchValueStringList(Consumer<List<String>> matchValueStringListSetter) {
        if (this.matchValueStringList == null) {
            this.matchValueStringList = new ArrayList<>();
        }
        matchValueStringListSetter.accept(this.matchValueStringList);
        return this;
    }

    /**
     * **参数解释**：  入站认证需要校验的自定义Claim字段所要匹配的字符串值列表。 **约束限制**: 不涉及。 **取值范围**： 最小数量 1，最大数量 50，每个值的长度为 1 - 255 个字符。 **默认取值**: 不涉及。
     * @return matchValueStringList
     */
    public List<String> getMatchValueStringList() {
        return matchValueStringList;
    }

    public void setMatchValueStringList(List<String> matchValueStringList) {
        this.matchValueStringList = matchValueStringList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreRunClaimMatchValue that = (CoreRunClaimMatchValue) obj;
        return Objects.equals(this.matchValueString, that.matchValueString)
            && Objects.equals(this.matchValueStringList, that.matchValueStringList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchValueString, matchValueStringList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreRunClaimMatchValue {\n");
        sb.append("    matchValueString: ").append(toIndentedString(matchValueString)).append("\n");
        sb.append("    matchValueStringList: ").append(toIndentedString(matchValueStringList)).append("\n");
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
