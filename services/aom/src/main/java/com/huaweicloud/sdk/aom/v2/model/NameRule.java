package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 服务发现规则命名部分。
 */
public class NameRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "appNameRule")

    private List<AppNameRule> appNameRule = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicationNameRule")

    private List<ApplicationNameRule> applicationNameRule = null;

    public NameRule withAppNameRule(List<AppNameRule> appNameRule) {
        this.appNameRule = appNameRule;
        return this;
    }

    public NameRule addAppNameRuleItem(AppNameRule appNameRuleItem) {
        if (this.appNameRule == null) {
            this.appNameRule = new ArrayList<>();
        }
        this.appNameRule.add(appNameRuleItem);
        return this;
    }

    public NameRule withAppNameRule(Consumer<List<AppNameRule>> appNameRuleSetter) {
        if (this.appNameRule == null) {
            this.appNameRule = new ArrayList<>();
        }
        appNameRuleSetter.accept(this.appNameRule);
        return this;
    }

    /**
     * 服务命名部分,数组中有多个对象时表示将每个对象抽取到的字符串拼接作为服务的名称。 nameType取值cmdLine时args格式为[\"start\",\"end\"],表示抽取命令行中start、end之间的字符。 nameType取值cmdLine时args格式为[\"aa\"],表示抽取环境变量名为aa对应的环境变量值。 nameType取值str时,args格式为[\"fix\"],表示服务名称最后拼接固定文字fix。 nameType取值cmdLineHash时,args格式为[\"0001\"],value格式为[\"ser\"],表示当启动命令是0001时,服务名称为ser。
     * @return appNameRule
     */
    public List<AppNameRule> getAppNameRule() {
        return appNameRule;
    }

    public void setAppNameRule(List<AppNameRule> appNameRule) {
        this.appNameRule = appNameRule;
    }

    public NameRule withApplicationNameRule(List<ApplicationNameRule> applicationNameRule) {
        this.applicationNameRule = applicationNameRule;
        return this;
    }

    public NameRule addApplicationNameRuleItem(ApplicationNameRule applicationNameRuleItem) {
        if (this.applicationNameRule == null) {
            this.applicationNameRule = new ArrayList<>();
        }
        this.applicationNameRule.add(applicationNameRuleItem);
        return this;
    }

    public NameRule withApplicationNameRule(Consumer<List<ApplicationNameRule>> applicationNameRuleSetter) {
        if (this.applicationNameRule == null) {
            this.applicationNameRule = new ArrayList<>();
        }
        applicationNameRuleSetter.accept(this.applicationNameRule);
        return this;
    }

    /**
     * 应用命名部分。 nameType取值cmdLine时args格式为[\"start\",\"end\"],表示抽取命令行中start、end之间的字符。 nameType取值cmdLine时args格式为 [\"aa\"],表示抽取环境变量名为aa对应的环境变量值。 nameType取值str时,args格式为[\"fix\"],表示服务名称最后拼接固定文字fix。 nameType取值cmdLineHash时,args格式为[\"0001\"],value格式为[\"ser\"],表示当启动命令是0001时,应用名称为ser。
     * @return applicationNameRule
     */
    public List<ApplicationNameRule> getApplicationNameRule() {
        return applicationNameRule;
    }

    public void setApplicationNameRule(List<ApplicationNameRule> applicationNameRule) {
        this.applicationNameRule = applicationNameRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NameRule that = (NameRule) obj;
        return Objects.equals(this.appNameRule, that.appNameRule)
            && Objects.equals(this.applicationNameRule, that.applicationNameRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appNameRule, applicationNameRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NameRule {\n");
        sb.append("    appNameRule: ").append(toIndentedString(appNameRule)).append("\n");
        sb.append("    applicationNameRule: ").append(toIndentedString(applicationNameRule)).append("\n");
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
