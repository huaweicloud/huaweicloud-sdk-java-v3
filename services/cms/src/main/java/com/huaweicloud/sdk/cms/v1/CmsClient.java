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
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CmsClient {

    protected HcClient hcClient;

    public CmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CmsClient> newBuilder() {
        ClientBuilder<CmsClient> clientBuilder = new ClientBuilder<>(CmsClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 创建智能购买组
     *
     * 创建智能购买组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAutoLaunchGroupRequest 请求对象
     * @return CreateAutoLaunchGroupResponse
     */
    public CreateAutoLaunchGroupResponse createAutoLaunchGroup(CreateAutoLaunchGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CmsMeta.createAutoLaunchGroup);
    }

    /**
     * 创建智能购买组
     *
     * 创建智能购买组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAutoLaunchGroupRequest 请求对象
     * @return SyncInvoker<CreateAutoLaunchGroupRequest, CreateAutoLaunchGroupResponse>
     */
    public SyncInvoker<CreateAutoLaunchGroupRequest, CreateAutoLaunchGroupResponse> createAutoLaunchGroupInvoker(
        CreateAutoLaunchGroupRequest request) {
        return new SyncInvoker<>(request, CmsMeta.createAutoLaunchGroup, hcClient);
    }

    /**
     * 删除智能购买组
     *
     * 删除指定的智能购买组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAutoLaunchGroupRequest 请求对象
     * @return DeleteAutoLaunchGroupResponse
     */
    public DeleteAutoLaunchGroupResponse deleteAutoLaunchGroup(DeleteAutoLaunchGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CmsMeta.deleteAutoLaunchGroup);
    }

    /**
     * 删除智能购买组
     *
     * 删除指定的智能购买组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAutoLaunchGroupRequest 请求对象
     * @return SyncInvoker<DeleteAutoLaunchGroupRequest, DeleteAutoLaunchGroupResponse>
     */
    public SyncInvoker<DeleteAutoLaunchGroupRequest, DeleteAutoLaunchGroupResponse> deleteAutoLaunchGroupInvoker(
        DeleteAutoLaunchGroupRequest request) {
        return new SyncInvoker<>(request, CmsMeta.deleteAutoLaunchGroup, hcClient);
    }

    /**
     * 查询智能购买组列表
     *
     * 获取租户创建的所有的智能购买组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoLaunchGroupsRequest 请求对象
     * @return ListAutoLaunchGroupsResponse
     */
    public ListAutoLaunchGroupsResponse listAutoLaunchGroups(ListAutoLaunchGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CmsMeta.listAutoLaunchGroups);
    }

    /**
     * 查询智能购买组列表
     *
     * 获取租户创建的所有的智能购买组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoLaunchGroupsRequest 请求对象
     * @return SyncInvoker<ListAutoLaunchGroupsRequest, ListAutoLaunchGroupsResponse>
     */
    public SyncInvoker<ListAutoLaunchGroupsRequest, ListAutoLaunchGroupsResponse> listAutoLaunchGroupsInvoker(
        ListAutoLaunchGroupsRequest request) {
        return new SyncInvoker<>(request, CmsMeta.listAutoLaunchGroups, hcClient);
    }

    /**
     * 查询智能购买组实例列表
     *
     * 获取智能购买组创建的实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CmsMeta.listInstances);
    }

    /**
     * 查询智能购买组实例列表
     *
     * 获取智能购买组创建的实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<>(request, CmsMeta.listInstances, hcClient);
    }

    /**
     * 地域推荐
     *
     * 对ECS的资源供给的地域和规格进行推荐，推荐结果以打分的形式呈现，分数越高推荐程度越高
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupplyRecommendationRequest 请求对象
     * @return ListSupplyRecommendationResponse
     */
    public ListSupplyRecommendationResponse listSupplyRecommendation(ListSupplyRecommendationRequest request) {
        return hcClient.syncInvokeHttp(request, CmsMeta.listSupplyRecommendation);
    }

    /**
     * 地域推荐
     *
     * 对ECS的资源供给的地域和规格进行推荐，推荐结果以打分的形式呈现，分数越高推荐程度越高
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupplyRecommendationRequest 请求对象
     * @return SyncInvoker<ListSupplyRecommendationRequest, ListSupplyRecommendationResponse>
     */
    public SyncInvoker<ListSupplyRecommendationRequest, ListSupplyRecommendationResponse> listSupplyRecommendationInvoker(
        ListSupplyRecommendationRequest request) {
        return new SyncInvoker<>(request, CmsMeta.listSupplyRecommendation, hcClient);
    }

    /**
     * 查询智能购买组详情
     *
     * 查询指定智能购买组的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoLaunchGroupRequest 请求对象
     * @return ShowAutoLaunchGroupResponse
     */
    public ShowAutoLaunchGroupResponse showAutoLaunchGroup(ShowAutoLaunchGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CmsMeta.showAutoLaunchGroup);
    }

    /**
     * 查询智能购买组详情
     *
     * 查询指定智能购买组的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoLaunchGroupRequest 请求对象
     * @return SyncInvoker<ShowAutoLaunchGroupRequest, ShowAutoLaunchGroupResponse>
     */
    public SyncInvoker<ShowAutoLaunchGroupRequest, ShowAutoLaunchGroupResponse> showAutoLaunchGroupInvoker(
        ShowAutoLaunchGroupRequest request) {
        return new SyncInvoker<>(request, CmsMeta.showAutoLaunchGroup, hcClient);
    }

    /**
     * 修改智能购买组
     *
     * 更新指定智能购买组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoLaunchGroupRequest 请求对象
     * @return UpdateAutoLaunchGroupResponse
     */
    public UpdateAutoLaunchGroupResponse updateAutoLaunchGroup(UpdateAutoLaunchGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CmsMeta.updateAutoLaunchGroup);
    }

    /**
     * 修改智能购买组
     *
     * 更新指定智能购买组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoLaunchGroupRequest 请求对象
     * @return SyncInvoker<UpdateAutoLaunchGroupRequest, UpdateAutoLaunchGroupResponse>
     */
    public SyncInvoker<UpdateAutoLaunchGroupRequest, UpdateAutoLaunchGroupResponse> updateAutoLaunchGroupInvoker(
        UpdateAutoLaunchGroupRequest request) {
        return new SyncInvoker<>(request, CmsMeta.updateAutoLaunchGroup, hcClient);
    }

}
