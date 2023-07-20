package com.huaweicloud.sdk.cms.v1;

import com.huaweicloud.sdk.cms.v1.model.CreateAutoLaunchGroupRequest;
import com.huaweicloud.sdk.cms.v1.model.CreateAutoLaunchGroupResponse;
import com.huaweicloud.sdk.cms.v1.model.DeleteAutoLaunchGroupRequest;
import com.huaweicloud.sdk.cms.v1.model.DeleteAutoLaunchGroupResponse;
import com.huaweicloud.sdk.cms.v1.model.ListAutoLaunchGroupsRequest;
import com.huaweicloud.sdk.cms.v1.model.ListAutoLaunchGroupsResponse;
import com.huaweicloud.sdk.cms.v1.model.ListInstancesRequest;
import com.huaweicloud.sdk.cms.v1.model.ListInstancesResponse;
import com.huaweicloud.sdk.cms.v1.model.ListSupplyRecommendationRequest;
import com.huaweicloud.sdk.cms.v1.model.ListSupplyRecommendationResponse;
import com.huaweicloud.sdk.cms.v1.model.ShowAutoLaunchGroupRequest;
import com.huaweicloud.sdk.cms.v1.model.ShowAutoLaunchGroupResponse;
import com.huaweicloud.sdk.cms.v1.model.UpdateAutoLaunchGroupRequest;
import com.huaweicloud.sdk.cms.v1.model.UpdateAutoLaunchGroupResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CmsAsyncClient {

    protected HcClient hcClient;

    public CmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CmsAsyncClient> newBuilder() {
        ClientBuilder<CmsAsyncClient> clientBuilder = new ClientBuilder<>(CmsAsyncClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 创建智能购买组
     *
     * 创建智能购买组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAutoLaunchGroupRequest 请求对象
     * @return CompletableFuture<CreateAutoLaunchGroupResponse>
     */
    public CompletableFuture<CreateAutoLaunchGroupResponse> createAutoLaunchGroupAsync(
        CreateAutoLaunchGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CmsMeta.createAutoLaunchGroup);
    }

    /**
     * 创建智能购买组
     *
     * 创建智能购买组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAutoLaunchGroupRequest 请求对象
     * @return AsyncInvoker<CreateAutoLaunchGroupRequest, CreateAutoLaunchGroupResponse>
     */
    public AsyncInvoker<CreateAutoLaunchGroupRequest, CreateAutoLaunchGroupResponse> createAutoLaunchGroupAsyncInvoker(
        CreateAutoLaunchGroupRequest request) {
        return new AsyncInvoker<CreateAutoLaunchGroupRequest, CreateAutoLaunchGroupResponse>(request,
            CmsMeta.createAutoLaunchGroup, hcClient);
    }

    /**
     * 删除智能购买组
     *
     * 删除指定的智能购买组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAutoLaunchGroupRequest 请求对象
     * @return CompletableFuture<DeleteAutoLaunchGroupResponse>
     */
    public CompletableFuture<DeleteAutoLaunchGroupResponse> deleteAutoLaunchGroupAsync(
        DeleteAutoLaunchGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CmsMeta.deleteAutoLaunchGroup);
    }

    /**
     * 删除智能购买组
     *
     * 删除指定的智能购买组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAutoLaunchGroupRequest 请求对象
     * @return AsyncInvoker<DeleteAutoLaunchGroupRequest, DeleteAutoLaunchGroupResponse>
     */
    public AsyncInvoker<DeleteAutoLaunchGroupRequest, DeleteAutoLaunchGroupResponse> deleteAutoLaunchGroupAsyncInvoker(
        DeleteAutoLaunchGroupRequest request) {
        return new AsyncInvoker<DeleteAutoLaunchGroupRequest, DeleteAutoLaunchGroupResponse>(request,
            CmsMeta.deleteAutoLaunchGroup, hcClient);
    }

    /**
     * 查询智能购买组列表
     *
     * 获取租户创建的所有的智能购买组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAutoLaunchGroupsRequest 请求对象
     * @return CompletableFuture<ListAutoLaunchGroupsResponse>
     */
    public CompletableFuture<ListAutoLaunchGroupsResponse> listAutoLaunchGroupsAsync(
        ListAutoLaunchGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CmsMeta.listAutoLaunchGroups);
    }

    /**
     * 查询智能购买组列表
     *
     * 获取租户创建的所有的智能购买组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAutoLaunchGroupsRequest 请求对象
     * @return AsyncInvoker<ListAutoLaunchGroupsRequest, ListAutoLaunchGroupsResponse>
     */
    public AsyncInvoker<ListAutoLaunchGroupsRequest, ListAutoLaunchGroupsResponse> listAutoLaunchGroupsAsyncInvoker(
        ListAutoLaunchGroupsRequest request) {
        return new AsyncInvoker<ListAutoLaunchGroupsRequest, ListAutoLaunchGroupsResponse>(request,
            CmsMeta.listAutoLaunchGroups, hcClient);
    }

    /**
     * 查询智能购买组实例列表
     *
     * 获取智能购买组创建的实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CmsMeta.listInstances);
    }

    /**
     * 查询智能购买组实例列表
     *
     * 获取智能购买组创建的实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, CmsMeta.listInstances, hcClient);
    }

    /**
     * 地域推荐
     *
     * 对ECS的资源供给的地域和规格进行推荐，推荐结果以打分的形式呈现，分数越高推荐程度越高
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSupplyRecommendationRequest 请求对象
     * @return CompletableFuture<ListSupplyRecommendationResponse>
     */
    public CompletableFuture<ListSupplyRecommendationResponse> listSupplyRecommendationAsync(
        ListSupplyRecommendationRequest request) {
        return hcClient.asyncInvokeHttp(request, CmsMeta.listSupplyRecommendation);
    }

    /**
     * 地域推荐
     *
     * 对ECS的资源供给的地域和规格进行推荐，推荐结果以打分的形式呈现，分数越高推荐程度越高
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSupplyRecommendationRequest 请求对象
     * @return AsyncInvoker<ListSupplyRecommendationRequest, ListSupplyRecommendationResponse>
     */
    public AsyncInvoker<ListSupplyRecommendationRequest, ListSupplyRecommendationResponse> listSupplyRecommendationAsyncInvoker(
        ListSupplyRecommendationRequest request) {
        return new AsyncInvoker<ListSupplyRecommendationRequest, ListSupplyRecommendationResponse>(request,
            CmsMeta.listSupplyRecommendation, hcClient);
    }

    /**
     * 查询智能购买组详情
     *
     * 查询指定智能购买组的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAutoLaunchGroupRequest 请求对象
     * @return CompletableFuture<ShowAutoLaunchGroupResponse>
     */
    public CompletableFuture<ShowAutoLaunchGroupResponse> showAutoLaunchGroupAsync(ShowAutoLaunchGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CmsMeta.showAutoLaunchGroup);
    }

    /**
     * 查询智能购买组详情
     *
     * 查询指定智能购买组的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAutoLaunchGroupRequest 请求对象
     * @return AsyncInvoker<ShowAutoLaunchGroupRequest, ShowAutoLaunchGroupResponse>
     */
    public AsyncInvoker<ShowAutoLaunchGroupRequest, ShowAutoLaunchGroupResponse> showAutoLaunchGroupAsyncInvoker(
        ShowAutoLaunchGroupRequest request) {
        return new AsyncInvoker<ShowAutoLaunchGroupRequest, ShowAutoLaunchGroupResponse>(request,
            CmsMeta.showAutoLaunchGroup, hcClient);
    }

    /**
     * 修改智能购买组
     *
     * 更新指定智能购买组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAutoLaunchGroupRequest 请求对象
     * @return CompletableFuture<UpdateAutoLaunchGroupResponse>
     */
    public CompletableFuture<UpdateAutoLaunchGroupResponse> updateAutoLaunchGroupAsync(
        UpdateAutoLaunchGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CmsMeta.updateAutoLaunchGroup);
    }

    /**
     * 修改智能购买组
     *
     * 更新指定智能购买组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAutoLaunchGroupRequest 请求对象
     * @return AsyncInvoker<UpdateAutoLaunchGroupRequest, UpdateAutoLaunchGroupResponse>
     */
    public AsyncInvoker<UpdateAutoLaunchGroupRequest, UpdateAutoLaunchGroupResponse> updateAutoLaunchGroupAsyncInvoker(
        UpdateAutoLaunchGroupRequest request) {
        return new AsyncInvoker<UpdateAutoLaunchGroupRequest, UpdateAutoLaunchGroupResponse>(request,
            CmsMeta.updateAutoLaunchGroup, hcClient);
    }

}
