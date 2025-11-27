package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 下发自定义导出攻击事件的异步任务的请求体，用于配置攻击事件日志的导出条件和字段 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class AsyncJobReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recent")

    private String recent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nids")

    private List<String> nids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attacks")

    private List<String> attacks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nattacks")

    private List<String> nattacks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<String> rules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nrules")

    private List<String> nrules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sip")

    private String sip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sips")

    private List<String> sips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nsips")

    private List<String> nsips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urls")

    private List<String> urls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nurls")

    private List<String> nurls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<String> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nactions")

    private List<String> nactions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<String> hosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<String> instances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dump_columns")

    private List<String> dumpColumns = null;

    public AsyncJobReqBody withRecent(String recent) {
        this.recent = recent;
        return this;
    }

    /**
     * **参数解释：** 查询日志的时间范围，如1week（1周）、1month（1个月） **约束限制：** 不涉及 **取值范围：** - yesterday - today - 3days - 1week - 1month  **默认取值：** 不涉及
     * @return recent
     */
    public String getRecent() {
        return recent;
    }

    public void setRecent(String recent) {
        this.recent = recent;
    }

    public AsyncJobReqBody withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public AsyncJobReqBody addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public AsyncJobReqBody withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * **参数解释：** 查询指定事件ID列表的日志，仅导出包含这些ID的攻击事件 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public AsyncJobReqBody withNids(List<String> nids) {
        this.nids = nids;
        return this;
    }

    public AsyncJobReqBody addNidsItem(String nidsItem) {
        if (this.nids == null) {
            this.nids = new ArrayList<>();
        }
        this.nids.add(nidsItem);
        return this;
    }

    public AsyncJobReqBody withNids(Consumer<List<String>> nidsSetter) {
        if (this.nids == null) {
            this.nids = new ArrayList<>();
        }
        nidsSetter.accept(this.nids);
        return this;
    }

    /**
     * **参数解释：** 查询不包含事件ID列表的日志，排除这些ID对应的攻击事件 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return nids
     */
    public List<String> getNids() {
        return nids;
    }

    public void setNids(List<String> nids) {
        this.nids = nids;
    }

    public AsyncJobReqBody withAttacks(List<String> attacks) {
        this.attacks = attacks;
        return this;
    }

    public AsyncJobReqBody addAttacksItem(String attacksItem) {
        if (this.attacks == null) {
            this.attacks = new ArrayList<>();
        }
        this.attacks.add(attacksItem);
        return this;
    }

    public AsyncJobReqBody withAttacks(Consumer<List<String>> attacksSetter) {
        if (this.attacks == null) {
            this.attacks = new ArrayList<>();
        }
        attacksSetter.accept(this.attacks);
        return this;
    }

    /**
     * **参数解释：** 查询指定攻击类型列表的日志，仅导出这些类型的攻击事件（如SQL注入、XSS等） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return attacks
     */
    public List<String> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    public AsyncJobReqBody withNattacks(List<String> nattacks) {
        this.nattacks = nattacks;
        return this;
    }

    public AsyncJobReqBody addNattacksItem(String nattacksItem) {
        if (this.nattacks == null) {
            this.nattacks = new ArrayList<>();
        }
        this.nattacks.add(nattacksItem);
        return this;
    }

    public AsyncJobReqBody withNattacks(Consumer<List<String>> nattacksSetter) {
        if (this.nattacks == null) {
            this.nattacks = new ArrayList<>();
        }
        nattacksSetter.accept(this.nattacks);
        return this;
    }

    /**
     * **参数解释：** 查询不包含攻击类型列表的日志，排除这些类型的攻击事件 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return nattacks
     */
    public List<String> getNattacks() {
        return nattacks;
    }

    public void setNattacks(List<String> nattacks) {
        this.nattacks = nattacks;
    }

    public AsyncJobReqBody withRules(List<String> rules) {
        this.rules = rules;
        return this;
    }

    public AsyncJobReqBody addRulesItem(String rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public AsyncJobReqBody withRules(Consumer<List<String>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * **参数解释：** 查询指定命中的规则id列表的日志，仅导出命中这些规则的攻击事件 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return rules
     */
    public List<String> getRules() {
        return rules;
    }

    public void setRules(List<String> rules) {
        this.rules = rules;
    }

    public AsyncJobReqBody withNrules(List<String> nrules) {
        this.nrules = nrules;
        return this;
    }

    public AsyncJobReqBody addNrulesItem(String nrulesItem) {
        if (this.nrules == null) {
            this.nrules = new ArrayList<>();
        }
        this.nrules.add(nrulesItem);
        return this;
    }

    public AsyncJobReqBody withNrules(Consumer<List<String>> nrulesSetter) {
        if (this.nrules == null) {
            this.nrules = new ArrayList<>();
        }
        nrulesSetter.accept(this.nrules);
        return this;
    }

    /**
     * **参数解释：** 查询不包含命中的规则id列表的日志，排除命中这些规则的攻击事件 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return nrules
     */
    public List<String> getNrules() {
        return nrules;
    }

    public void setNrules(List<String> nrules) {
        this.nrules = nrules;
    }

    public AsyncJobReqBody withSip(String sip) {
        this.sip = sip;
        return this;
    }

    /**
     * **参数解释：** 查询指定源ip(模糊查询)，导出包含该IP（模糊匹配）的攻击事件 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return sip
     */
    public String getSip() {
        return sip;
    }

    public void setSip(String sip) {
        this.sip = sip;
    }

    public AsyncJobReqBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释：** 查询指定攻击的url(模糊查询)，导出包含该URL（模糊匹配）的攻击事件 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public AsyncJobReqBody withSips(List<String> sips) {
        this.sips = sips;
        return this;
    }

    public AsyncJobReqBody addSipsItem(String sipsItem) {
        if (this.sips == null) {
            this.sips = new ArrayList<>();
        }
        this.sips.add(sipsItem);
        return this;
    }

    public AsyncJobReqBody withSips(Consumer<List<String>> sipsSetter) {
        if (this.sips == null) {
            this.sips = new ArrayList<>();
        }
        sipsSetter.accept(this.sips);
        return this;
    }

    /**
     * **参数解释：** 查询指定源ip列表的日志，仅导出这些IP对应的攻击事件 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return sips
     */
    public List<String> getSips() {
        return sips;
    }

    public void setSips(List<String> sips) {
        this.sips = sips;
    }

    public AsyncJobReqBody withNsips(List<String> nsips) {
        this.nsips = nsips;
        return this;
    }

    public AsyncJobReqBody addNsipsItem(String nsipsItem) {
        if (this.nsips == null) {
            this.nsips = new ArrayList<>();
        }
        this.nsips.add(nsipsItem);
        return this;
    }

    public AsyncJobReqBody withNsips(Consumer<List<String>> nsipsSetter) {
        if (this.nsips == null) {
            this.nsips = new ArrayList<>();
        }
        nsipsSetter.accept(this.nsips);
        return this;
    }

    /**
     * **参数解释：** 查询不包含源ip列表的日志，排除这些IP对应的攻击事件 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return nsips
     */
    public List<String> getNsips() {
        return nsips;
    }

    public void setNsips(List<String> nsips) {
        this.nsips = nsips;
    }

    public AsyncJobReqBody withUrls(List<String> urls) {
        this.urls = urls;
        return this;
    }

    public AsyncJobReqBody addUrlsItem(String urlsItem) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    public AsyncJobReqBody withUrls(Consumer<List<String>> urlsSetter) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        urlsSetter.accept(this.urls);
        return this;
    }

    /**
     * **参数解释：** 查询指定攻击的url链接列表的日志，仅导出这些URL对应的攻击事件 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return urls
     */
    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public AsyncJobReqBody withNurls(List<String> nurls) {
        this.nurls = nurls;
        return this;
    }

    public AsyncJobReqBody addNurlsItem(String nurlsItem) {
        if (this.nurls == null) {
            this.nurls = new ArrayList<>();
        }
        this.nurls.add(nurlsItem);
        return this;
    }

    public AsyncJobReqBody withNurls(Consumer<List<String>> nurlsSetter) {
        if (this.nurls == null) {
            this.nurls = new ArrayList<>();
        }
        nurlsSetter.accept(this.nurls);
        return this;
    }

    /**
     * **参数解释：** 查询不包含攻击的url链接列表的日志，排除这些URL对应的攻击事件 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return nurls
     */
    public List<String> getNurls() {
        return nurls;
    }

    public void setNurls(List<String> nurls) {
        this.nurls = nurls;
    }

    public AsyncJobReqBody withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    public AsyncJobReqBody addActionsItem(String actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public AsyncJobReqBody withActions(Consumer<List<String>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * **参数解释：** 查询指定防护动作列表的日志，仅导出执行这些动作的攻击事件（如block-拦截、log-日志） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return actions
     */
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public AsyncJobReqBody withNactions(List<String> nactions) {
        this.nactions = nactions;
        return this;
    }

    public AsyncJobReqBody addNactionsItem(String nactionsItem) {
        if (this.nactions == null) {
            this.nactions = new ArrayList<>();
        }
        this.nactions.add(nactionsItem);
        return this;
    }

    public AsyncJobReqBody withNactions(Consumer<List<String>> nactionsSetter) {
        if (this.nactions == null) {
            this.nactions = new ArrayList<>();
        }
        nactionsSetter.accept(this.nactions);
        return this;
    }

    /**
     * **参数解释：** 查询不包含防护动作列表的日志，排除执行这些动作的攻击事件 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return nactions
     */
    public List<String> getNactions() {
        return nactions;
    }

    public void setNactions(List<String> nactions) {
        this.nactions = nactions;
    }

    public AsyncJobReqBody withHosts(List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    public AsyncJobReqBody addHostsItem(String hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public AsyncJobReqBody withHosts(Consumer<List<String>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * **参数解释：** 查询指定host列表的日志，仅导出这些域名对应的攻击事件 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return hosts
     */
    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    public AsyncJobReqBody withInstances(List<String> instances) {
        this.instances = instances;
        return this;
    }

    public AsyncJobReqBody addInstancesItem(String instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public AsyncJobReqBody withInstances(Consumer<List<String>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * **参数解释：** 查询指定instance列表的日志，仅导出这些实例对应的攻击事件 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return instances
     */
    public List<String> getInstances() {
        return instances;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
    }

    public AsyncJobReqBody withDumpColumns(List<String> dumpColumns) {
        this.dumpColumns = dumpColumns;
        return this;
    }

    public AsyncJobReqBody addDumpColumnsItem(String dumpColumnsItem) {
        if (this.dumpColumns == null) {
            this.dumpColumns = new ArrayList<>();
        }
        this.dumpColumns.add(dumpColumnsItem);
        return this;
    }

    public AsyncJobReqBody withDumpColumns(Consumer<List<String>> dumpColumnsSetter) {
        if (this.dumpColumns == null) {
            this.dumpColumns = new ArrayList<>();
        }
        dumpColumnsSetter.accept(this.dumpColumns);
        return this;
    }

    /**
     * **参数解释：** 需要导出的列名称，指定攻击事件日志中需要导出的字段（如时间、事件ID、攻击类型等） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return dumpColumns
     */
    public List<String> getDumpColumns() {
        return dumpColumns;
    }

    public void setDumpColumns(List<String> dumpColumns) {
        this.dumpColumns = dumpColumns;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AsyncJobReqBody that = (AsyncJobReqBody) obj;
        return Objects.equals(this.recent, that.recent) && Objects.equals(this.ids, that.ids)
            && Objects.equals(this.nids, that.nids) && Objects.equals(this.attacks, that.attacks)
            && Objects.equals(this.nattacks, that.nattacks) && Objects.equals(this.rules, that.rules)
            && Objects.equals(this.nrules, that.nrules) && Objects.equals(this.sip, that.sip)
            && Objects.equals(this.url, that.url) && Objects.equals(this.sips, that.sips)
            && Objects.equals(this.nsips, that.nsips) && Objects.equals(this.urls, that.urls)
            && Objects.equals(this.nurls, that.nurls) && Objects.equals(this.actions, that.actions)
            && Objects.equals(this.nactions, that.nactions) && Objects.equals(this.hosts, that.hosts)
            && Objects.equals(this.instances, that.instances) && Objects.equals(this.dumpColumns, that.dumpColumns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recent,
            ids,
            nids,
            attacks,
            nattacks,
            rules,
            nrules,
            sip,
            url,
            sips,
            nsips,
            urls,
            nurls,
            actions,
            nactions,
            hosts,
            instances,
            dumpColumns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AsyncJobReqBody {\n");
        sb.append("    recent: ").append(toIndentedString(recent)).append("\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    nids: ").append(toIndentedString(nids)).append("\n");
        sb.append("    attacks: ").append(toIndentedString(attacks)).append("\n");
        sb.append("    nattacks: ").append(toIndentedString(nattacks)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    nrules: ").append(toIndentedString(nrules)).append("\n");
        sb.append("    sip: ").append(toIndentedString(sip)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    sips: ").append(toIndentedString(sips)).append("\n");
        sb.append("    nsips: ").append(toIndentedString(nsips)).append("\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
        sb.append("    nurls: ").append(toIndentedString(nurls)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    nactions: ").append(toIndentedString(nactions)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    dumpColumns: ").append(toIndentedString(dumpColumns)).append("\n");
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
