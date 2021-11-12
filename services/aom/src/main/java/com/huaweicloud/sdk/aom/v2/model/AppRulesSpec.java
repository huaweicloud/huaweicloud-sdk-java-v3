package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.DiscoveryRule;
import com.huaweicloud.sdk.aom.v2.model.LogPathRule;
import com.huaweicloud.sdk.aom.v2.model.NameRule;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 规则详情。
 */
public class AppRulesSpec  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="appType")
    
    
    private String appType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attrList")
    
    
    private List<String> attrList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detectLog")
    
    
    private String detectLog;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discoveryRule")
    
    
    private List<DiscoveryRule> discoveryRule = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isDefaultRule")
    
    
    private String isDefaultRule;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isDetect")
    
    
    private String isDetect;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logFileFix")
    
    
    private List<String> logFileFix = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logPathRule")
    
    
    private List<LogPathRule> logPathRule = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nameRule")
    
    
    private NameRule nameRule;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="priority")
    
    
    private String priority;

    public AppRulesSpec withAppType(String appType) {
        this.appType = appType;
        return this;
    }

    


    /**
     * 服务类型,用于标记服务的分类,仅用于规则分类和界面展示。可以填写任意字段,如按技术栈分类可填写Java,Python。按作用分类可填写collector(采集),database(数据库)等。
     * @return appType
     */
    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    

    public AppRulesSpec withAttrList(List<String> attrList) {
        this.attrList = attrList;
        return this;
    }

    
    public AppRulesSpec addAttrListItem(String attrListItem) {
        if(this.attrList == null) {
            this.attrList = new ArrayList<>();
        }
        this.attrList.add(attrListItem);
        return this;
    }

    public AppRulesSpec withAttrList(Consumer<List<String>> attrListSetter) {
        if(this.attrList == null) {
            this.attrList = new ArrayList<>();
        }
        attrListSetter.accept(this.attrList);
        return this;
    }

    /**
     * cmdLine、env 属性列表(暂不使用,可不传)。
     * @return attrList
     */
    public List<String> getAttrList() {
        return attrList;
    }

    public void setAttrList(List<String> attrList) {
        this.attrList = attrList;
    }

    

    public AppRulesSpec withDetectLog(String detectLog) {
        this.detectLog = detectLog;
        return this;
    }

    


    /**
     * true、false 是否开启日志采集。
     * @return detectLog
     */
    public String getDetectLog() {
        return detectLog;
    }

    public void setDetectLog(String detectLog) {
        this.detectLog = detectLog;
    }

    

    public AppRulesSpec withDiscoveryRule(List<DiscoveryRule> discoveryRule) {
        this.discoveryRule = discoveryRule;
        return this;
    }

    
    public AppRulesSpec addDiscoveryRuleItem(DiscoveryRule discoveryRuleItem) {
        if(this.discoveryRule == null) {
            this.discoveryRule = new ArrayList<>();
        }
        this.discoveryRule.add(discoveryRuleItem);
        return this;
    }

    public AppRulesSpec withDiscoveryRule(Consumer<List<DiscoveryRule>> discoveryRuleSetter) {
        if(this.discoveryRule == null) {
            this.discoveryRule = new ArrayList<>();
        }
        discoveryRuleSetter.accept(this.discoveryRule);
        return this;
    }

    /**
     * checkType为cmdLine时checkMode填contain,checkContent格式为[“xxx”]表示进程命令行参数中需要包含xxx。checkType为env时checkMode填contain,checkContent格式为 [\"k1\",\"v1\"]表示进程环境变量中需要包含名为k1值为v1的环境变量。checkType为scope时checkMode填equals,checkContent格式为节点ID数组[\"hostId1”,”hostId2”],表示规则仅会在这些节点上生效(如果不指定节点范围,规则将下发到该项目所有的节点)。 规则发现部分,数组中有多个对象时表示需要同时满足所有条件的进程才会被匹配到。
     * @return discoveryRule
     */
    public List<DiscoveryRule> getDiscoveryRule() {
        return discoveryRule;
    }

    public void setDiscoveryRule(List<DiscoveryRule> discoveryRule) {
        this.discoveryRule = discoveryRule;
    }

    

    public AppRulesSpec withIsDefaultRule(String isDefaultRule) {
        this.isDefaultRule = isDefaultRule;
        return this;
    }

    


    /**
     * true、false 是否为默认规则。
     * @return isDefaultRule
     */
    public String getIsDefaultRule() {
        return isDefaultRule;
    }

    public void setIsDefaultRule(String isDefaultRule) {
        this.isDefaultRule = isDefaultRule;
    }

    

    public AppRulesSpec withIsDetect(String isDetect) {
        this.isDetect = isDetect;
        return this;
    }

    


    /**
     * true、false 是否为规则预探测场景(预探测场景不会保存规则,仅用于规则下发之前对规则正确性的检测)。
     * @return isDetect
     */
    public String getIsDetect() {
        return isDetect;
    }

    public void setIsDetect(String isDetect) {
        this.isDetect = isDetect;
    }

    

    public AppRulesSpec withLogFileFix(List<String> logFileFix) {
        this.logFileFix = logFileFix;
        return this;
    }

    
    public AppRulesSpec addLogFileFixItem(String logFileFixItem) {
        if(this.logFileFix == null) {
            this.logFileFix = new ArrayList<>();
        }
        this.logFileFix.add(logFileFixItem);
        return this;
    }

    public AppRulesSpec withLogFileFix(Consumer<List<String>> logFileFixSetter) {
        if(this.logFileFix == null) {
            this.logFileFix = new ArrayList<>();
        }
        logFileFixSetter.accept(this.logFileFix);
        return this;
    }

    /**
     * log、trace、out 日志文件的后缀。
     * @return logFileFix
     */
    public List<String> getLogFileFix() {
        return logFileFix;
    }

    public void setLogFileFix(List<String> logFileFix) {
        this.logFileFix = logFileFix;
    }

    

    public AppRulesSpec withLogPathRule(List<LogPathRule> logPathRule) {
        this.logPathRule = logPathRule;
        return this;
    }

    
    public AppRulesSpec addLogPathRuleItem(LogPathRule logPathRuleItem) {
        if(this.logPathRule == null) {
            this.logPathRule = new ArrayList<>();
        }
        this.logPathRule.add(logPathRuleItem);
        return this;
    }

    public AppRulesSpec withLogPathRule(Consumer<List<LogPathRule>> logPathRuleSetter) {
        if(this.logPathRule == null) {
            this.logPathRule = new ArrayList<>();
        }
        logPathRuleSetter.accept(this.logPathRule);
        return this;
    }

    /**
     * 当cmdLineHash为固定字符串时,指定日志路径或者日志文件。否则只采集进程当前打开的以.log和.trace结尾的文件。nameType取值cmdLineHash时,args格式为[\"00001\"],value格式为[\"/xxx/xx.log\"],表示当启动命令是00001时,日志路径为/xxx/xx.log。 日志路径配置规则。
     * @return logPathRule
     */
    public List<LogPathRule> getLogPathRule() {
        return logPathRule;
    }

    public void setLogPathRule(List<LogPathRule> logPathRule) {
        this.logPathRule = logPathRule;
    }

    

    public AppRulesSpec withNameRule(NameRule nameRule) {
        this.nameRule = nameRule;
        return this;
    }

    public AppRulesSpec withNameRule(Consumer<NameRule> nameRuleSetter) {
        if(this.nameRule == null ){
            this.nameRule = new NameRule();
            nameRuleSetter.accept(this.nameRule);
        }
        
        return this;
    }


    /**
     * Get nameRule
     * @return nameRule
     */
    public NameRule getNameRule() {
        return nameRule;
    }

    public void setNameRule(NameRule nameRule) {
        this.nameRule = nameRule;
    }

    

    public AppRulesSpec withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    


    /**
     * 1~9999的整数字符串,默认取值为9999 规则优先级。
     * @return priority
     */
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppRulesSpec appRulesSpec = (AppRulesSpec) o;
        return Objects.equals(this.appType, appRulesSpec.appType) &&
            Objects.equals(this.attrList, appRulesSpec.attrList) &&
            Objects.equals(this.detectLog, appRulesSpec.detectLog) &&
            Objects.equals(this.discoveryRule, appRulesSpec.discoveryRule) &&
            Objects.equals(this.isDefaultRule, appRulesSpec.isDefaultRule) &&
            Objects.equals(this.isDetect, appRulesSpec.isDetect) &&
            Objects.equals(this.logFileFix, appRulesSpec.logFileFix) &&
            Objects.equals(this.logPathRule, appRulesSpec.logPathRule) &&
            Objects.equals(this.nameRule, appRulesSpec.nameRule) &&
            Objects.equals(this.priority, appRulesSpec.priority);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appType, attrList, detectLog, discoveryRule, isDefaultRule, isDetect, logFileFix, logPathRule, nameRule, priority);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppRulesSpec {\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    attrList: ").append(toIndentedString(attrList)).append("\n");
        sb.append("    detectLog: ").append(toIndentedString(detectLog)).append("\n");
        sb.append("    discoveryRule: ").append(toIndentedString(discoveryRule)).append("\n");
        sb.append("    isDefaultRule: ").append(toIndentedString(isDefaultRule)).append("\n");
        sb.append("    isDetect: ").append(toIndentedString(isDetect)).append("\n");
        sb.append("    logFileFix: ").append(toIndentedString(logFileFix)).append("\n");
        sb.append("    logPathRule: ").append(toIndentedString(logPathRule)).append("\n");
        sb.append("    nameRule: ").append(toIndentedString(nameRule)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

