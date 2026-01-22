package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AccessTopVO
 */
public class AccessTopVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deny_count")

    private Long denyCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deny_top_one_acl_id")

    private String denyTopOneAclId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deny_top_one_acl_name")

    private String denyTopOneAclName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hit_count")

    private Long hitCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in2out_deny_dst_ip_list")

    private List<AccessTopMemberVO> in2outDenyDstIpList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in2out_deny_dst_port_list")

    private List<AccessTopMemberVO> in2outDenyDstPortList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in2out_deny_dst_region_list")

    private List<AccessTopMemberVO> in2outDenyDstRegionList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in2out_deny_src_ip_list")

    private List<AccessTopMemberVO> in2outDenySrcIpList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "out2in_deny_dst_ip_list")

    private List<AccessTopMemberVO> out2inDenyDstIpList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "out2in_deny_dst_port_list")

    private List<AccessTopMemberVO> out2inDenyDstPortList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "out2in_deny_src_ip_list")

    private List<AccessTopMemberVO> out2inDenySrcIpList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "out2in_deny_src_port_list")

    private List<AccessTopMemberVO> out2inDenySrcPortList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "out2in_deny_src_region_list")

    private List<AccessTopMemberVO> out2inDenySrcRegionList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permit_count")

    private Long permitCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permit_top_one_acl_id")

    private String permitTopOneAclId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permit_top_one_acl_name")

    private String permitTopOneAclName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<AccessTopStatisticsVO> records = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_deny_rule_list")

    private List<AccessTopMemberVO> topDenyRuleList = null;

    public AccessTopVO withDenyCount(Long denyCount) {
        this.denyCount = denyCount;
        return this;
    }

    /**
     * **参数解释**： 阻断次数 **取值范围**： 不涉及
     * @return denyCount
     */
    public Long getDenyCount() {
        return denyCount;
    }

    public void setDenyCount(Long denyCount) {
        this.denyCount = denyCount;
    }

    public AccessTopVO withDenyTopOneAclId(String denyTopOneAclId) {
        this.denyTopOneAclId = denyTopOneAclId;
        return this;
    }

    /**
     * **参数解释**： Top命中的阻断策略ID **取值范围**： 不涉及
     * @return denyTopOneAclId
     */
    public String getDenyTopOneAclId() {
        return denyTopOneAclId;
    }

    public void setDenyTopOneAclId(String denyTopOneAclId) {
        this.denyTopOneAclId = denyTopOneAclId;
    }

    public AccessTopVO withDenyTopOneAclName(String denyTopOneAclName) {
        this.denyTopOneAclName = denyTopOneAclName;
        return this;
    }

    /**
     * **参数解释**： Top命中的阻断策略名称 **取值范围**： 不涉及
     * @return denyTopOneAclName
     */
    public String getDenyTopOneAclName() {
        return denyTopOneAclName;
    }

    public void setDenyTopOneAclName(String denyTopOneAclName) {
        this.denyTopOneAclName = denyTopOneAclName;
    }

    public AccessTopVO withHitCount(Long hitCount) {
        this.hitCount = hitCount;
        return this;
    }

    /**
     * **参数解释**： 命中次数 **取值范围**： 不涉及
     * @return hitCount
     */
    public Long getHitCount() {
        return hitCount;
    }

    public void setHitCount(Long hitCount) {
        this.hitCount = hitCount;
    }

    public AccessTopVO withIn2outDenyDstIpList(List<AccessTopMemberVO> in2outDenyDstIpList) {
        this.in2outDenyDstIpList = in2outDenyDstIpList;
        return this;
    }

    public AccessTopVO addIn2outDenyDstIpListItem(AccessTopMemberVO in2outDenyDstIpListItem) {
        if (this.in2outDenyDstIpList == null) {
            this.in2outDenyDstIpList = new ArrayList<>();
        }
        this.in2outDenyDstIpList.add(in2outDenyDstIpListItem);
        return this;
    }

    public AccessTopVO withIn2outDenyDstIpList(Consumer<List<AccessTopMemberVO>> in2outDenyDstIpListSetter) {
        if (this.in2outDenyDstIpList == null) {
            this.in2outDenyDstIpList = new ArrayList<>();
        }
        in2outDenyDstIpListSetter.accept(this.in2outDenyDstIpList);
        return this;
    }

    /**
     * **参数解释**： TOP出云阻断目的IP列表 **取值范围**： 不涉及
     * @return in2outDenyDstIpList
     */
    public List<AccessTopMemberVO> getIn2outDenyDstIpList() {
        return in2outDenyDstIpList;
    }

    public void setIn2outDenyDstIpList(List<AccessTopMemberVO> in2outDenyDstIpList) {
        this.in2outDenyDstIpList = in2outDenyDstIpList;
    }

    public AccessTopVO withIn2outDenyDstPortList(List<AccessTopMemberVO> in2outDenyDstPortList) {
        this.in2outDenyDstPortList = in2outDenyDstPortList;
        return this;
    }

    public AccessTopVO addIn2outDenyDstPortListItem(AccessTopMemberVO in2outDenyDstPortListItem) {
        if (this.in2outDenyDstPortList == null) {
            this.in2outDenyDstPortList = new ArrayList<>();
        }
        this.in2outDenyDstPortList.add(in2outDenyDstPortListItem);
        return this;
    }

    public AccessTopVO withIn2outDenyDstPortList(Consumer<List<AccessTopMemberVO>> in2outDenyDstPortListSetter) {
        if (this.in2outDenyDstPortList == null) {
            this.in2outDenyDstPortList = new ArrayList<>();
        }
        in2outDenyDstPortListSetter.accept(this.in2outDenyDstPortList);
        return this;
    }

    /**
     * **参数解释**： TOP出云阻断端口列表 **取值范围**： 不涉及
     * @return in2outDenyDstPortList
     */
    public List<AccessTopMemberVO> getIn2outDenyDstPortList() {
        return in2outDenyDstPortList;
    }

    public void setIn2outDenyDstPortList(List<AccessTopMemberVO> in2outDenyDstPortList) {
        this.in2outDenyDstPortList = in2outDenyDstPortList;
    }

    public AccessTopVO withIn2outDenyDstRegionList(List<AccessTopMemberVO> in2outDenyDstRegionList) {
        this.in2outDenyDstRegionList = in2outDenyDstRegionList;
        return this;
    }

    public AccessTopVO addIn2outDenyDstRegionListItem(AccessTopMemberVO in2outDenyDstRegionListItem) {
        if (this.in2outDenyDstRegionList == null) {
            this.in2outDenyDstRegionList = new ArrayList<>();
        }
        this.in2outDenyDstRegionList.add(in2outDenyDstRegionListItem);
        return this;
    }

    public AccessTopVO withIn2outDenyDstRegionList(Consumer<List<AccessTopMemberVO>> in2outDenyDstRegionListSetter) {
        if (this.in2outDenyDstRegionList == null) {
            this.in2outDenyDstRegionList = new ArrayList<>();
        }
        in2outDenyDstRegionListSetter.accept(this.in2outDenyDstRegionList);
        return this;
    }

    /**
     * **参数解释**： TOP出云阻断目的地区列表 **取值范围**： 不涉及
     * @return in2outDenyDstRegionList
     */
    public List<AccessTopMemberVO> getIn2outDenyDstRegionList() {
        return in2outDenyDstRegionList;
    }

    public void setIn2outDenyDstRegionList(List<AccessTopMemberVO> in2outDenyDstRegionList) {
        this.in2outDenyDstRegionList = in2outDenyDstRegionList;
    }

    public AccessTopVO withIn2outDenySrcIpList(List<AccessTopMemberVO> in2outDenySrcIpList) {
        this.in2outDenySrcIpList = in2outDenySrcIpList;
        return this;
    }

    public AccessTopVO addIn2outDenySrcIpListItem(AccessTopMemberVO in2outDenySrcIpListItem) {
        if (this.in2outDenySrcIpList == null) {
            this.in2outDenySrcIpList = new ArrayList<>();
        }
        this.in2outDenySrcIpList.add(in2outDenySrcIpListItem);
        return this;
    }

    public AccessTopVO withIn2outDenySrcIpList(Consumer<List<AccessTopMemberVO>> in2outDenySrcIpListSetter) {
        if (this.in2outDenySrcIpList == null) {
            this.in2outDenySrcIpList = new ArrayList<>();
        }
        in2outDenySrcIpListSetter.accept(this.in2outDenySrcIpList);
        return this;
    }

    /**
     * **参数解释**： TOP出云阻断源IP列表 **取值范围**： 不涉及
     * @return in2outDenySrcIpList
     */
    public List<AccessTopMemberVO> getIn2outDenySrcIpList() {
        return in2outDenySrcIpList;
    }

    public void setIn2outDenySrcIpList(List<AccessTopMemberVO> in2outDenySrcIpList) {
        this.in2outDenySrcIpList = in2outDenySrcIpList;
    }

    public AccessTopVO withOut2inDenyDstIpList(List<AccessTopMemberVO> out2inDenyDstIpList) {
        this.out2inDenyDstIpList = out2inDenyDstIpList;
        return this;
    }

    public AccessTopVO addOut2inDenyDstIpListItem(AccessTopMemberVO out2inDenyDstIpListItem) {
        if (this.out2inDenyDstIpList == null) {
            this.out2inDenyDstIpList = new ArrayList<>();
        }
        this.out2inDenyDstIpList.add(out2inDenyDstIpListItem);
        return this;
    }

    public AccessTopVO withOut2inDenyDstIpList(Consumer<List<AccessTopMemberVO>> out2inDenyDstIpListSetter) {
        if (this.out2inDenyDstIpList == null) {
            this.out2inDenyDstIpList = new ArrayList<>();
        }
        out2inDenyDstIpListSetter.accept(this.out2inDenyDstIpList);
        return this;
    }

    /**
     * **参数解释**： TOP入云阻断目的IP列表 **取值范围**： 不涉及
     * @return out2inDenyDstIpList
     */
    public List<AccessTopMemberVO> getOut2inDenyDstIpList() {
        return out2inDenyDstIpList;
    }

    public void setOut2inDenyDstIpList(List<AccessTopMemberVO> out2inDenyDstIpList) {
        this.out2inDenyDstIpList = out2inDenyDstIpList;
    }

    public AccessTopVO withOut2inDenyDstPortList(List<AccessTopMemberVO> out2inDenyDstPortList) {
        this.out2inDenyDstPortList = out2inDenyDstPortList;
        return this;
    }

    public AccessTopVO addOut2inDenyDstPortListItem(AccessTopMemberVO out2inDenyDstPortListItem) {
        if (this.out2inDenyDstPortList == null) {
            this.out2inDenyDstPortList = new ArrayList<>();
        }
        this.out2inDenyDstPortList.add(out2inDenyDstPortListItem);
        return this;
    }

    public AccessTopVO withOut2inDenyDstPortList(Consumer<List<AccessTopMemberVO>> out2inDenyDstPortListSetter) {
        if (this.out2inDenyDstPortList == null) {
            this.out2inDenyDstPortList = new ArrayList<>();
        }
        out2inDenyDstPortListSetter.accept(this.out2inDenyDstPortList);
        return this;
    }

    /**
     * **参数解释**： TOP入云阻断目的端口列表 **取值范围**： 不涉及
     * @return out2inDenyDstPortList
     */
    public List<AccessTopMemberVO> getOut2inDenyDstPortList() {
        return out2inDenyDstPortList;
    }

    public void setOut2inDenyDstPortList(List<AccessTopMemberVO> out2inDenyDstPortList) {
        this.out2inDenyDstPortList = out2inDenyDstPortList;
    }

    public AccessTopVO withOut2inDenySrcIpList(List<AccessTopMemberVO> out2inDenySrcIpList) {
        this.out2inDenySrcIpList = out2inDenySrcIpList;
        return this;
    }

    public AccessTopVO addOut2inDenySrcIpListItem(AccessTopMemberVO out2inDenySrcIpListItem) {
        if (this.out2inDenySrcIpList == null) {
            this.out2inDenySrcIpList = new ArrayList<>();
        }
        this.out2inDenySrcIpList.add(out2inDenySrcIpListItem);
        return this;
    }

    public AccessTopVO withOut2inDenySrcIpList(Consumer<List<AccessTopMemberVO>> out2inDenySrcIpListSetter) {
        if (this.out2inDenySrcIpList == null) {
            this.out2inDenySrcIpList = new ArrayList<>();
        }
        out2inDenySrcIpListSetter.accept(this.out2inDenySrcIpList);
        return this;
    }

    /**
     * **参数解释**： TOP入云阻断源IP列表 **取值范围**： 不涉及
     * @return out2inDenySrcIpList
     */
    public List<AccessTopMemberVO> getOut2inDenySrcIpList() {
        return out2inDenySrcIpList;
    }

    public void setOut2inDenySrcIpList(List<AccessTopMemberVO> out2inDenySrcIpList) {
        this.out2inDenySrcIpList = out2inDenySrcIpList;
    }

    public AccessTopVO withOut2inDenySrcPortList(List<AccessTopMemberVO> out2inDenySrcPortList) {
        this.out2inDenySrcPortList = out2inDenySrcPortList;
        return this;
    }

    public AccessTopVO addOut2inDenySrcPortListItem(AccessTopMemberVO out2inDenySrcPortListItem) {
        if (this.out2inDenySrcPortList == null) {
            this.out2inDenySrcPortList = new ArrayList<>();
        }
        this.out2inDenySrcPortList.add(out2inDenySrcPortListItem);
        return this;
    }

    public AccessTopVO withOut2inDenySrcPortList(Consumer<List<AccessTopMemberVO>> out2inDenySrcPortListSetter) {
        if (this.out2inDenySrcPortList == null) {
            this.out2inDenySrcPortList = new ArrayList<>();
        }
        out2inDenySrcPortListSetter.accept(this.out2inDenySrcPortList);
        return this;
    }

    /**
     * **参数解释**： TOP入云阻断源端口列表 **取值范围**： 不涉及
     * @return out2inDenySrcPortList
     */
    public List<AccessTopMemberVO> getOut2inDenySrcPortList() {
        return out2inDenySrcPortList;
    }

    public void setOut2inDenySrcPortList(List<AccessTopMemberVO> out2inDenySrcPortList) {
        this.out2inDenySrcPortList = out2inDenySrcPortList;
    }

    public AccessTopVO withOut2inDenySrcRegionList(List<AccessTopMemberVO> out2inDenySrcRegionList) {
        this.out2inDenySrcRegionList = out2inDenySrcRegionList;
        return this;
    }

    public AccessTopVO addOut2inDenySrcRegionListItem(AccessTopMemberVO out2inDenySrcRegionListItem) {
        if (this.out2inDenySrcRegionList == null) {
            this.out2inDenySrcRegionList = new ArrayList<>();
        }
        this.out2inDenySrcRegionList.add(out2inDenySrcRegionListItem);
        return this;
    }

    public AccessTopVO withOut2inDenySrcRegionList(Consumer<List<AccessTopMemberVO>> out2inDenySrcRegionListSetter) {
        if (this.out2inDenySrcRegionList == null) {
            this.out2inDenySrcRegionList = new ArrayList<>();
        }
        out2inDenySrcRegionListSetter.accept(this.out2inDenySrcRegionList);
        return this;
    }

    /**
     * **参数解释**： TOP入云阻断源地区列表 **取值范围**： 不涉及
     * @return out2inDenySrcRegionList
     */
    public List<AccessTopMemberVO> getOut2inDenySrcRegionList() {
        return out2inDenySrcRegionList;
    }

    public void setOut2inDenySrcRegionList(List<AccessTopMemberVO> out2inDenySrcRegionList) {
        this.out2inDenySrcRegionList = out2inDenySrcRegionList;
    }

    public AccessTopVO withPermitCount(Long permitCount) {
        this.permitCount = permitCount;
        return this;
    }

    /**
     * **参数解释**： 放行次数 **取值范围**： 不涉及
     * @return permitCount
     */
    public Long getPermitCount() {
        return permitCount;
    }

    public void setPermitCount(Long permitCount) {
        this.permitCount = permitCount;
    }

    public AccessTopVO withPermitTopOneAclId(String permitTopOneAclId) {
        this.permitTopOneAclId = permitTopOneAclId;
        return this;
    }

    /**
     * **参数解释**： 高频命中的放行策略ID **取值范围**： 不涉及
     * @return permitTopOneAclId
     */
    public String getPermitTopOneAclId() {
        return permitTopOneAclId;
    }

    public void setPermitTopOneAclId(String permitTopOneAclId) {
        this.permitTopOneAclId = permitTopOneAclId;
    }

    public AccessTopVO withPermitTopOneAclName(String permitTopOneAclName) {
        this.permitTopOneAclName = permitTopOneAclName;
        return this;
    }

    /**
     * **参数解释**： 高频命中的放行策略名称 **取值范围**： 不涉及
     * @return permitTopOneAclName
     */
    public String getPermitTopOneAclName() {
        return permitTopOneAclName;
    }

    public void setPermitTopOneAclName(String permitTopOneAclName) {
        this.permitTopOneAclName = permitTopOneAclName;
    }

    public AccessTopVO withRecords(List<AccessTopStatisticsVO> records) {
        this.records = records;
        return this;
    }

    public AccessTopVO addRecordsItem(AccessTopStatisticsVO recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public AccessTopVO withRecords(Consumer<List<AccessTopStatisticsVO>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * **参数解释**： 命中趋势 **取值范围**： 不涉及
     * @return records
     */
    public List<AccessTopStatisticsVO> getRecords() {
        return records;
    }

    public void setRecords(List<AccessTopStatisticsVO> records) {
        this.records = records;
    }

    public AccessTopVO withTopDenyRuleList(List<AccessTopMemberVO> topDenyRuleList) {
        this.topDenyRuleList = topDenyRuleList;
        return this;
    }

    public AccessTopVO addTopDenyRuleListItem(AccessTopMemberVO topDenyRuleListItem) {
        if (this.topDenyRuleList == null) {
            this.topDenyRuleList = new ArrayList<>();
        }
        this.topDenyRuleList.add(topDenyRuleListItem);
        return this;
    }

    public AccessTopVO withTopDenyRuleList(Consumer<List<AccessTopMemberVO>> topDenyRuleListSetter) {
        if (this.topDenyRuleList == null) {
            this.topDenyRuleList = new ArrayList<>();
        }
        topDenyRuleListSetter.accept(this.topDenyRuleList);
        return this;
    }

    /**
     * **参数解释**： TOP阻断规则列表 **取值范围**： 不涉及
     * @return topDenyRuleList
     */
    public List<AccessTopMemberVO> getTopDenyRuleList() {
        return topDenyRuleList;
    }

    public void setTopDenyRuleList(List<AccessTopMemberVO> topDenyRuleList) {
        this.topDenyRuleList = topDenyRuleList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessTopVO that = (AccessTopVO) obj;
        return Objects.equals(this.denyCount, that.denyCount)
            && Objects.equals(this.denyTopOneAclId, that.denyTopOneAclId)
            && Objects.equals(this.denyTopOneAclName, that.denyTopOneAclName)
            && Objects.equals(this.hitCount, that.hitCount)
            && Objects.equals(this.in2outDenyDstIpList, that.in2outDenyDstIpList)
            && Objects.equals(this.in2outDenyDstPortList, that.in2outDenyDstPortList)
            && Objects.equals(this.in2outDenyDstRegionList, that.in2outDenyDstRegionList)
            && Objects.equals(this.in2outDenySrcIpList, that.in2outDenySrcIpList)
            && Objects.equals(this.out2inDenyDstIpList, that.out2inDenyDstIpList)
            && Objects.equals(this.out2inDenyDstPortList, that.out2inDenyDstPortList)
            && Objects.equals(this.out2inDenySrcIpList, that.out2inDenySrcIpList)
            && Objects.equals(this.out2inDenySrcPortList, that.out2inDenySrcPortList)
            && Objects.equals(this.out2inDenySrcRegionList, that.out2inDenySrcRegionList)
            && Objects.equals(this.permitCount, that.permitCount)
            && Objects.equals(this.permitTopOneAclId, that.permitTopOneAclId)
            && Objects.equals(this.permitTopOneAclName, that.permitTopOneAclName)
            && Objects.equals(this.records, that.records) && Objects.equals(this.topDenyRuleList, that.topDenyRuleList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denyCount,
            denyTopOneAclId,
            denyTopOneAclName,
            hitCount,
            in2outDenyDstIpList,
            in2outDenyDstPortList,
            in2outDenyDstRegionList,
            in2outDenySrcIpList,
            out2inDenyDstIpList,
            out2inDenyDstPortList,
            out2inDenySrcIpList,
            out2inDenySrcPortList,
            out2inDenySrcRegionList,
            permitCount,
            permitTopOneAclId,
            permitTopOneAclName,
            records,
            topDenyRuleList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessTopVO {\n");
        sb.append("    denyCount: ").append(toIndentedString(denyCount)).append("\n");
        sb.append("    denyTopOneAclId: ").append(toIndentedString(denyTopOneAclId)).append("\n");
        sb.append("    denyTopOneAclName: ").append(toIndentedString(denyTopOneAclName)).append("\n");
        sb.append("    hitCount: ").append(toIndentedString(hitCount)).append("\n");
        sb.append("    in2outDenyDstIpList: ").append(toIndentedString(in2outDenyDstIpList)).append("\n");
        sb.append("    in2outDenyDstPortList: ").append(toIndentedString(in2outDenyDstPortList)).append("\n");
        sb.append("    in2outDenyDstRegionList: ").append(toIndentedString(in2outDenyDstRegionList)).append("\n");
        sb.append("    in2outDenySrcIpList: ").append(toIndentedString(in2outDenySrcIpList)).append("\n");
        sb.append("    out2inDenyDstIpList: ").append(toIndentedString(out2inDenyDstIpList)).append("\n");
        sb.append("    out2inDenyDstPortList: ").append(toIndentedString(out2inDenyDstPortList)).append("\n");
        sb.append("    out2inDenySrcIpList: ").append(toIndentedString(out2inDenySrcIpList)).append("\n");
        sb.append("    out2inDenySrcPortList: ").append(toIndentedString(out2inDenySrcPortList)).append("\n");
        sb.append("    out2inDenySrcRegionList: ").append(toIndentedString(out2inDenySrcRegionList)).append("\n");
        sb.append("    permitCount: ").append(toIndentedString(permitCount)).append("\n");
        sb.append("    permitTopOneAclId: ").append(toIndentedString(permitTopOneAclId)).append("\n");
        sb.append("    permitTopOneAclName: ").append(toIndentedString(permitTopOneAclName)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    topDenyRuleList: ").append(toIndentedString(topDenyRuleList)).append("\n");
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
