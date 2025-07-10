package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 匹配条件列表 **约束限制：** 不涉及
 */
public class Criteria {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_target_type")

    private String matchTargetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_target_name")

    private String matchTargetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_type")

    private String matchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_pattern")

    private List<String> matchPattern = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "negate")

    private Boolean negate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_sensitive")

    private Boolean caseSensitive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic")

    private String logic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_criteria")

    private List<Criteria> subCriteria = null;

    public Criteria withMatchTargetType(String matchTargetType) {
        this.matchTargetType = matchTargetType;
        return this;
    }

    /**
     * **参数解释：** 匹配目标类型 **约束限制：** 不涉及 **取值范围：** - schema: 客户端请求使用的协议类型 - method: 客户端请求IP使用的请求方法 - path: 客户端请求URL路径 - arg: 客户端请求URL中的查询参数 - extension: 客户端请求IP内容的文件后缀 - filename: 客户端请求IP内容的文件名称 - header: HTTP请求头部 - clientip: 客户端请求IP的客户端IP - clientip_version: 客户端请求IP的客户端IP版本 - ua: 客户端请求IP头中的User-Agent - ngx_variable: Nginx变量 **默认取值：** 不涉及
     * @return matchTargetType
     */
    public String getMatchTargetType() {
        return matchTargetType;
    }

    public void setMatchTargetType(String matchTargetType) {
        this.matchTargetType = matchTargetType;
    }

    public Criteria withMatchTargetName(String matchTargetName) {
        this.matchTargetName = matchTargetName;
        return this;
    }

    /**
     * **参数解释：** 匹配目标名称 **约束限制：** 不涉及 **取值范围：** - 当匹配目标类型为schema、method、path、extension、filename、ua时，该值为空 - 当匹配目标类型为arg时表示查询参数名，长度1-100，由数字，大小写字母，中划线和下划线组成，只能以字母开头 - 当匹配目标类型为header时表示请求头的名称，长度1-100，由数字，大小写字母，中划线和下划线组成，只能以字母开头 - 当匹配目标类型为clientip时表示ip来源，取值：connect：建联IP；xff：x-forwarded-for头 - 当匹配目标类型为clientip_version时表示ip版本来源，取值：connect：建联IP；xff：x-forwarded-for头 - 当匹配目标类型为ngx_variable时表示Nginx变量名，仅支持$protocol、$arg_、$http_、$scheme、$uri、$ssl_protocol、$ssl_server_name、$remote_addr、$http2、$request_method、$sent_http_ **默认取值：** 不涉及
     * @return matchTargetName
     */
    public String getMatchTargetName() {
        return matchTargetName;
    }

    public void setMatchTargetName(String matchTargetName) {
        this.matchTargetName = matchTargetName;
    }

    public Criteria withMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * **参数解释：** 匹配算法 **约束限制：** 不涉及 **取值范围：** contains：包含匹配，匹配到match_pattern任意一个条件即匹配成功 **默认取值：** 不涉及
     * @return matchType
     */
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public Criteria withMatchPattern(List<String> matchPattern) {
        this.matchPattern = matchPattern;
        return this;
    }

    public Criteria addMatchPatternItem(String matchPatternItem) {
        if (this.matchPattern == null) {
            this.matchPattern = new ArrayList<>();
        }
        this.matchPattern.add(matchPatternItem);
        return this;
    }

    public Criteria withMatchPattern(Consumer<List<String>> matchPatternSetter) {
        if (this.matchPattern == null) {
            this.matchPattern = new ArrayList<>();
        }
        matchPatternSetter.accept(this.matchPattern);
        return this;
    }

    /**
     * **参数解释：** 匹配内容 **约束限制：** 不涉及 **取值范围：** - 当匹配目标类型为schema时，取值：HTTP，HTTPS - 当匹配目标类型为method时，取值：GET，PUT，POST，DELETE，HEAD，OPTIONS，PATCH，TRACE，CONNECT - 当匹配目标类型为clientip_version时，取值：IPv4，IPv6 - 当匹配目标类型为path和ua时，支持配置通配符“*” **默认取值：** 不涉及
     * @return matchPattern
     */
    public List<String> getMatchPattern() {
        return matchPattern;
    }

    public void setMatchPattern(List<String> matchPattern) {
        this.matchPattern = matchPattern;
    }

    public Criteria withNegate(Boolean negate) {
        this.negate = negate;
        return this;
    }

    /**
     * **参数解释：** 是否取反，与match_type配合使用。例：negate配置为true，match_type配置为contains，则实际业务逻辑将转换为not_contains **约束限制：** 不涉及 **取值范围：** - true: 取反 - false: 不取反 **默认取值：** false: 不取反
     * @return negate
     */
    public Boolean getNegate() {
        return negate;
    }

    public void setNegate(Boolean negate) {
        this.negate = negate;
    }

    public Criteria withCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }

    /**
     * **参数解释：** 是否区分大小写 **约束限制：** 不涉及 **取值范围：** - true: 区分大小写 - false: 不区分大小写 **默认取值：** false: 不区分大小写
     * @return caseSensitive
     */
    public Boolean getCaseSensitive() {
        return caseSensitive;
    }

    public void setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    public Criteria withLogic(String logic) {
        this.logic = logic;
        return this;
    }

    /**
     * **参数解释：** 嵌套条件逻辑运算符 **约束限制：** 不涉及 **取值范围：** - and: 与关系 - or: 或关系 **默认取值：** 不涉及
     * @return logic
     */
    public String getLogic() {
        return logic;
    }

    public void setLogic(String logic) {
        this.logic = logic;
    }

    public Criteria withSubCriteria(List<Criteria> subCriteria) {
        this.subCriteria = subCriteria;
        return this;
    }

    public Criteria addSubCriteriaItem(Criteria subCriteriaItem) {
        if (this.subCriteria == null) {
            this.subCriteria = new ArrayList<>();
        }
        this.subCriteria.add(subCriteriaItem);
        return this;
    }

    public Criteria withSubCriteria(Consumer<List<Criteria>> subCriteriaSetter) {
        if (this.subCriteria == null) {
            this.subCriteria = new ArrayList<>();
        }
        subCriteriaSetter.accept(this.subCriteria);
        return this;
    }

    /**
     * **参数解释：** 嵌套条件列表 **约束限制：** 不涉及
     * @return subCriteria
     */
    public List<Criteria> getSubCriteria() {
        return subCriteria;
    }

    public void setSubCriteria(List<Criteria> subCriteria) {
        this.subCriteria = subCriteria;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Criteria that = (Criteria) obj;
        return Objects.equals(this.matchTargetType, that.matchTargetType)
            && Objects.equals(this.matchTargetName, that.matchTargetName)
            && Objects.equals(this.matchType, that.matchType) && Objects.equals(this.matchPattern, that.matchPattern)
            && Objects.equals(this.negate, that.negate) && Objects.equals(this.caseSensitive, that.caseSensitive)
            && Objects.equals(this.logic, that.logic) && Objects.equals(this.subCriteria, that.subCriteria);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(matchTargetType, matchTargetName, matchType, matchPattern, negate, caseSensitive, logic, subCriteria);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Criteria {\n");
        sb.append("    matchTargetType: ").append(toIndentedString(matchTargetType)).append("\n");
        sb.append("    matchTargetName: ").append(toIndentedString(matchTargetName)).append("\n");
        sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
        sb.append("    matchPattern: ").append(toIndentedString(matchPattern)).append("\n");
        sb.append("    negate: ").append(toIndentedString(negate)).append("\n");
        sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
        sb.append("    logic: ").append(toIndentedString(logic)).append("\n");
        sb.append("    subCriteria: ").append(toIndentedString(subCriteria)).append("\n");
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
