package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class ListEventRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /** 查询日志的时间范围,(不能和from、to同时使用) */
    public static final class RecentEnum {

        /** Enum YESTERDAY for value: "yesterday" */
        public static final RecentEnum YESTERDAY = new RecentEnum("yesterday");

        /** Enum TODAY for value: "today" */
        public static final RecentEnum TODAY = new RecentEnum("today");

        /** Enum _3DAYS for value: "3days" */
        public static final RecentEnum _3DAYS = new RecentEnum("3days");

        /** Enum _1WEEK for value: "1week" */
        public static final RecentEnum _1WEEK = new RecentEnum("1week");

        /** Enum _1MONTH for value: "1month" */
        public static final RecentEnum _1MONTH = new RecentEnum("1month");

        private static final Map<String, RecentEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecentEnum> createStaticFields() {
            Map<String, RecentEnum> map = new HashMap<>();
            map.put("yesterday", YESTERDAY);
            map.put("today", TODAY);
            map.put("3days", _3DAYS);
            map.put("1week", _1WEEK);
            map.put("1month", _1MONTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecentEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RecentEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            RecentEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RecentEnum(value);
            }
            return result;
        }

        public static RecentEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            RecentEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RecentEnum) {
                return this.value.equals(((RecentEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recent")

    private RecentEnum recent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attacks")

    private List<String> attacks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<String> hosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pagesize")

    private Integer pagesize;

    public ListEventRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 您可以通过调用企业项目管理服务（EPS)的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListEventRequest withRecent(RecentEnum recent) {
        this.recent = recent;
        return this;
    }

    /** 查询日志的时间范围,(不能和from、to同时使用)
     * 
     * @return recent */
    public RecentEnum getRecent() {
        return recent;
    }

    public void setRecent(RecentEnum recent) {
        this.recent = recent;
    }

    public ListEventRequest withAttacks(List<String> attacks) {
        this.attacks = attacks;
        return this;
    }

    public ListEventRequest addAttacksItem(String attacksItem) {
        if (this.attacks == null) {
            this.attacks = new ArrayList<>();
        }
        this.attacks.add(attacksItem);
        return this;
    }

    public ListEventRequest withAttacks(Consumer<List<String>> attacksSetter) {
        if (this.attacks == null) {
            this.attacks = new ArrayList<>();
        }
        attacksSetter.accept(this.attacks);
        return this;
    }

    /** 攻击类型: - vuln：其它攻击类型 - sqli： sql注入攻击 - lfi： 本地文件包含 - cmdi：命令注入攻击 - xss：XSS攻击 - robot：恶意爬虫 - rfi：远程文件包含 -
     * custom_custom：精准防护 - webshell：网站木马 - custom_whiteblackip：黑白名单拦截 - custom_geoip：地理访问控制拦截 - antitamper：防篡改 -
     * anticrawler：反爬虫 - leakage：网站信息防泄漏 - illegal：非法请求
     * 
     * @return attacks */
    public List<String> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    public ListEventRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    /** 起始时间(13位时间戳)，需要和to同时使用，不能和recent参数同时使用
     * 
     * @return from */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public ListEventRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    /** 结束时间(13位时间戳)，需要和from同时使用，不能和recent参数同时使用
     * 
     * @return to */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public ListEventRequest withHosts(List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    public ListEventRequest addHostsItem(String hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public ListEventRequest withHosts(Consumer<List<String>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /** 域名id，从获取防护网站列表（ListHost）接口获取域名id
     * 
     * @return hosts */
    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    public ListEventRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /** 分页查询时，返回第几页数据。范围0-100000，默认值为1，表示返回第1页数据。
     * 
     * @return page */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListEventRequest withPagesize(Integer pagesize) {
        this.pagesize = pagesize;
        return this;
    }

    /** 分页查询时，每页包含多少条结果。范围1-100，默认值为10，表示每页包含10条结果。
     * 
     * @return pagesize */
    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEventRequest listEventRequest = (ListEventRequest) o;
        return Objects.equals(this.enterpriseProjectId, listEventRequest.enterpriseProjectId)
            && Objects.equals(this.recent, listEventRequest.recent)
            && Objects.equals(this.attacks, listEventRequest.attacks)
            && Objects.equals(this.from, listEventRequest.from) && Objects.equals(this.to, listEventRequest.to)
            && Objects.equals(this.hosts, listEventRequest.hosts) && Objects.equals(this.page, listEventRequest.page)
            && Objects.equals(this.pagesize, listEventRequest.pagesize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, recent, attacks, from, to, hosts, page, pagesize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    recent: ").append(toIndentedString(recent)).append("\n");
        sb.append("    attacks: ").append(toIndentedString(attacks)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pagesize: ").append(toIndentedString(pagesize)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
