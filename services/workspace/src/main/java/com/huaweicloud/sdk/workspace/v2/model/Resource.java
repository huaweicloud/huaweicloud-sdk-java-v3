package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 包周期资源对象
 */
public class Resource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    private Integer isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_volumes")

    private AddVolumes addVolumes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_desktops")

    private CreateDesktopReq createDesktops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deh_hosts")

    private Hosts dehHosts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rebuild_desktops")

    private RebuildDesktopsReq rebuildDesktops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_desktops")

    private AttachInstancesReq attachDesktops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_exclusive_hosts")

    private CreateExclusiveHostsReq createExclusiveHosts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resize_exclusive_lites")

    private ResizeExclusiveLitesReq resizeExclusiveLites;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_desktop_pool")

    private CreateDesktopPoolReq createDesktopPool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expand_desktop_pool")

    private ExpandDesktopPoolOrderReq expandDesktopPool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_desktops_internet")

    private ApplyDesktopsInternet applyDesktopsInternet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_subnet_bandwidth")

    private ApplySubnetBandwidthReq applySubnetBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscribe_user_sharer")

    private SubscribeUserSharerReq subscribeUserSharer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_console_url")

    private String cloudServiceConsoleUrl;

    public Resource withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 订购周期类型：2：月；3：年；4：包小时（仅限带宽加油包购买场景使用）5：绝对时间；（追加附属资源场景使用，比如主机上追加云硬盘）6：一次性（chargingMode=1 一次性计费场景使用），必填
     * minimum: 0
     * maximum: 255
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public Resource withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订购周期数
     * minimum: 0
     * maximum: 2147483647
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public Resource withIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 是否续订
     * minimum: 0
     * maximum: 255
     * @return isAutoRenew
     */
    public Integer getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public Resource withAddVolumes(AddVolumes addVolumes) {
        this.addVolumes = addVolumes;
        return this;
    }

    public Resource withAddVolumes(Consumer<AddVolumes> addVolumesSetter) {
        if (this.addVolumes == null) {
            this.addVolumes = new AddVolumes();
            addVolumesSetter.accept(this.addVolumes);
        }

        return this;
    }

    /**
     * Get addVolumes
     * @return addVolumes
     */
    public AddVolumes getAddVolumes() {
        return addVolumes;
    }

    public void setAddVolumes(AddVolumes addVolumes) {
        this.addVolumes = addVolumes;
    }

    public Resource withCreateDesktops(CreateDesktopReq createDesktops) {
        this.createDesktops = createDesktops;
        return this;
    }

    public Resource withCreateDesktops(Consumer<CreateDesktopReq> createDesktopsSetter) {
        if (this.createDesktops == null) {
            this.createDesktops = new CreateDesktopReq();
            createDesktopsSetter.accept(this.createDesktops);
        }

        return this;
    }

    /**
     * Get createDesktops
     * @return createDesktops
     */
    public CreateDesktopReq getCreateDesktops() {
        return createDesktops;
    }

    public void setCreateDesktops(CreateDesktopReq createDesktops) {
        this.createDesktops = createDesktops;
    }

    public Resource withDehHosts(Hosts dehHosts) {
        this.dehHosts = dehHosts;
        return this;
    }

    public Resource withDehHosts(Consumer<Hosts> dehHostsSetter) {
        if (this.dehHosts == null) {
            this.dehHosts = new Hosts();
            dehHostsSetter.accept(this.dehHosts);
        }

        return this;
    }

    /**
     * Get dehHosts
     * @return dehHosts
     */
    public Hosts getDehHosts() {
        return dehHosts;
    }

    public void setDehHosts(Hosts dehHosts) {
        this.dehHosts = dehHosts;
    }

    public Resource withRebuildDesktops(RebuildDesktopsReq rebuildDesktops) {
        this.rebuildDesktops = rebuildDesktops;
        return this;
    }

    public Resource withRebuildDesktops(Consumer<RebuildDesktopsReq> rebuildDesktopsSetter) {
        if (this.rebuildDesktops == null) {
            this.rebuildDesktops = new RebuildDesktopsReq();
            rebuildDesktopsSetter.accept(this.rebuildDesktops);
        }

        return this;
    }

    /**
     * Get rebuildDesktops
     * @return rebuildDesktops
     */
    public RebuildDesktopsReq getRebuildDesktops() {
        return rebuildDesktops;
    }

    public void setRebuildDesktops(RebuildDesktopsReq rebuildDesktops) {
        this.rebuildDesktops = rebuildDesktops;
    }

    public Resource withAttachDesktops(AttachInstancesReq attachDesktops) {
        this.attachDesktops = attachDesktops;
        return this;
    }

    public Resource withAttachDesktops(Consumer<AttachInstancesReq> attachDesktopsSetter) {
        if (this.attachDesktops == null) {
            this.attachDesktops = new AttachInstancesReq();
            attachDesktopsSetter.accept(this.attachDesktops);
        }

        return this;
    }

    /**
     * Get attachDesktops
     * @return attachDesktops
     */
    public AttachInstancesReq getAttachDesktops() {
        return attachDesktops;
    }

    public void setAttachDesktops(AttachInstancesReq attachDesktops) {
        this.attachDesktops = attachDesktops;
    }

    public Resource withCreateExclusiveHosts(CreateExclusiveHostsReq createExclusiveHosts) {
        this.createExclusiveHosts = createExclusiveHosts;
        return this;
    }

    public Resource withCreateExclusiveHosts(Consumer<CreateExclusiveHostsReq> createExclusiveHostsSetter) {
        if (this.createExclusiveHosts == null) {
            this.createExclusiveHosts = new CreateExclusiveHostsReq();
            createExclusiveHostsSetter.accept(this.createExclusiveHosts);
        }

        return this;
    }

    /**
     * Get createExclusiveHosts
     * @return createExclusiveHosts
     */
    public CreateExclusiveHostsReq getCreateExclusiveHosts() {
        return createExclusiveHosts;
    }

    public void setCreateExclusiveHosts(CreateExclusiveHostsReq createExclusiveHosts) {
        this.createExclusiveHosts = createExclusiveHosts;
    }

    public Resource withResizeExclusiveLites(ResizeExclusiveLitesReq resizeExclusiveLites) {
        this.resizeExclusiveLites = resizeExclusiveLites;
        return this;
    }

    public Resource withResizeExclusiveLites(Consumer<ResizeExclusiveLitesReq> resizeExclusiveLitesSetter) {
        if (this.resizeExclusiveLites == null) {
            this.resizeExclusiveLites = new ResizeExclusiveLitesReq();
            resizeExclusiveLitesSetter.accept(this.resizeExclusiveLites);
        }

        return this;
    }

    /**
     * Get resizeExclusiveLites
     * @return resizeExclusiveLites
     */
    public ResizeExclusiveLitesReq getResizeExclusiveLites() {
        return resizeExclusiveLites;
    }

    public void setResizeExclusiveLites(ResizeExclusiveLitesReq resizeExclusiveLites) {
        this.resizeExclusiveLites = resizeExclusiveLites;
    }

    public Resource withCreateDesktopPool(CreateDesktopPoolReq createDesktopPool) {
        this.createDesktopPool = createDesktopPool;
        return this;
    }

    public Resource withCreateDesktopPool(Consumer<CreateDesktopPoolReq> createDesktopPoolSetter) {
        if (this.createDesktopPool == null) {
            this.createDesktopPool = new CreateDesktopPoolReq();
            createDesktopPoolSetter.accept(this.createDesktopPool);
        }

        return this;
    }

    /**
     * Get createDesktopPool
     * @return createDesktopPool
     */
    public CreateDesktopPoolReq getCreateDesktopPool() {
        return createDesktopPool;
    }

    public void setCreateDesktopPool(CreateDesktopPoolReq createDesktopPool) {
        this.createDesktopPool = createDesktopPool;
    }

    public Resource withExpandDesktopPool(ExpandDesktopPoolOrderReq expandDesktopPool) {
        this.expandDesktopPool = expandDesktopPool;
        return this;
    }

    public Resource withExpandDesktopPool(Consumer<ExpandDesktopPoolOrderReq> expandDesktopPoolSetter) {
        if (this.expandDesktopPool == null) {
            this.expandDesktopPool = new ExpandDesktopPoolOrderReq();
            expandDesktopPoolSetter.accept(this.expandDesktopPool);
        }

        return this;
    }

    /**
     * Get expandDesktopPool
     * @return expandDesktopPool
     */
    public ExpandDesktopPoolOrderReq getExpandDesktopPool() {
        return expandDesktopPool;
    }

    public void setExpandDesktopPool(ExpandDesktopPoolOrderReq expandDesktopPool) {
        this.expandDesktopPool = expandDesktopPool;
    }

    public Resource withApplyDesktopsInternet(ApplyDesktopsInternet applyDesktopsInternet) {
        this.applyDesktopsInternet = applyDesktopsInternet;
        return this;
    }

    public Resource withApplyDesktopsInternet(Consumer<ApplyDesktopsInternet> applyDesktopsInternetSetter) {
        if (this.applyDesktopsInternet == null) {
            this.applyDesktopsInternet = new ApplyDesktopsInternet();
            applyDesktopsInternetSetter.accept(this.applyDesktopsInternet);
        }

        return this;
    }

    /**
     * Get applyDesktopsInternet
     * @return applyDesktopsInternet
     */
    public ApplyDesktopsInternet getApplyDesktopsInternet() {
        return applyDesktopsInternet;
    }

    public void setApplyDesktopsInternet(ApplyDesktopsInternet applyDesktopsInternet) {
        this.applyDesktopsInternet = applyDesktopsInternet;
    }

    public Resource withApplySubnetBandwidth(ApplySubnetBandwidthReq applySubnetBandwidth) {
        this.applySubnetBandwidth = applySubnetBandwidth;
        return this;
    }

    public Resource withApplySubnetBandwidth(Consumer<ApplySubnetBandwidthReq> applySubnetBandwidthSetter) {
        if (this.applySubnetBandwidth == null) {
            this.applySubnetBandwidth = new ApplySubnetBandwidthReq();
            applySubnetBandwidthSetter.accept(this.applySubnetBandwidth);
        }

        return this;
    }

    /**
     * Get applySubnetBandwidth
     * @return applySubnetBandwidth
     */
    public ApplySubnetBandwidthReq getApplySubnetBandwidth() {
        return applySubnetBandwidth;
    }

    public void setApplySubnetBandwidth(ApplySubnetBandwidthReq applySubnetBandwidth) {
        this.applySubnetBandwidth = applySubnetBandwidth;
    }

    public Resource withSubscribeUserSharer(SubscribeUserSharerReq subscribeUserSharer) {
        this.subscribeUserSharer = subscribeUserSharer;
        return this;
    }

    public Resource withSubscribeUserSharer(Consumer<SubscribeUserSharerReq> subscribeUserSharerSetter) {
        if (this.subscribeUserSharer == null) {
            this.subscribeUserSharer = new SubscribeUserSharerReq();
            subscribeUserSharerSetter.accept(this.subscribeUserSharer);
        }

        return this;
    }

    /**
     * Get subscribeUserSharer
     * @return subscribeUserSharer
     */
    public SubscribeUserSharerReq getSubscribeUserSharer() {
        return subscribeUserSharer;
    }

    public void setSubscribeUserSharer(SubscribeUserSharerReq subscribeUserSharer) {
        this.subscribeUserSharer = subscribeUserSharer;
    }

    public Resource withCloudServiceConsoleUrl(String cloudServiceConsoleUrl) {
        this.cloudServiceConsoleUrl = cloudServiceConsoleUrl;
        return this;
    }

    /**
     * 支付后跳转的地址
     * @return cloudServiceConsoleUrl
     */
    public String getCloudServiceConsoleUrl() {
        return cloudServiceConsoleUrl;
    }

    public void setCloudServiceConsoleUrl(String cloudServiceConsoleUrl) {
        this.cloudServiceConsoleUrl = cloudServiceConsoleUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Resource that = (Resource) obj;
        return Objects.equals(this.periodType, that.periodType) && Objects.equals(this.periodNum, that.periodNum)
            && Objects.equals(this.isAutoRenew, that.isAutoRenew) && Objects.equals(this.addVolumes, that.addVolumes)
            && Objects.equals(this.createDesktops, that.createDesktops) && Objects.equals(this.dehHosts, that.dehHosts)
            && Objects.equals(this.rebuildDesktops, that.rebuildDesktops)
            && Objects.equals(this.attachDesktops, that.attachDesktops)
            && Objects.equals(this.createExclusiveHosts, that.createExclusiveHosts)
            && Objects.equals(this.resizeExclusiveLites, that.resizeExclusiveLites)
            && Objects.equals(this.createDesktopPool, that.createDesktopPool)
            && Objects.equals(this.expandDesktopPool, that.expandDesktopPool)
            && Objects.equals(this.applyDesktopsInternet, that.applyDesktopsInternet)
            && Objects.equals(this.applySubnetBandwidth, that.applySubnetBandwidth)
            && Objects.equals(this.subscribeUserSharer, that.subscribeUserSharer)
            && Objects.equals(this.cloudServiceConsoleUrl, that.cloudServiceConsoleUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodType,
            periodNum,
            isAutoRenew,
            addVolumes,
            createDesktops,
            dehHosts,
            rebuildDesktops,
            attachDesktops,
            createExclusiveHosts,
            resizeExclusiveLites,
            createDesktopPool,
            expandDesktopPool,
            applyDesktopsInternet,
            applySubnetBandwidth,
            subscribeUserSharer,
            cloudServiceConsoleUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Resource {\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    addVolumes: ").append(toIndentedString(addVolumes)).append("\n");
        sb.append("    createDesktops: ").append(toIndentedString(createDesktops)).append("\n");
        sb.append("    dehHosts: ").append(toIndentedString(dehHosts)).append("\n");
        sb.append("    rebuildDesktops: ").append(toIndentedString(rebuildDesktops)).append("\n");
        sb.append("    attachDesktops: ").append(toIndentedString(attachDesktops)).append("\n");
        sb.append("    createExclusiveHosts: ").append(toIndentedString(createExclusiveHosts)).append("\n");
        sb.append("    resizeExclusiveLites: ").append(toIndentedString(resizeExclusiveLites)).append("\n");
        sb.append("    createDesktopPool: ").append(toIndentedString(createDesktopPool)).append("\n");
        sb.append("    expandDesktopPool: ").append(toIndentedString(expandDesktopPool)).append("\n");
        sb.append("    applyDesktopsInternet: ").append(toIndentedString(applyDesktopsInternet)).append("\n");
        sb.append("    applySubnetBandwidth: ").append(toIndentedString(applySubnetBandwidth)).append("\n");
        sb.append("    subscribeUserSharer: ").append(toIndentedString(subscribeUserSharer)).append("\n");
        sb.append("    cloudServiceConsoleUrl: ").append(toIndentedString(cloudServiceConsoleUrl)).append("\n");
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
