package com.huaweicloud.sdk.eip.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.eip.v2.model.*;

public class EipAsyncClient {
    protected HcClient hcClient;

    public EipAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EipAsyncClient> newBuilder() {
        return new ClientBuilder<>(EipAsyncClient::new);
    }


    /**
     * 共享带宽插入弹性公网IP
     * 共享带宽插入弹性公网IP。
     *
     * @param AddPublicipsIntoSharedBandwidthRequest 请求对象
     * @return CompletableFuture<AddPublicipsIntoSharedBandwidthResponse>
     */
    public CompletableFuture<AddPublicipsIntoSharedBandwidthResponse> addPublicipsIntoSharedBandwidthAsync(AddPublicipsIntoSharedBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.addPublicipsIntoSharedBandwidth);
    }

    /**
     * 批量创建共享带宽
     * 批量创建共享带宽。
     *
     * @param BatchCreateSharedBandwidthsRequest 请求对象
     * @return CompletableFuture<BatchCreateSharedBandwidthsResponse>
     */
    public CompletableFuture<BatchCreateSharedBandwidthsResponse> batchCreateSharedBandwidthsAsync(BatchCreateSharedBandwidthsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.batchCreateSharedBandwidths);
    }

    /**
     * 创建共享带宽
     * 创建共享带宽。
     *
     * @param CreateSharedBandwidthRequest 请求对象
     * @return CompletableFuture<CreateSharedBandwidthResponse>
     */
    public CompletableFuture<CreateSharedBandwidthResponse> createSharedBandwidthAsync(CreateSharedBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.createSharedBandwidth);
    }

    /**
     * 删除共享带宽
     * 删除共享带宽。
     *
     * @param DeleteSharedBandwidthRequest 请求对象
     * @return CompletableFuture<DeleteSharedBandwidthResponse>
     */
    public CompletableFuture<DeleteSharedBandwidthResponse> deleteSharedBandwidthAsync(DeleteSharedBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.deleteSharedBandwidth);
    }

    /**
     * 查询带宽列表
     * 查询带宽列表。
     *
     * @param ListBandwidthsRequest 请求对象
     * @return CompletableFuture<ListBandwidthsResponse>
     */
    public CompletableFuture<ListBandwidthsResponse> listBandwidthsAsync(ListBandwidthsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listBandwidths);
    }

    /**
     * 查询配额接口
     * 查询配额
     *
     * @param ListQuotasRequest 请求对象
     * @return CompletableFuture<ListQuotasResponse>
     */
    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listQuotas);
    }

    /**
     * 共享带宽移除弹性公网IP
     * 共享带宽移除弹性公网IP。
     *
     * @param RemovePublicipsFromSharedBandwidthRequest 请求对象
     * @return CompletableFuture<RemovePublicipsFromSharedBandwidthResponse>
     */
    public CompletableFuture<RemovePublicipsFromSharedBandwidthResponse> removePublicipsFromSharedBandwidthAsync(RemovePublicipsFromSharedBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.removePublicipsFromSharedBandwidth);
    }

    /**
     * 查询带宽
     * 查询带宽
     *
     * @param ShowBandwidthRequest 请求对象
     * @return CompletableFuture<ShowBandwidthResponse>
     */
    public CompletableFuture<ShowBandwidthResponse> showBandwidthAsync(ShowBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.showBandwidth);
    }

    /**
     * 更新带宽
     * 更新带宽。
     *
     * @param UpdateBandwidthRequest 请求对象
     * @return CompletableFuture<UpdateBandwidthResponse>
     */
    public CompletableFuture<UpdateBandwidthResponse> updateBandwidthAsync(UpdateBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.updateBandwidth);
    }

    /**
     * 更新包周期带宽
     * 更新带宽。
     *
     * @param UpdatePrePaidBandwidthRequest 请求对象
     * @return CompletableFuture<UpdatePrePaidBandwidthResponse>
     */
    public CompletableFuture<UpdatePrePaidBandwidthResponse> updatePrePaidBandwidthAsync(UpdatePrePaidBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.updatePrePaidBandwidth);
    }

    /**
     * 批量创建弹性公网IP资源标签
     * 为指定的弹性公网IP资源实例批量添加标签。
     *
     * @param BatchCreatePublicipTagsRequest 请求对象
     * @return CompletableFuture<BatchCreatePublicipTagsResponse>
     */
    public CompletableFuture<BatchCreatePublicipTagsResponse> batchCreatePublicipTagsAsync(BatchCreatePublicipTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.batchCreatePublicipTags);
    }

    /**
     * 批量删除弹性公网IP资源标签
     * 为指定的弹性公网IP资源实例批量删除标签。
     *
     * @param BatchDeletePublicipTagsRequest 请求对象
     * @return CompletableFuture<BatchDeletePublicipTagsResponse>
     */
    public CompletableFuture<BatchDeletePublicipTagsResponse> batchDeletePublicipTagsAsync(BatchDeletePublicipTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.batchDeletePublicipTags);
    }

    /**
     * 申请包周期弹性公网IP
     * 申请包年包月的弹性公网IP。
     *
     * @param CreatePrePaidPublicipRequest 请求对象
     * @return CompletableFuture<CreatePrePaidPublicipResponse>
     */
    public CompletableFuture<CreatePrePaidPublicipResponse> createPrePaidPublicipAsync(CreatePrePaidPublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.createPrePaidPublicip);
    }

    /**
     * 申请弹性公网IP
     * 申请弹性公网IP，支持IPv4和IPv6。  弹性公网IP（Elastic IP）提供独立的公网IP资源，包括公网IP地址与公网出口带宽服务。可以与弹性云服务器、裸金属服务器、虚拟IP、弹性负载均衡、NAT网关等资源灵活地绑定及解绑。拥有多种灵活的计费方式，可以满足各种业务场景的需要。
     *
     * @param CreatePublicipRequest 请求对象
     * @return CompletableFuture<CreatePublicipResponse>
     */
    public CompletableFuture<CreatePublicipResponse> createPublicipAsync(CreatePublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.createPublicip);
    }

    /**
     * 创建弹性公网IP资源标签
     * 给指定弹性IP资源实例增加标签信息。
     *
     * @param CreatePublicipTagRequest 请求对象
     * @return CompletableFuture<CreatePublicipTagResponse>
     */
    public CompletableFuture<CreatePublicipTagResponse> createPublicipTagAsync(CreatePublicipTagRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.createPublicipTag);
    }

    /**
     * 删除弹性公网IP
     * 删除弹性公网IP。
     *
     * @param DeletePublicipRequest 请求对象
     * @return CompletableFuture<DeletePublicipResponse>
     */
    public CompletableFuture<DeletePublicipResponse> deletePublicipAsync(DeletePublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.deletePublicip);
    }

    /**
     * 删除弹性公网IP的标签
     * 删除指定弹性公网IP的标签信息。其中project_id是项目ID，publicip_id 是要操作的弹性公网IP的id。key是要删除标签的键。
     *
     * @param DeletePublicipTagRequest 请求对象
     * @return CompletableFuture<DeletePublicipTagResponse>
     */
    public CompletableFuture<DeletePublicipTagResponse> deletePublicipTagAsync(DeletePublicipTagRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.deletePublicipTag);
    }

    /**
     * 查询租户的弹性公网IP标签
     * 查询租户在指定区域和实例类型的所有标签集合。
     *
     * @param ListPublicipTagsRequest 请求对象
     * @return CompletableFuture<ListPublicipTagsResponse>
     */
    public CompletableFuture<ListPublicipTagsResponse> listPublicipTagsAsync(ListPublicipTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listPublicipTags);
    }

    /**
     * 查询弹性公网IP列表
     * 查询弹性公网IP列表
     *
     * @param ListPublicipsRequest 请求对象
     * @return CompletableFuture<ListPublicipsResponse>
     */
    public CompletableFuture<ListPublicipsResponse> listPublicipsAsync(ListPublicipsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listPublicips);
    }

    /**
     * 按标签查询弹性公网IP列表
     * 使用标签过滤弹性公网IP。
     *
     * @param ListPublicipsByTagsRequest 请求对象
     * @return CompletableFuture<ListPublicipsByTagsResponse>
     */
    public CompletableFuture<ListPublicipsByTagsResponse> listPublicipsByTagsAsync(ListPublicipsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.listPublicipsByTags);
    }

    /**
     * 查询弹性公网IP
     * 查询指定的弹性公网IP。
     *
     * @param ShowPublicipRequest 请求对象
     * @return CompletableFuture<ShowPublicipResponse>
     */
    public CompletableFuture<ShowPublicipResponse> showPublicipAsync(ShowPublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.showPublicip);
    }

    /**
     * 查询弹性公网IP的标签
     * 查询指定弹性IP实例的标签信息。
     *
     * @param ShowPublicipTagsRequest 请求对象
     * @return CompletableFuture<ShowPublicipTagsResponse>
     */
    public CompletableFuture<ShowPublicipTagsResponse> showPublicipTagsAsync(ShowPublicipTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.showPublicipTags);
    }

    /**
     * 更新弹性公网IP
     * 更新弹性公网IP，将弹性公网IP跟一个网卡绑定或者解绑定，转换IP地址版本类型。
     *
     * @param UpdatePublicipRequest 请求对象
     * @return CompletableFuture<UpdatePublicipResponse>
     */
    public CompletableFuture<UpdatePublicipResponse> updatePublicipAsync(UpdatePublicipRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.updatePublicip);
    }

    /**
     * 创建浮动IP
     * 创建浮动IP的外部网络UUID，请使用GET /v2.0/networks?router:external&#x3D;True或neutron net-external-list方式获取。
     *
     * @param NeutronCreateFloatingIpRequest 请求对象
     * @return CompletableFuture<NeutronCreateFloatingIpResponse>
     */
    public CompletableFuture<NeutronCreateFloatingIpResponse> neutronCreateFloatingIpAsync(NeutronCreateFloatingIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.neutronCreateFloatingIp);
    }

    /**
     * 删除浮动IP
     * 删除指定的浮动IP。
     *
     * @param NeutronDeleteFloatingIpRequest 请求对象
     * @return CompletableFuture<NeutronDeleteFloatingIpResponse>
     */
    public CompletableFuture<NeutronDeleteFloatingIpResponse> neutronDeleteFloatingIpAsync(NeutronDeleteFloatingIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.neutronDeleteFloatingIp);
    }

    /**
     * 查询浮动IP列表
     * 查询提交请求的租户有权限操作的所有浮动IP地址。
     *
     * @param NeutronListFloatingIpsRequest 请求对象
     * @return CompletableFuture<NeutronListFloatingIpsResponse>
     */
    public CompletableFuture<NeutronListFloatingIpsResponse> neutronListFloatingIpsAsync(NeutronListFloatingIpsRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.neutronListFloatingIps);
    }

    /**
     * 查询浮动IP
     * 查询浮动IP详情，包括浮动IP状态，浮动IP所属路由器ID，浮动IP的外部网络ID等等。
     *
     * @param NeutronShowFloatingIpRequest 请求对象
     * @return CompletableFuture<NeutronShowFloatingIpResponse>
     */
    public CompletableFuture<NeutronShowFloatingIpResponse> neutronShowFloatingIpAsync(NeutronShowFloatingIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.neutronShowFloatingIp);
    }

    /**
     * 更新浮动IP
     * 更新浮动IP。  更新时需在URL中给出浮动IP地址的ID。  port_id 为空，则表示浮动IP从端口解绑。
     *
     * @param NeutronUpdateFloatingIpRequest 请求对象
     * @return CompletableFuture<NeutronUpdateFloatingIpResponse>
     */
    public CompletableFuture<NeutronUpdateFloatingIpResponse> neutronUpdateFloatingIpAsync(NeutronUpdateFloatingIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EipMeta.neutronUpdateFloatingIp);
    }

}