package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建弹性云服务器（按需）接口Body体。
 */
public class PostPaidServer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_terminate_time")

    private String autoTerminateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminPass")

    private String adminPass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_create_in_multi_az")

    private Boolean batchCreateInMultiAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volumes")

    private List<PostPaidServerDataVolume> dataVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendparam")

    private PostPaidServerExtendParam extendparam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorRef")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageRef")

    private String imageRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoRename")

    private Boolean isAutoRename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, String> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private List<PostPaidServerNic> nics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os:scheduler_hints")

    private PostPaidServerSchedulerHints osSchedulerHints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    private PostPaidServerPublicip publicip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_volume")

    private PostPaidServerRootVolume rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<PostPaidServerSecurityGroup> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_tags")

    private List<PostPaidServerTag> serverTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcid")

    private String vpcid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_options")

    private CpuOptions cpuOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_options")

    private SecurityOptions securityOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_console_options")

    private SerialConsoleOptions serialConsoleOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata_options")

    private UpdateServerMetadataOptionsRequestBody metadataOptions;

    public PostPaidServer withAutoTerminateTime(String autoTerminateTime) {
        this.autoTerminateTime = autoTerminateTime;
        return this;
    }

    /**
     * 弹性云服务器定时删除时间。  时间格式例如：2020-01-19T03:30:52Z
     * @return autoTerminateTime
     */
    public String getAutoTerminateTime() {
        return autoTerminateTime;
    }

    public void setAutoTerminateTime(String autoTerminateTime) {
        this.autoTerminateTime = autoTerminateTime;
    }

    public PostPaidServer withAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    /**
     * 如果需要使用密码方式登录云服务器，可使用adminPass字段指定云服务器管理员帐户初始登录密码。其中，Linux管理员帐户为root，Windows管理员帐户为Administrator。具体使用方法请参见接口描述信息（设置登录鉴权方式）。  密码复杂度要求：   - 长度为8-26位。  - 密码至少必须包含大写字母、小写字母、数字和特殊字符（!@$%^-_=+[{}]:,./?）中的三种。 - 密码不能包含用户名或用户名的逆序。  - Windows系统密码不能包含用户名或用户名的逆序，不能包含用户名中超过两个连续字符的部分。
     * @return adminPass
     */
    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public PostPaidServer withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 待创建云服务器所在的可用分区，需要指定可用分区（AZ）的名称。  可通过接口 [查询可用区列表接口](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=ECS&api=NovaListAvailabilityZones) 获取，也可参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)获取。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public PostPaidServer withBatchCreateInMultiAz(Boolean batchCreateInMultiAz) {
        this.batchCreateInMultiAz = batchCreateInMultiAz;
        return this;
    }

    /**
     * 是否支持随机多AZ部署。  - “true”：批量创建的ecs部署在多个AZ上 - “false”：批量创建的ecs部署在单个AZ上  > 说明： >  > 当availability_zone为空时该字段生效。
     * @return batchCreateInMultiAz
     */
    public Boolean getBatchCreateInMultiAz() {
        return batchCreateInMultiAz;
    }

    public void setBatchCreateInMultiAz(Boolean batchCreateInMultiAz) {
        this.batchCreateInMultiAz = batchCreateInMultiAz;
    }

    public PostPaidServer withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 创建云服务器数量。  约束：  - 不传该字段时默认取值为1。 - 租户的配额足够时，最大值为500。
     * maximum: 500
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public PostPaidServer withDataVolumes(List<PostPaidServerDataVolume> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public PostPaidServer addDataVolumesItem(PostPaidServerDataVolume dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public PostPaidServer withDataVolumes(Consumer<List<PostPaidServerDataVolume>> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    /**
     * 云服务器对应数据盘相关配置。每一个数据结构代表一块待创建的数据盘。 约束：目前新创建的弹性云服务器最多可挂载23块数据盘。
     * @return dataVolumes
     */
    public List<PostPaidServerDataVolume> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<PostPaidServerDataVolume> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public PostPaidServer withExtendparam(PostPaidServerExtendParam extendparam) {
        this.extendparam = extendparam;
        return this;
    }

    public PostPaidServer withExtendparam(Consumer<PostPaidServerExtendParam> extendparamSetter) {
        if (this.extendparam == null) {
            this.extendparam = new PostPaidServerExtendParam();
            extendparamSetter.accept(this.extendparam);
        }

        return this;
    }

    /**
     * Get extendparam
     * @return extendparam
     */
    public PostPaidServerExtendParam getExtendparam() {
        return extendparam;
    }

    public void setExtendparam(PostPaidServerExtendParam extendparam) {
        this.extendparam = extendparam;
    }

    public PostPaidServer withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * 待创建云服务器的系统规格的ID。  可通过 [规格列表接口](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=ECS&api=ListFlavors) 查询，该接口支持通过 availability_zone 参数过滤出待创建云服务器可用区下可用的规格。  已上线的各规格详情介绍请参见《[弹性云服务器产品介绍](https://support.huaweicloud.com/ecs/index.html)》的“实例类型与规格”章节。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public PostPaidServer withImageRef(String imageRef) {
        this.imageRef = imageRef;
        return this;
    }

    /**
     * 待创建云服务器的系统镜像，需要指定已创建镜像的ID，ID格式为通用唯一识别码（Universally Unique Identifier，简称UUID）。  镜像的ID可以从镜像服务的 [查询镜像列表](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=IMS&api=ListImages) 接口获取，该接口可根据 __imagetype、__os_type 等参数过滤选择合适镜像。
     * @return imageRef
     */
    public String getImageRef() {
        return imageRef;
    }

    public void setImageRef(String imageRef) {
        this.imageRef = imageRef;
    }

    public PostPaidServer withIsAutoRename(Boolean isAutoRename) {
        this.isAutoRename = isAutoRename;
        return this;
    }

    /**
     * 当批量创建弹性云服务器时，云服务器名称是否允许重名，当count大于1的时候该参数生效。默认为True。  - True，表示允许重名。 - False，表示不允许重名。
     * @return isAutoRename
     */
    public Boolean getIsAutoRename() {
        return isAutoRename;
    }

    public void setIsAutoRename(Boolean isAutoRename) {
        this.isAutoRename = isAutoRename;
    }

    public PostPaidServer withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * 如果需要使用SSH密钥方式登录云服务器，请指定已创建密钥的名称。  密钥可以通过密钥创建接口进行创建（请参见[创建和导入SSH密钥](https://support.huaweicloud.com/api-ecs/zh-cn_topic_0020212678.html)），或使用SSH密钥查询接口查询已有的密钥（请参见[查询SSH密钥列表](https://support.huaweicloud.com/api-ecs/ecs_03_1201.html)）。
     * @return keyName
     */
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public PostPaidServer withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public PostPaidServer putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public PostPaidServer withMetadata(Consumer<Map<String, String>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    /**
     * 用户自定义字段键值对。  > 说明： >  > - 最多可注入10对键值（Key/Value）。 > - 主键（Key）只能由大写字母（A-Z）、小写字母（a-z）、数字（0-9）、中划线（-）、下划线（_）、冒号（:）和小数点（.）组成，长度为[1-255]个字符。 > - 值（value）最大长度为255个字符。  系统预留字段  1. op_svc_userid : 用户ID       2. agency_name  :  委托的名称   委托是由租户管理员在统一身份认证服务（Identity and Access Management，IAM）上创建的，可以为弹性云服务器提供访问云服务的临时凭证。  > 说明： >  > 委托获取、更新请参考如下步骤： >  > 1. 使用IAM服务提供的[查询委托列表](https://support.huaweicloud.com/api-iam/zh-cn_topic_0079467614.html)接口，获取有效可用的委托名称。 > 2. 使用[更新云服务器元数](https://support.huaweicloud.com/api-ecs/zh-cn_topic_0025560298.html)据接口，更新metadata中agency_name字段为新的委托名称。  3. __support_agent_list: 云服务器是否支持企业主机安全、主机监控。 - \"hss\"：企业主机安全 - \"ces\"：主机监控  取值样例： __support_agent_list: \"hss,ces\"  可以通过查询[镜像详情](https://support.huaweicloud.com/api-ims/ims_03_0702.html)判断创建云服务器使用的镜像是否支持企业主机安全或主机监控。
     * @return metadata
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public PostPaidServer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 云服务器名称。  取值范围：  - 只能由中文字符、英文字母、数字及“_”、“-”、“.”组成，且长度为[1-64]个字符。 - 创建的云服务器器数量（count字段对应的值）大于1时，为区分不同云服务器，创建过程中系统会自动在名称后加“-0000”的类似标记。故此时名称的长度为[1-59]个字符。  > 说明： >  > 云服务器虚拟机内部(hostname)命名规则遵循 RFC 952和RFC 1123命名规范，建议使用a-zA-z或0-9以及中划线\"-\"组成的名称命名，\"_\"将在弹性云服务器内部默认转化为\"-\"。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PostPaidServer withNics(List<PostPaidServerNic> nics) {
        this.nics = nics;
        return this;
    }

    public PostPaidServer addNicsItem(PostPaidServerNic nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public PostPaidServer withNics(Consumer<List<PostPaidServerNic>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 待创建云服务器的网卡信息。  约束：  - 网卡对应的子网（subnet）必须属于vpcid对应的VPC。 - 当前单个云服务器支持最多挂载12张网卡。 - 不同的规格对网卡上限有一定的区别，参考[规格清单](https://support.huaweicloud.com/productdesc-ecs/zh-cn_topic_0159822360.html)。
     * @return nics
     */
    public List<PostPaidServerNic> getNics() {
        return nics;
    }

    public void setNics(List<PostPaidServerNic> nics) {
        this.nics = nics;
    }

    public PostPaidServer withOsSchedulerHints(PostPaidServerSchedulerHints osSchedulerHints) {
        this.osSchedulerHints = osSchedulerHints;
        return this;
    }

    public PostPaidServer withOsSchedulerHints(Consumer<PostPaidServerSchedulerHints> osSchedulerHintsSetter) {
        if (this.osSchedulerHints == null) {
            this.osSchedulerHints = new PostPaidServerSchedulerHints();
            osSchedulerHintsSetter.accept(this.osSchedulerHints);
        }

        return this;
    }

    /**
     * Get osSchedulerHints
     * @return osSchedulerHints
     */
    public PostPaidServerSchedulerHints getOsSchedulerHints() {
        return osSchedulerHints;
    }

    public void setOsSchedulerHints(PostPaidServerSchedulerHints osSchedulerHints) {
        this.osSchedulerHints = osSchedulerHints;
    }

    public PostPaidServer withPublicip(PostPaidServerPublicip publicip) {
        this.publicip = publicip;
        return this;
    }

    public PostPaidServer withPublicip(Consumer<PostPaidServerPublicip> publicipSetter) {
        if (this.publicip == null) {
            this.publicip = new PostPaidServerPublicip();
            publicipSetter.accept(this.publicip);
        }

        return this;
    }

    /**
     * Get publicip
     * @return publicip
     */
    public PostPaidServerPublicip getPublicip() {
        return publicip;
    }

    public void setPublicip(PostPaidServerPublicip publicip) {
        this.publicip = publicip;
    }

    public PostPaidServer withRootVolume(PostPaidServerRootVolume rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public PostPaidServer withRootVolume(Consumer<PostPaidServerRootVolume> rootVolumeSetter) {
        if (this.rootVolume == null) {
            this.rootVolume = new PostPaidServerRootVolume();
            rootVolumeSetter.accept(this.rootVolume);
        }

        return this;
    }

    /**
     * Get rootVolume
     * @return rootVolume
     */
    public PostPaidServerRootVolume getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(PostPaidServerRootVolume rootVolume) {
        this.rootVolume = rootVolume;
    }

    public PostPaidServer withSecurityGroups(List<PostPaidServerSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public PostPaidServer addSecurityGroupsItem(PostPaidServerSecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public PostPaidServer withSecurityGroups(Consumer<List<PostPaidServerSecurityGroup>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 云服务器对应安全组信息。  约束：当该值指定为空时，默认给云服务器绑定default安全组。
     * @return securityGroups
     */
    public List<PostPaidServerSecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<PostPaidServerSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public PostPaidServer withServerTags(List<PostPaidServerTag> serverTags) {
        this.serverTags = serverTags;
        return this;
    }

    public PostPaidServer addServerTagsItem(PostPaidServerTag serverTagsItem) {
        if (this.serverTags == null) {
            this.serverTags = new ArrayList<>();
        }
        this.serverTags.add(serverTagsItem);
        return this;
    }

    public PostPaidServer withServerTags(Consumer<List<PostPaidServerTag>> serverTagsSetter) {
        if (this.serverTags == null) {
            this.serverTags = new ArrayList<>();
        }
        serverTagsSetter.accept(this.serverTags);
        return this;
    }

    /**
     * 弹性云服务器的标签。  > 说明： >  > 创建弹性云服务器时，一台弹性云服务器最多可以添加10个标签。 > 公有云新增server_tags字段，该字段与tags字段功能相同，支持的key、value取值范围更广，建议使用server_tags字段。
     * @return serverTags
     */
    public List<PostPaidServerTag> getServerTags() {
        return serverTags;
    }

    public void setServerTags(List<PostPaidServerTag> serverTags) {
        this.serverTags = serverTags;
    }

    public PostPaidServer withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public PostPaidServer addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public PostPaidServer withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 弹性云服务器的标签。  标签的格式为“key.value”。其中，key的长度不超过36个字符，value的长度不超过43个字符。  标签命名时，需满足如下要求：  - 标签的key值只能包含大写字母（A~Z）、小写字母（a~z）、数字（0-9）、下划线（_）、中划线（-）以及中文字符。 - 标签的value值只能包含大写字母（A~Z）、小写字母（a~z）、数字（0-9）、下划线（_）、中划线（-）、小数点（.）以及中文字符。  > 说明： >  > 创建弹性云服务器时，一台弹性云服务器最多可以添加10个标签。 > 公有云新增server_tags字段，该字段与tags字段功能相同，支持的key、value取值范围更广，建议使用server_tags字段。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public PostPaidServer withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 创建云服务器过程中待注入用户数据。支持注入文本、文本文件或gzip文件。  更多关于待注入用户数据的信息，请参见《弹性云服务器用户指南 》的“[用户数据注入](https://support.huaweicloud.com/usermanual-ecs/zh-cn_topic_0032380449.html)”章节。  约束：  - 注入内容，需要进行base64格式编码。注入内容（编码之前的内容）最大长度32KB。 - 创建密码方式鉴权的Linux弹性云服务器时，该字段可为root用户注入自定义初始化密码，具体注入密码的使用方法请参见接口描述（设置登录鉴权方式）。 示例（base64编码前）：  - Linux弹性云服务器  ``` #! /bin/bash echo user_test >> /home/user.txt ```  - Windows弹性云服务器  ``` rem cmd echo 111 > c:\\\\aaa.tx ```
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public PostPaidServer withVpcid(String vpcid) {
        this.vpcid = vpcid;
        return this;
    }

    /**
     * 待创建云服务器所属虚拟私有云（简称VPC），需要指定已创建VPC的ID，UUID格式。  可通过 [查询VPC列表](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product=VPC&api=ListVpcs) 接口查询。
     * @return vpcid
     */
    public String getVpcid() {
        return vpcid;
    }

    public void setVpcid(String vpcid) {
        this.vpcid = vpcid;
    }

    public PostPaidServer withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 云服务器描述信息，默认为空字符串。  - 长度最多允许85个字符。 - 不能包含“<” 和 “>”。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PostPaidServer withCpuOptions(CpuOptions cpuOptions) {
        this.cpuOptions = cpuOptions;
        return this;
    }

    public PostPaidServer withCpuOptions(Consumer<CpuOptions> cpuOptionsSetter) {
        if (this.cpuOptions == null) {
            this.cpuOptions = new CpuOptions();
            cpuOptionsSetter.accept(this.cpuOptions);
        }

        return this;
    }

    /**
     * Get cpuOptions
     * @return cpuOptions
     */
    public CpuOptions getCpuOptions() {
        return cpuOptions;
    }

    public void setCpuOptions(CpuOptions cpuOptions) {
        this.cpuOptions = cpuOptions;
    }

    public PostPaidServer withSecurityOptions(SecurityOptions securityOptions) {
        this.securityOptions = securityOptions;
        return this;
    }

    public PostPaidServer withSecurityOptions(Consumer<SecurityOptions> securityOptionsSetter) {
        if (this.securityOptions == null) {
            this.securityOptions = new SecurityOptions();
            securityOptionsSetter.accept(this.securityOptions);
        }

        return this;
    }

    /**
     * Get securityOptions
     * @return securityOptions
     */
    public SecurityOptions getSecurityOptions() {
        return securityOptions;
    }

    public void setSecurityOptions(SecurityOptions securityOptions) {
        this.securityOptions = securityOptions;
    }

    public PostPaidServer withSerialConsoleOptions(SerialConsoleOptions serialConsoleOptions) {
        this.serialConsoleOptions = serialConsoleOptions;
        return this;
    }

    public PostPaidServer withSerialConsoleOptions(Consumer<SerialConsoleOptions> serialConsoleOptionsSetter) {
        if (this.serialConsoleOptions == null) {
            this.serialConsoleOptions = new SerialConsoleOptions();
            serialConsoleOptionsSetter.accept(this.serialConsoleOptions);
        }

        return this;
    }

    /**
     * Get serialConsoleOptions
     * @return serialConsoleOptions
     */
    public SerialConsoleOptions getSerialConsoleOptions() {
        return serialConsoleOptions;
    }

    public void setSerialConsoleOptions(SerialConsoleOptions serialConsoleOptions) {
        this.serialConsoleOptions = serialConsoleOptions;
    }

    public PostPaidServer withMetadataOptions(UpdateServerMetadataOptionsRequestBody metadataOptions) {
        this.metadataOptions = metadataOptions;
        return this;
    }

    public PostPaidServer withMetadataOptions(Consumer<UpdateServerMetadataOptionsRequestBody> metadataOptionsSetter) {
        if (this.metadataOptions == null) {
            this.metadataOptions = new UpdateServerMetadataOptionsRequestBody();
            metadataOptionsSetter.accept(this.metadataOptions);
        }

        return this;
    }

    /**
     * Get metadataOptions
     * @return metadataOptions
     */
    public UpdateServerMetadataOptionsRequestBody getMetadataOptions() {
        return metadataOptions;
    }

    public void setMetadataOptions(UpdateServerMetadataOptionsRequestBody metadataOptions) {
        this.metadataOptions = metadataOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostPaidServer that = (PostPaidServer) obj;
        return Objects.equals(this.autoTerminateTime, that.autoTerminateTime)
            && Objects.equals(this.adminPass, that.adminPass)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.batchCreateInMultiAz, that.batchCreateInMultiAz)
            && Objects.equals(this.count, that.count) && Objects.equals(this.dataVolumes, that.dataVolumes)
            && Objects.equals(this.extendparam, that.extendparam) && Objects.equals(this.flavorRef, that.flavorRef)
            && Objects.equals(this.imageRef, that.imageRef) && Objects.equals(this.isAutoRename, that.isAutoRename)
            && Objects.equals(this.keyName, that.keyName) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nics, that.nics)
            && Objects.equals(this.osSchedulerHints, that.osSchedulerHints)
            && Objects.equals(this.publicip, that.publicip) && Objects.equals(this.rootVolume, that.rootVolume)
            && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.serverTags, that.serverTags) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.userData, that.userData) && Objects.equals(this.vpcid, that.vpcid)
            && Objects.equals(this.description, that.description) && Objects.equals(this.cpuOptions, that.cpuOptions)
            && Objects.equals(this.securityOptions, that.securityOptions)
            && Objects.equals(this.serialConsoleOptions, that.serialConsoleOptions)
            && Objects.equals(this.metadataOptions, that.metadataOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoTerminateTime,
            adminPass,
            availabilityZone,
            batchCreateInMultiAz,
            count,
            dataVolumes,
            extendparam,
            flavorRef,
            imageRef,
            isAutoRename,
            keyName,
            metadata,
            name,
            nics,
            osSchedulerHints,
            publicip,
            rootVolume,
            securityGroups,
            serverTags,
            tags,
            userData,
            vpcid,
            description,
            cpuOptions,
            securityOptions,
            serialConsoleOptions,
            metadataOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostPaidServer {\n");
        sb.append("    autoTerminateTime: ").append(toIndentedString(autoTerminateTime)).append("\n");
        sb.append("    adminPass: ").append(toIndentedString(adminPass)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    batchCreateInMultiAz: ").append(toIndentedString(batchCreateInMultiAz)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    extendparam: ").append(toIndentedString(extendparam)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
        sb.append("    isAutoRename: ").append(toIndentedString(isAutoRename)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    osSchedulerHints: ").append(toIndentedString(osSchedulerHints)).append("\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    serverTags: ").append(toIndentedString(serverTags)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    vpcid: ").append(toIndentedString(vpcid)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    cpuOptions: ").append(toIndentedString(cpuOptions)).append("\n");
        sb.append("    securityOptions: ").append(toIndentedString(securityOptions)).append("\n");
        sb.append("    serialConsoleOptions: ").append(toIndentedString(serialConsoleOptions)).append("\n");
        sb.append("    metadataOptions: ").append(toIndentedString(metadataOptions)).append("\n");
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
