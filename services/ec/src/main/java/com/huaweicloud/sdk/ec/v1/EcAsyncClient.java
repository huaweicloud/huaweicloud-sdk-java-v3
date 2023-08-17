package com.huaweicloud.sdk.ec.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.ec.v1.model.AddEcnWithErRequest;
import com.huaweicloud.sdk.ec.v1.model.AddEcnWithErResponse;
import com.huaweicloud.sdk.ec.v1.model.AddEcnWithIegRequest;
import com.huaweicloud.sdk.ec.v1.model.AddEcnWithIegResponse;
import com.huaweicloud.sdk.ec.v1.model.AddVrrpConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.AddVrrpConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.ChangeIegPasswordRequest;
import com.huaweicloud.sdk.ec.v1.model.ChangeIegPasswordResponse;
import com.huaweicloud.sdk.ec.v1.model.CreateEcnAccessPointRequest;
import com.huaweicloud.sdk.ec.v1.model.CreateEcnAccessPointResponse;
import com.huaweicloud.sdk.ec.v1.model.CreateEquipmentLanConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.CreateEquipmentLanConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.CreateEquipmentRequest;
import com.huaweicloud.sdk.ec.v1.model.CreateEquipmentResponse;
import com.huaweicloud.sdk.ec.v1.model.CreateEquipmentStaticRouteConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.CreateEquipmentStaticRouteConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.DeleteEcnAccessPointRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteEcnAccessPointResponse;
import com.huaweicloud.sdk.ec.v1.model.DeleteEcnWithErRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteEcnWithErResponse;
import com.huaweicloud.sdk.ec.v1.model.DeleteEcnWithIegRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteEcnWithIegResponse;
import com.huaweicloud.sdk.ec.v1.model.DeleteEquipmentLanConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteEquipmentLanConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.DeleteEquipmentRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteEquipmentResponse;
import com.huaweicloud.sdk.ec.v1.model.DeleteEquipmentStaticRouteConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteEquipmentStaticRouteConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.DeleteVrrpConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteVrrpConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.GenerateInitialConfigurationRequest;
import com.huaweicloud.sdk.ec.v1.model.GenerateInitialConfigurationResponse;
import com.huaweicloud.sdk.ec.v1.model.ListEcnAccessPointByEcnIdRequest;
import com.huaweicloud.sdk.ec.v1.model.ListEcnAccessPointByEcnIdResponse;
import com.huaweicloud.sdk.ec.v1.model.ListEcnRequest;
import com.huaweicloud.sdk.ec.v1.model.ListEcnResponse;
import com.huaweicloud.sdk.ec.v1.model.ListEcnWithErRequest;
import com.huaweicloud.sdk.ec.v1.model.ListEcnWithErResponse;
import com.huaweicloud.sdk.ec.v1.model.ListEcnWithIegRequest;
import com.huaweicloud.sdk.ec.v1.model.ListEcnWithIegResponse;
import com.huaweicloud.sdk.ec.v1.model.ListEquipmentInterfaceNameRequest;
import com.huaweicloud.sdk.ec.v1.model.ListEquipmentInterfaceNameResponse;
import com.huaweicloud.sdk.ec.v1.model.ListEquipmentsRequest;
import com.huaweicloud.sdk.ec.v1.model.ListEquipmentsResponse;
import com.huaweicloud.sdk.ec.v1.model.ListIegRequest;
import com.huaweicloud.sdk.ec.v1.model.ListIegResponse;
import com.huaweicloud.sdk.ec.v1.model.RebootEquipmentRequest;
import com.huaweicloud.sdk.ec.v1.model.RebootEquipmentResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEcnInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEcnInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEcnWithIegRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEcnWithIegResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentDnsInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentDnsInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentLanInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentLanInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentOspfRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentOspfResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentSpecificConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentSpecificConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentStaticRouteInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentStaticRouteInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentWanInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentWanInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowIegInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowIegInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowQuotasInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowQuotasInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowVrrpConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowVrrpConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.SwitchEquipmentHaTypeRequest;
import com.huaweicloud.sdk.ec.v1.model.SwitchEquipmentHaTypeResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEcnAccessPointRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEcnAccessPointResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEcnRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEcnResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentDnsInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentDnsInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentEsnRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentEsnResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentLanConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentLanConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentOspfRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentOspfResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentStaticRouteConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentStaticRouteConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentWanConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentWanConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateIegRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateIegResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateVrrpConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateVrrpConfigResponse;

import java.util.concurrent.CompletableFuture;

public class EcAsyncClient {

    protected HcClient hcClient;

    public EcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EcAsyncClient> newBuilder() {
        ClientBuilder<EcAsyncClient> clientBuilder = new ClientBuilder<>(EcAsyncClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 添加新的接入点
     *
     * 添加新的接入点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEcnAccessPointRequest 请求对象
     * @return CompletableFuture<CreateEcnAccessPointResponse>
     */
    public CompletableFuture<CreateEcnAccessPointResponse> createEcnAccessPointAsync(
        CreateEcnAccessPointRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.createEcnAccessPoint);
    }

    /**
     * 添加新的接入点
     *
     * 添加新的接入点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEcnAccessPointRequest 请求对象
     * @return AsyncInvoker<CreateEcnAccessPointRequest, CreateEcnAccessPointResponse>
     */
    public AsyncInvoker<CreateEcnAccessPointRequest, CreateEcnAccessPointResponse> createEcnAccessPointAsyncInvoker(
        CreateEcnAccessPointRequest request) {
        return new AsyncInvoker<CreateEcnAccessPointRequest, CreateEcnAccessPointResponse>(request,
            EcMeta.createEcnAccessPoint, hcClient);
    }

    /**
     * 删除接入点
     *
     * 根据企业连接网络ID，删除接入点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEcnAccessPointRequest 请求对象
     * @return CompletableFuture<DeleteEcnAccessPointResponse>
     */
    public CompletableFuture<DeleteEcnAccessPointResponse> deleteEcnAccessPointAsync(
        DeleteEcnAccessPointRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.deleteEcnAccessPoint);
    }

    /**
     * 删除接入点
     *
     * 根据企业连接网络ID，删除接入点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEcnAccessPointRequest 请求对象
     * @return AsyncInvoker<DeleteEcnAccessPointRequest, DeleteEcnAccessPointResponse>
     */
    public AsyncInvoker<DeleteEcnAccessPointRequest, DeleteEcnAccessPointResponse> deleteEcnAccessPointAsyncInvoker(
        DeleteEcnAccessPointRequest request) {
        return new AsyncInvoker<DeleteEcnAccessPointRequest, DeleteEcnAccessPointResponse>(request,
            EcMeta.deleteEcnAccessPoint, hcClient);
    }

    /**
     * 查询接入点
     *
     * 根据企业连接网络ID，查询其下所有接入点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEcnAccessPointByEcnIdRequest 请求对象
     * @return CompletableFuture<ListEcnAccessPointByEcnIdResponse>
     */
    public CompletableFuture<ListEcnAccessPointByEcnIdResponse> listEcnAccessPointByEcnIdAsync(
        ListEcnAccessPointByEcnIdRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.listEcnAccessPointByEcnId);
    }

    /**
     * 查询接入点
     *
     * 根据企业连接网络ID，查询其下所有接入点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEcnAccessPointByEcnIdRequest 请求对象
     * @return AsyncInvoker<ListEcnAccessPointByEcnIdRequest, ListEcnAccessPointByEcnIdResponse>
     */
    public AsyncInvoker<ListEcnAccessPointByEcnIdRequest, ListEcnAccessPointByEcnIdResponse> listEcnAccessPointByEcnIdAsyncInvoker(
        ListEcnAccessPointByEcnIdRequest request) {
        return new AsyncInvoker<ListEcnAccessPointByEcnIdRequest, ListEcnAccessPointByEcnIdResponse>(request,
            EcMeta.listEcnAccessPointByEcnId, hcClient);
    }

    /**
     * 更新接入点
     *
     * 根据企业连接网络ID，更新接入点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEcnAccessPointRequest 请求对象
     * @return CompletableFuture<UpdateEcnAccessPointResponse>
     */
    public CompletableFuture<UpdateEcnAccessPointResponse> updateEcnAccessPointAsync(
        UpdateEcnAccessPointRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.updateEcnAccessPoint);
    }

    /**
     * 更新接入点
     *
     * 根据企业连接网络ID，更新接入点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEcnAccessPointRequest 请求对象
     * @return AsyncInvoker<UpdateEcnAccessPointRequest, UpdateEcnAccessPointResponse>
     */
    public AsyncInvoker<UpdateEcnAccessPointRequest, UpdateEcnAccessPointResponse> updateEcnAccessPointAsyncInvoker(
        UpdateEcnAccessPointRequest request) {
        return new AsyncInvoker<UpdateEcnAccessPointRequest, UpdateEcnAccessPointResponse>(request,
            EcMeta.updateEcnAccessPoint, hcClient);
    }

    /**
     * 绑定智能企业网关到企业连接网络
     *
     * 绑定智能企业网关到企业连接网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddEcnWithIegRequest 请求对象
     * @return CompletableFuture<AddEcnWithIegResponse>
     */
    public CompletableFuture<AddEcnWithIegResponse> addEcnWithIegAsync(AddEcnWithIegRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.addEcnWithIeg);
    }

    /**
     * 绑定智能企业网关到企业连接网络
     *
     * 绑定智能企业网关到企业连接网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddEcnWithIegRequest 请求对象
     * @return AsyncInvoker<AddEcnWithIegRequest, AddEcnWithIegResponse>
     */
    public AsyncInvoker<AddEcnWithIegRequest, AddEcnWithIegResponse> addEcnWithIegAsyncInvoker(
        AddEcnWithIegRequest request) {
        return new AsyncInvoker<AddEcnWithIegRequest, AddEcnWithIegResponse>(request, EcMeta.addEcnWithIeg, hcClient);
    }

    /**
     * 解除智能企业网关和企业连接网络的绑定
     *
     * 解除智能企业网关和企业连接网络的绑定
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEcnWithIegRequest 请求对象
     * @return CompletableFuture<DeleteEcnWithIegResponse>
     */
    public CompletableFuture<DeleteEcnWithIegResponse> deleteEcnWithIegAsync(DeleteEcnWithIegRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.deleteEcnWithIeg);
    }

    /**
     * 解除智能企业网关和企业连接网络的绑定
     *
     * 解除智能企业网关和企业连接网络的绑定
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEcnWithIegRequest 请求对象
     * @return AsyncInvoker<DeleteEcnWithIegRequest, DeleteEcnWithIegResponse>
     */
    public AsyncInvoker<DeleteEcnWithIegRequest, DeleteEcnWithIegResponse> deleteEcnWithIegAsyncInvoker(
        DeleteEcnWithIegRequest request) {
        return new AsyncInvoker<DeleteEcnWithIegRequest, DeleteEcnWithIegResponse>(request, EcMeta.deleteEcnWithIeg,
            hcClient);
    }

    /**
     * 查询企业连接网络列表
     *
     * 查询租户的企业连接网络列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEcnRequest 请求对象
     * @return CompletableFuture<ListEcnResponse>
     */
    public CompletableFuture<ListEcnResponse> listEcnAsync(ListEcnRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.listEcn);
    }

    /**
     * 查询企业连接网络列表
     *
     * 查询租户的企业连接网络列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEcnRequest 请求对象
     * @return AsyncInvoker<ListEcnRequest, ListEcnResponse>
     */
    public AsyncInvoker<ListEcnRequest, ListEcnResponse> listEcnAsyncInvoker(ListEcnRequest request) {
        return new AsyncInvoker<ListEcnRequest, ListEcnResponse>(request, EcMeta.listEcn, hcClient);
    }

    /**
     * 查询企业连接网络与智能企业网关绑定关系
     *
     * 根据企业连接网络ID，查询企业连接网络与智能企业网关绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEcnWithIegRequest 请求对象
     * @return CompletableFuture<ListEcnWithIegResponse>
     */
    public CompletableFuture<ListEcnWithIegResponse> listEcnWithIegAsync(ListEcnWithIegRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.listEcnWithIeg);
    }

    /**
     * 查询企业连接网络与智能企业网关绑定关系
     *
     * 根据企业连接网络ID，查询企业连接网络与智能企业网关绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEcnWithIegRequest 请求对象
     * @return AsyncInvoker<ListEcnWithIegRequest, ListEcnWithIegResponse>
     */
    public AsyncInvoker<ListEcnWithIegRequest, ListEcnWithIegResponse> listEcnWithIegAsyncInvoker(
        ListEcnWithIegRequest request) {
        return new AsyncInvoker<ListEcnWithIegRequest, ListEcnWithIegResponse>(request, EcMeta.listEcnWithIeg,
            hcClient);
    }

    /**
     * 查询企业连接网络
     *
     * 根据企业连接网络ID，查询企业连接网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEcnInfoRequest 请求对象
     * @return CompletableFuture<ShowEcnInfoResponse>
     */
    public CompletableFuture<ShowEcnInfoResponse> showEcnInfoAsync(ShowEcnInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.showEcnInfo);
    }

    /**
     * 查询企业连接网络
     *
     * 根据企业连接网络ID，查询企业连接网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEcnInfoRequest 请求对象
     * @return AsyncInvoker<ShowEcnInfoRequest, ShowEcnInfoResponse>
     */
    public AsyncInvoker<ShowEcnInfoRequest, ShowEcnInfoResponse> showEcnInfoAsyncInvoker(ShowEcnInfoRequest request) {
        return new AsyncInvoker<ShowEcnInfoRequest, ShowEcnInfoResponse>(request, EcMeta.showEcnInfo, hcClient);
    }

    /**
     * 查询企业连接网络与单个智能企业网关绑定关系
     *
     * 查询企业连接网络与单个智能企业网关绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEcnWithIegRequest 请求对象
     * @return CompletableFuture<ShowEcnWithIegResponse>
     */
    public CompletableFuture<ShowEcnWithIegResponse> showEcnWithIegAsync(ShowEcnWithIegRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.showEcnWithIeg);
    }

    /**
     * 查询企业连接网络与单个智能企业网关绑定关系
     *
     * 查询企业连接网络与单个智能企业网关绑定关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEcnWithIegRequest 请求对象
     * @return AsyncInvoker<ShowEcnWithIegRequest, ShowEcnWithIegResponse>
     */
    public AsyncInvoker<ShowEcnWithIegRequest, ShowEcnWithIegResponse> showEcnWithIegAsyncInvoker(
        ShowEcnWithIegRequest request) {
        return new AsyncInvoker<ShowEcnWithIegRequest, ShowEcnWithIegResponse>(request, EcMeta.showEcnWithIeg,
            hcClient);
    }

    /**
     * 更新企业连接网络
     *
     * 根据企业连接网络ID，更新企业连接网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEcnRequest 请求对象
     * @return CompletableFuture<UpdateEcnResponse>
     */
    public CompletableFuture<UpdateEcnResponse> updateEcnAsync(UpdateEcnRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.updateEcn);
    }

    /**
     * 更新企业连接网络
     *
     * 根据企业连接网络ID，更新企业连接网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEcnRequest 请求对象
     * @return AsyncInvoker<UpdateEcnRequest, UpdateEcnResponse>
     */
    public AsyncInvoker<UpdateEcnRequest, UpdateEcnResponse> updateEcnAsyncInvoker(UpdateEcnRequest request) {
        return new AsyncInvoker<UpdateEcnRequest, UpdateEcnResponse>(request, EcMeta.updateEcn, hcClient);
    }

    /**
     * 激活智能企业网关设备
     *
     * 激活智能企业网关设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEquipmentRequest 请求对象
     * @return CompletableFuture<CreateEquipmentResponse>
     */
    public CompletableFuture<CreateEquipmentResponse> createEquipmentAsync(CreateEquipmentRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.createEquipment);
    }

    /**
     * 激活智能企业网关设备
     *
     * 激活智能企业网关设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEquipmentRequest 请求对象
     * @return AsyncInvoker<CreateEquipmentRequest, CreateEquipmentResponse>
     */
    public AsyncInvoker<CreateEquipmentRequest, CreateEquipmentResponse> createEquipmentAsyncInvoker(
        CreateEquipmentRequest request) {
        return new AsyncInvoker<CreateEquipmentRequest, CreateEquipmentResponse>(request, EcMeta.createEquipment,
            hcClient);
    }

    /**
     * 移除智能企业网关设备
     *
     * 移除智能企业网关设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEquipmentRequest 请求对象
     * @return CompletableFuture<DeleteEquipmentResponse>
     */
    public CompletableFuture<DeleteEquipmentResponse> deleteEquipmentAsync(DeleteEquipmentRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.deleteEquipment);
    }

    /**
     * 移除智能企业网关设备
     *
     * 移除智能企业网关设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEquipmentRequest 请求对象
     * @return AsyncInvoker<DeleteEquipmentRequest, DeleteEquipmentResponse>
     */
    public AsyncInvoker<DeleteEquipmentRequest, DeleteEquipmentResponse> deleteEquipmentAsyncInvoker(
        DeleteEquipmentRequest request) {
        return new AsyncInvoker<DeleteEquipmentRequest, DeleteEquipmentResponse>(request, EcMeta.deleteEquipment,
            hcClient);
    }

    /**
     * 生成智能企业网关设备初始配置
     *
     * 生成智能企业网关设备初始配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GenerateInitialConfigurationRequest 请求对象
     * @return CompletableFuture<GenerateInitialConfigurationResponse>
     */
    public CompletableFuture<GenerateInitialConfigurationResponse> generateInitialConfigurationAsync(
        GenerateInitialConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.generateInitialConfiguration);
    }

    /**
     * 生成智能企业网关设备初始配置
     *
     * 生成智能企业网关设备初始配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GenerateInitialConfigurationRequest 请求对象
     * @return AsyncInvoker<GenerateInitialConfigurationRequest, GenerateInitialConfigurationResponse>
     */
    public AsyncInvoker<GenerateInitialConfigurationRequest, GenerateInitialConfigurationResponse> generateInitialConfigurationAsyncInvoker(
        GenerateInitialConfigurationRequest request) {
        return new AsyncInvoker<GenerateInitialConfigurationRequest, GenerateInitialConfigurationResponse>(request,
            EcMeta.generateInitialConfiguration, hcClient);
    }

    /**
     * 查询智能企业网关设备列表
     *
     * 根据智能企业网关ID，查询智能企业网关设备列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEquipmentsRequest 请求对象
     * @return CompletableFuture<ListEquipmentsResponse>
     */
    public CompletableFuture<ListEquipmentsResponse> listEquipmentsAsync(ListEquipmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.listEquipments);
    }

    /**
     * 查询智能企业网关设备列表
     *
     * 根据智能企业网关ID，查询智能企业网关设备列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEquipmentsRequest 请求对象
     * @return AsyncInvoker<ListEquipmentsRequest, ListEquipmentsResponse>
     */
    public AsyncInvoker<ListEquipmentsRequest, ListEquipmentsResponse> listEquipmentsAsyncInvoker(
        ListEquipmentsRequest request) {
        return new AsyncInvoker<ListEquipmentsRequest, ListEquipmentsResponse>(request, EcMeta.listEquipments,
            hcClient);
    }

    /**
     * 重启智能企业网关设备
     *
     * 重启智能企业网关设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RebootEquipmentRequest 请求对象
     * @return CompletableFuture<RebootEquipmentResponse>
     */
    public CompletableFuture<RebootEquipmentResponse> rebootEquipmentAsync(RebootEquipmentRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.rebootEquipment);
    }

    /**
     * 重启智能企业网关设备
     *
     * 重启智能企业网关设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RebootEquipmentRequest 请求对象
     * @return AsyncInvoker<RebootEquipmentRequest, RebootEquipmentResponse>
     */
    public AsyncInvoker<RebootEquipmentRequest, RebootEquipmentResponse> rebootEquipmentAsyncInvoker(
        RebootEquipmentRequest request) {
        return new AsyncInvoker<RebootEquipmentRequest, RebootEquipmentResponse>(request, EcMeta.rebootEquipment,
            hcClient);
    }

    /**
     * 查询智能企业网关设备
     *
     * 查询智能企业网关设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentInfoRequest 请求对象
     * @return CompletableFuture<ShowEquipmentInfoResponse>
     */
    public CompletableFuture<ShowEquipmentInfoResponse> showEquipmentInfoAsync(ShowEquipmentInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.showEquipmentInfo);
    }

    /**
     * 查询智能企业网关设备
     *
     * 查询智能企业网关设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentInfoRequest 请求对象
     * @return AsyncInvoker<ShowEquipmentInfoRequest, ShowEquipmentInfoResponse>
     */
    public AsyncInvoker<ShowEquipmentInfoRequest, ShowEquipmentInfoResponse> showEquipmentInfoAsyncInvoker(
        ShowEquipmentInfoRequest request) {
        return new AsyncInvoker<ShowEquipmentInfoRequest, ShowEquipmentInfoResponse>(request, EcMeta.showEquipmentInfo,
            hcClient);
    }

    /**
     * 查询智能企业网关设备基础规格配置
     *
     * 查询智能企业网关设备基础规格配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentSpecificConfigRequest 请求对象
     * @return CompletableFuture<ShowEquipmentSpecificConfigResponse>
     */
    public CompletableFuture<ShowEquipmentSpecificConfigResponse> showEquipmentSpecificConfigAsync(
        ShowEquipmentSpecificConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.showEquipmentSpecificConfig);
    }

    /**
     * 查询智能企业网关设备基础规格配置
     *
     * 查询智能企业网关设备基础规格配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentSpecificConfigRequest 请求对象
     * @return AsyncInvoker<ShowEquipmentSpecificConfigRequest, ShowEquipmentSpecificConfigResponse>
     */
    public AsyncInvoker<ShowEquipmentSpecificConfigRequest, ShowEquipmentSpecificConfigResponse> showEquipmentSpecificConfigAsyncInvoker(
        ShowEquipmentSpecificConfigRequest request) {
        return new AsyncInvoker<ShowEquipmentSpecificConfigRequest, ShowEquipmentSpecificConfigResponse>(request,
            EcMeta.showEquipmentSpecificConfig, hcClient);
    }

    /**
     * 修改智能企业网关设备ESN
     *
     * 修改智能企业网关设备ESN
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentEsnRequest 请求对象
     * @return CompletableFuture<UpdateEquipmentEsnResponse>
     */
    public CompletableFuture<UpdateEquipmentEsnResponse> updateEquipmentEsnAsync(UpdateEquipmentEsnRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.updateEquipmentEsn);
    }

    /**
     * 修改智能企业网关设备ESN
     *
     * 修改智能企业网关设备ESN
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentEsnRequest 请求对象
     * @return AsyncInvoker<UpdateEquipmentEsnRequest, UpdateEquipmentEsnResponse>
     */
    public AsyncInvoker<UpdateEquipmentEsnRequest, UpdateEquipmentEsnResponse> updateEquipmentEsnAsyncInvoker(
        UpdateEquipmentEsnRequest request) {
        return new AsyncInvoker<UpdateEquipmentEsnRequest, UpdateEquipmentEsnResponse>(request,
            EcMeta.updateEquipmentEsn, hcClient);
    }

    /**
     * 更新智能企业网关设备
     *
     * 更新智能企业网关设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentInfoRequest 请求对象
     * @return CompletableFuture<UpdateEquipmentInfoResponse>
     */
    public CompletableFuture<UpdateEquipmentInfoResponse> updateEquipmentInfoAsync(UpdateEquipmentInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.updateEquipmentInfo);
    }

    /**
     * 更新智能企业网关设备
     *
     * 更新智能企业网关设备
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentInfoRequest 请求对象
     * @return AsyncInvoker<UpdateEquipmentInfoRequest, UpdateEquipmentInfoResponse>
     */
    public AsyncInvoker<UpdateEquipmentInfoRequest, UpdateEquipmentInfoResponse> updateEquipmentInfoAsyncInvoker(
        UpdateEquipmentInfoRequest request) {
        return new AsyncInvoker<UpdateEquipmentInfoRequest, UpdateEquipmentInfoResponse>(request,
            EcMeta.updateEquipmentInfo, hcClient);
    }

    /**
     * 创建智能企业网关设备LAN口配置
     *
     * 创建智能企业网关设备LAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEquipmentLanConfigRequest 请求对象
     * @return CompletableFuture<CreateEquipmentLanConfigResponse>
     */
    public CompletableFuture<CreateEquipmentLanConfigResponse> createEquipmentLanConfigAsync(
        CreateEquipmentLanConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.createEquipmentLanConfig);
    }

    /**
     * 创建智能企业网关设备LAN口配置
     *
     * 创建智能企业网关设备LAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEquipmentLanConfigRequest 请求对象
     * @return AsyncInvoker<CreateEquipmentLanConfigRequest, CreateEquipmentLanConfigResponse>
     */
    public AsyncInvoker<CreateEquipmentLanConfigRequest, CreateEquipmentLanConfigResponse> createEquipmentLanConfigAsyncInvoker(
        CreateEquipmentLanConfigRequest request) {
        return new AsyncInvoker<CreateEquipmentLanConfigRequest, CreateEquipmentLanConfigResponse>(request,
            EcMeta.createEquipmentLanConfig, hcClient);
    }

    /**
     * 删除智能企业网关设备LAN口配置
     *
     * 删除智能企业网关设备LAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEquipmentLanConfigRequest 请求对象
     * @return CompletableFuture<DeleteEquipmentLanConfigResponse>
     */
    public CompletableFuture<DeleteEquipmentLanConfigResponse> deleteEquipmentLanConfigAsync(
        DeleteEquipmentLanConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.deleteEquipmentLanConfig);
    }

    /**
     * 删除智能企业网关设备LAN口配置
     *
     * 删除智能企业网关设备LAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEquipmentLanConfigRequest 请求对象
     * @return AsyncInvoker<DeleteEquipmentLanConfigRequest, DeleteEquipmentLanConfigResponse>
     */
    public AsyncInvoker<DeleteEquipmentLanConfigRequest, DeleteEquipmentLanConfigResponse> deleteEquipmentLanConfigAsyncInvoker(
        DeleteEquipmentLanConfigRequest request) {
        return new AsyncInvoker<DeleteEquipmentLanConfigRequest, DeleteEquipmentLanConfigResponse>(request,
            EcMeta.deleteEquipmentLanConfig, hcClient);
    }

    /**
     * 查询智能企业网关已配置的接口名字
     *
     * 查询智能企业网关已配置的接口名字
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEquipmentInterfaceNameRequest 请求对象
     * @return CompletableFuture<ListEquipmentInterfaceNameResponse>
     */
    public CompletableFuture<ListEquipmentInterfaceNameResponse> listEquipmentInterfaceNameAsync(
        ListEquipmentInterfaceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.listEquipmentInterfaceName);
    }

    /**
     * 查询智能企业网关已配置的接口名字
     *
     * 查询智能企业网关已配置的接口名字
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEquipmentInterfaceNameRequest 请求对象
     * @return AsyncInvoker<ListEquipmentInterfaceNameRequest, ListEquipmentInterfaceNameResponse>
     */
    public AsyncInvoker<ListEquipmentInterfaceNameRequest, ListEquipmentInterfaceNameResponse> listEquipmentInterfaceNameAsyncInvoker(
        ListEquipmentInterfaceNameRequest request) {
        return new AsyncInvoker<ListEquipmentInterfaceNameRequest, ListEquipmentInterfaceNameResponse>(request,
            EcMeta.listEquipmentInterfaceName, hcClient);
    }

    /**
     * 查询智能企业网关设备主备DNS配置
     *
     * 查询智能企业网关设备主备DNS配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentDnsInfoRequest 请求对象
     * @return CompletableFuture<ShowEquipmentDnsInfoResponse>
     */
    public CompletableFuture<ShowEquipmentDnsInfoResponse> showEquipmentDnsInfoAsync(
        ShowEquipmentDnsInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.showEquipmentDnsInfo);
    }

    /**
     * 查询智能企业网关设备主备DNS配置
     *
     * 查询智能企业网关设备主备DNS配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentDnsInfoRequest 请求对象
     * @return AsyncInvoker<ShowEquipmentDnsInfoRequest, ShowEquipmentDnsInfoResponse>
     */
    public AsyncInvoker<ShowEquipmentDnsInfoRequest, ShowEquipmentDnsInfoResponse> showEquipmentDnsInfoAsyncInvoker(
        ShowEquipmentDnsInfoRequest request) {
        return new AsyncInvoker<ShowEquipmentDnsInfoRequest, ShowEquipmentDnsInfoResponse>(request,
            EcMeta.showEquipmentDnsInfo, hcClient);
    }

    /**
     * 查询智能企业网关设备LAN口配置
     *
     * 查询智能企业网关设备LAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentLanInfoRequest 请求对象
     * @return CompletableFuture<ShowEquipmentLanInfoResponse>
     */
    public CompletableFuture<ShowEquipmentLanInfoResponse> showEquipmentLanInfoAsync(
        ShowEquipmentLanInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.showEquipmentLanInfo);
    }

    /**
     * 查询智能企业网关设备LAN口配置
     *
     * 查询智能企业网关设备LAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentLanInfoRequest 请求对象
     * @return AsyncInvoker<ShowEquipmentLanInfoRequest, ShowEquipmentLanInfoResponse>
     */
    public AsyncInvoker<ShowEquipmentLanInfoRequest, ShowEquipmentLanInfoResponse> showEquipmentLanInfoAsyncInvoker(
        ShowEquipmentLanInfoRequest request) {
        return new AsyncInvoker<ShowEquipmentLanInfoRequest, ShowEquipmentLanInfoResponse>(request,
            EcMeta.showEquipmentLanInfo, hcClient);
    }

    /**
     * 更新智能企业网关设备主备DNS配置
     *
     * 更新智能企业网关设备主备DNS配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentDnsInfoRequest 请求对象
     * @return CompletableFuture<UpdateEquipmentDnsInfoResponse>
     */
    public CompletableFuture<UpdateEquipmentDnsInfoResponse> updateEquipmentDnsInfoAsync(
        UpdateEquipmentDnsInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.updateEquipmentDnsInfo);
    }

    /**
     * 更新智能企业网关设备主备DNS配置
     *
     * 更新智能企业网关设备主备DNS配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentDnsInfoRequest 请求对象
     * @return AsyncInvoker<UpdateEquipmentDnsInfoRequest, UpdateEquipmentDnsInfoResponse>
     */
    public AsyncInvoker<UpdateEquipmentDnsInfoRequest, UpdateEquipmentDnsInfoResponse> updateEquipmentDnsInfoAsyncInvoker(
        UpdateEquipmentDnsInfoRequest request) {
        return new AsyncInvoker<UpdateEquipmentDnsInfoRequest, UpdateEquipmentDnsInfoResponse>(request,
            EcMeta.updateEquipmentDnsInfo, hcClient);
    }

    /**
     * 更新智能企业网关设备LAN口配置
     *
     * 更新智能企业网关设备LAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentLanConfigRequest 请求对象
     * @return CompletableFuture<UpdateEquipmentLanConfigResponse>
     */
    public CompletableFuture<UpdateEquipmentLanConfigResponse> updateEquipmentLanConfigAsync(
        UpdateEquipmentLanConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.updateEquipmentLanConfig);
    }

    /**
     * 更新智能企业网关设备LAN口配置
     *
     * 更新智能企业网关设备LAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentLanConfigRequest 请求对象
     * @return AsyncInvoker<UpdateEquipmentLanConfigRequest, UpdateEquipmentLanConfigResponse>
     */
    public AsyncInvoker<UpdateEquipmentLanConfigRequest, UpdateEquipmentLanConfigResponse> updateEquipmentLanConfigAsyncInvoker(
        UpdateEquipmentLanConfigRequest request) {
        return new AsyncInvoker<UpdateEquipmentLanConfigRequest, UpdateEquipmentLanConfigResponse>(request,
            EcMeta.updateEquipmentLanConfig, hcClient);
    }

    /**
     * 查询智能企业网关设备OSPF配置
     *
     * 查询智能企业网关设备OSPF配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentOspfRequest 请求对象
     * @return CompletableFuture<ShowEquipmentOspfResponse>
     */
    public CompletableFuture<ShowEquipmentOspfResponse> showEquipmentOspfAsync(ShowEquipmentOspfRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.showEquipmentOspf);
    }

    /**
     * 查询智能企业网关设备OSPF配置
     *
     * 查询智能企业网关设备OSPF配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentOspfRequest 请求对象
     * @return AsyncInvoker<ShowEquipmentOspfRequest, ShowEquipmentOspfResponse>
     */
    public AsyncInvoker<ShowEquipmentOspfRequest, ShowEquipmentOspfResponse> showEquipmentOspfAsyncInvoker(
        ShowEquipmentOspfRequest request) {
        return new AsyncInvoker<ShowEquipmentOspfRequest, ShowEquipmentOspfResponse>(request, EcMeta.showEquipmentOspf,
            hcClient);
    }

    /**
     * 配置智能企业网关设备OSPF协议
     *
     * 配置智能企业网关设备OSPF协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentOspfRequest 请求对象
     * @return CompletableFuture<UpdateEquipmentOspfResponse>
     */
    public CompletableFuture<UpdateEquipmentOspfResponse> updateEquipmentOspfAsync(UpdateEquipmentOspfRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.updateEquipmentOspf);
    }

    /**
     * 配置智能企业网关设备OSPF协议
     *
     * 配置智能企业网关设备OSPF协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentOspfRequest 请求对象
     * @return AsyncInvoker<UpdateEquipmentOspfRequest, UpdateEquipmentOspfResponse>
     */
    public AsyncInvoker<UpdateEquipmentOspfRequest, UpdateEquipmentOspfResponse> updateEquipmentOspfAsyncInvoker(
        UpdateEquipmentOspfRequest request) {
        return new AsyncInvoker<UpdateEquipmentOspfRequest, UpdateEquipmentOspfResponse>(request,
            EcMeta.updateEquipmentOspf, hcClient);
    }

    /**
     * 创建智能企业网关设备静态路由配置
     *
     * 创建智能企业网关设备静态路由配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEquipmentStaticRouteConfigRequest 请求对象
     * @return CompletableFuture<CreateEquipmentStaticRouteConfigResponse>
     */
    public CompletableFuture<CreateEquipmentStaticRouteConfigResponse> createEquipmentStaticRouteConfigAsync(
        CreateEquipmentStaticRouteConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.createEquipmentStaticRouteConfig);
    }

    /**
     * 创建智能企业网关设备静态路由配置
     *
     * 创建智能企业网关设备静态路由配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEquipmentStaticRouteConfigRequest 请求对象
     * @return AsyncInvoker<CreateEquipmentStaticRouteConfigRequest, CreateEquipmentStaticRouteConfigResponse>
     */
    public AsyncInvoker<CreateEquipmentStaticRouteConfigRequest, CreateEquipmentStaticRouteConfigResponse> createEquipmentStaticRouteConfigAsyncInvoker(
        CreateEquipmentStaticRouteConfigRequest request) {
        return new AsyncInvoker<CreateEquipmentStaticRouteConfigRequest, CreateEquipmentStaticRouteConfigResponse>(
            request, EcMeta.createEquipmentStaticRouteConfig, hcClient);
    }

    /**
     * 删除智能企业网关设备静态路由配置
     *
     * 删除智能企业网关设备静态路由配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEquipmentStaticRouteConfigRequest 请求对象
     * @return CompletableFuture<DeleteEquipmentStaticRouteConfigResponse>
     */
    public CompletableFuture<DeleteEquipmentStaticRouteConfigResponse> deleteEquipmentStaticRouteConfigAsync(
        DeleteEquipmentStaticRouteConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.deleteEquipmentStaticRouteConfig);
    }

    /**
     * 删除智能企业网关设备静态路由配置
     *
     * 删除智能企业网关设备静态路由配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEquipmentStaticRouteConfigRequest 请求对象
     * @return AsyncInvoker<DeleteEquipmentStaticRouteConfigRequest, DeleteEquipmentStaticRouteConfigResponse>
     */
    public AsyncInvoker<DeleteEquipmentStaticRouteConfigRequest, DeleteEquipmentStaticRouteConfigResponse> deleteEquipmentStaticRouteConfigAsyncInvoker(
        DeleteEquipmentStaticRouteConfigRequest request) {
        return new AsyncInvoker<DeleteEquipmentStaticRouteConfigRequest, DeleteEquipmentStaticRouteConfigResponse>(
            request, EcMeta.deleteEquipmentStaticRouteConfig, hcClient);
    }

    /**
     * 查询智能企业网关设备静态路由配置
     *
     * 查询智能企业网关设备静态路由配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentStaticRouteInfoRequest 请求对象
     * @return CompletableFuture<ShowEquipmentStaticRouteInfoResponse>
     */
    public CompletableFuture<ShowEquipmentStaticRouteInfoResponse> showEquipmentStaticRouteInfoAsync(
        ShowEquipmentStaticRouteInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.showEquipmentStaticRouteInfo);
    }

    /**
     * 查询智能企业网关设备静态路由配置
     *
     * 查询智能企业网关设备静态路由配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentStaticRouteInfoRequest 请求对象
     * @return AsyncInvoker<ShowEquipmentStaticRouteInfoRequest, ShowEquipmentStaticRouteInfoResponse>
     */
    public AsyncInvoker<ShowEquipmentStaticRouteInfoRequest, ShowEquipmentStaticRouteInfoResponse> showEquipmentStaticRouteInfoAsyncInvoker(
        ShowEquipmentStaticRouteInfoRequest request) {
        return new AsyncInvoker<ShowEquipmentStaticRouteInfoRequest, ShowEquipmentStaticRouteInfoResponse>(request,
            EcMeta.showEquipmentStaticRouteInfo, hcClient);
    }

    /**
     * 更新智能企业网关设备静态路由配置
     *
     * 更新智能企业网关设备静态路由配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentStaticRouteConfigRequest 请求对象
     * @return CompletableFuture<UpdateEquipmentStaticRouteConfigResponse>
     */
    public CompletableFuture<UpdateEquipmentStaticRouteConfigResponse> updateEquipmentStaticRouteConfigAsync(
        UpdateEquipmentStaticRouteConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.updateEquipmentStaticRouteConfig);
    }

    /**
     * 更新智能企业网关设备静态路由配置
     *
     * 更新智能企业网关设备静态路由配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentStaticRouteConfigRequest 请求对象
     * @return AsyncInvoker<UpdateEquipmentStaticRouteConfigRequest, UpdateEquipmentStaticRouteConfigResponse>
     */
    public AsyncInvoker<UpdateEquipmentStaticRouteConfigRequest, UpdateEquipmentStaticRouteConfigResponse> updateEquipmentStaticRouteConfigAsyncInvoker(
        UpdateEquipmentStaticRouteConfigRequest request) {
        return new AsyncInvoker<UpdateEquipmentStaticRouteConfigRequest, UpdateEquipmentStaticRouteConfigResponse>(
            request, EcMeta.updateEquipmentStaticRouteConfig, hcClient);
    }

    /**
     * 查询智能企业网关设备WAN口配置
     *
     * 查询智能企业网关设备WAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentWanInfoRequest 请求对象
     * @return CompletableFuture<ShowEquipmentWanInfoResponse>
     */
    public CompletableFuture<ShowEquipmentWanInfoResponse> showEquipmentWanInfoAsync(
        ShowEquipmentWanInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.showEquipmentWanInfo);
    }

    /**
     * 查询智能企业网关设备WAN口配置
     *
     * 查询智能企业网关设备WAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEquipmentWanInfoRequest 请求对象
     * @return AsyncInvoker<ShowEquipmentWanInfoRequest, ShowEquipmentWanInfoResponse>
     */
    public AsyncInvoker<ShowEquipmentWanInfoRequest, ShowEquipmentWanInfoResponse> showEquipmentWanInfoAsyncInvoker(
        ShowEquipmentWanInfoRequest request) {
        return new AsyncInvoker<ShowEquipmentWanInfoRequest, ShowEquipmentWanInfoResponse>(request,
            EcMeta.showEquipmentWanInfo, hcClient);
    }

    /**
     * 更新智能企业网关设备WAN口配置
     *
     * 更新智能企业网关设备WAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentWanConfigRequest 请求对象
     * @return CompletableFuture<UpdateEquipmentWanConfigResponse>
     */
    public CompletableFuture<UpdateEquipmentWanConfigResponse> updateEquipmentWanConfigAsync(
        UpdateEquipmentWanConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.updateEquipmentWanConfig);
    }

    /**
     * 更新智能企业网关设备WAN口配置
     *
     * 更新智能企业网关设备WAN口配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEquipmentWanConfigRequest 请求对象
     * @return AsyncInvoker<UpdateEquipmentWanConfigRequest, UpdateEquipmentWanConfigResponse>
     */
    public AsyncInvoker<UpdateEquipmentWanConfigRequest, UpdateEquipmentWanConfigResponse> updateEquipmentWanConfigAsyncInvoker(
        UpdateEquipmentWanConfigRequest request) {
        return new AsyncInvoker<UpdateEquipmentWanConfigRequest, UpdateEquipmentWanConfigResponse>(request,
            EcMeta.updateEquipmentWanConfig, hcClient);
    }

    /**
     * 关联企业路由器到企业连接网络
     *
     * 关联企业路由器到企业连接网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddEcnWithErRequest 请求对象
     * @return CompletableFuture<AddEcnWithErResponse>
     */
    public CompletableFuture<AddEcnWithErResponse> addEcnWithErAsync(AddEcnWithErRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.addEcnWithEr);
    }

    /**
     * 关联企业路由器到企业连接网络
     *
     * 关联企业路由器到企业连接网络
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddEcnWithErRequest 请求对象
     * @return AsyncInvoker<AddEcnWithErRequest, AddEcnWithErResponse>
     */
    public AsyncInvoker<AddEcnWithErRequest, AddEcnWithErResponse> addEcnWithErAsyncInvoker(
        AddEcnWithErRequest request) {
        return new AsyncInvoker<AddEcnWithErRequest, AddEcnWithErResponse>(request, EcMeta.addEcnWithEr, hcClient);
    }

    /**
     * 解除企业路由器和企业连接网络的关联
     *
     * 解除企业路由器和企业连接网络的关联
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEcnWithErRequest 请求对象
     * @return CompletableFuture<DeleteEcnWithErResponse>
     */
    public CompletableFuture<DeleteEcnWithErResponse> deleteEcnWithErAsync(DeleteEcnWithErRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.deleteEcnWithEr);
    }

    /**
     * 解除企业路由器和企业连接网络的关联
     *
     * 解除企业路由器和企业连接网络的关联
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEcnWithErRequest 请求对象
     * @return AsyncInvoker<DeleteEcnWithErRequest, DeleteEcnWithErResponse>
     */
    public AsyncInvoker<DeleteEcnWithErRequest, DeleteEcnWithErResponse> deleteEcnWithErAsyncInvoker(
        DeleteEcnWithErRequest request) {
        return new AsyncInvoker<DeleteEcnWithErRequest, DeleteEcnWithErResponse>(request, EcMeta.deleteEcnWithEr,
            hcClient);
    }

    /**
     * 查询企业连接网络网与企业路由器关联关系
     *
     * 根据企业连接网络ID，查询企业连接网络网与企业路由器关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEcnWithErRequest 请求对象
     * @return CompletableFuture<ListEcnWithErResponse>
     */
    public CompletableFuture<ListEcnWithErResponse> listEcnWithErAsync(ListEcnWithErRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.listEcnWithEr);
    }

    /**
     * 查询企业连接网络网与企业路由器关联关系
     *
     * 根据企业连接网络ID，查询企业连接网络网与企业路由器关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEcnWithErRequest 请求对象
     * @return AsyncInvoker<ListEcnWithErRequest, ListEcnWithErResponse>
     */
    public AsyncInvoker<ListEcnWithErRequest, ListEcnWithErResponse> listEcnWithErAsyncInvoker(
        ListEcnWithErRequest request) {
        return new AsyncInvoker<ListEcnWithErRequest, ListEcnWithErResponse>(request, EcMeta.listEcnWithEr, hcClient);
    }

    /**
     * 修改IEG设备admin账户密码
     *
     * 修改IEG设备admin账户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeIegPasswordRequest 请求对象
     * @return CompletableFuture<ChangeIegPasswordResponse>
     */
    public CompletableFuture<ChangeIegPasswordResponse> changeIegPasswordAsync(ChangeIegPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.changeIegPassword);
    }

    /**
     * 修改IEG设备admin账户密码
     *
     * 修改IEG设备admin账户密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeIegPasswordRequest 请求对象
     * @return AsyncInvoker<ChangeIegPasswordRequest, ChangeIegPasswordResponse>
     */
    public AsyncInvoker<ChangeIegPasswordRequest, ChangeIegPasswordResponse> changeIegPasswordAsyncInvoker(
        ChangeIegPasswordRequest request) {
        return new AsyncInvoker<ChangeIegPasswordRequest, ChangeIegPasswordResponse>(request, EcMeta.changeIegPassword,
            hcClient);
    }

    /**
     * 查询租户智能企业网关列表
     *
     * 查询租户智能企业网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIegRequest 请求对象
     * @return CompletableFuture<ListIegResponse>
     */
    public CompletableFuture<ListIegResponse> listIegAsync(ListIegRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.listIeg);
    }

    /**
     * 查询租户智能企业网关列表
     *
     * 查询租户智能企业网关列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListIegRequest 请求对象
     * @return AsyncInvoker<ListIegRequest, ListIegResponse>
     */
    public AsyncInvoker<ListIegRequest, ListIegResponse> listIegAsyncInvoker(ListIegRequest request) {
        return new AsyncInvoker<ListIegRequest, ListIegResponse>(request, EcMeta.listIeg, hcClient);
    }

    /**
     * 查询租户单个智能企业网关
     *
     * 根据智能企业网关ID，查询租户智能企业网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIegInfoRequest 请求对象
     * @return CompletableFuture<ShowIegInfoResponse>
     */
    public CompletableFuture<ShowIegInfoResponse> showIegInfoAsync(ShowIegInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.showIegInfo);
    }

    /**
     * 查询租户单个智能企业网关
     *
     * 根据智能企业网关ID，查询租户智能企业网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIegInfoRequest 请求对象
     * @return AsyncInvoker<ShowIegInfoRequest, ShowIegInfoResponse>
     */
    public AsyncInvoker<ShowIegInfoRequest, ShowIegInfoResponse> showIegInfoAsyncInvoker(ShowIegInfoRequest request) {
        return new AsyncInvoker<ShowIegInfoRequest, ShowIegInfoResponse>(request, EcMeta.showIegInfo, hcClient);
    }

    /**
     * 交换双机主备属性
     *
     * 交换双机主备属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchEquipmentHaTypeRequest 请求对象
     * @return CompletableFuture<SwitchEquipmentHaTypeResponse>
     */
    public CompletableFuture<SwitchEquipmentHaTypeResponse> switchEquipmentHaTypeAsync(
        SwitchEquipmentHaTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.switchEquipmentHaType);
    }

    /**
     * 交换双机主备属性
     *
     * 交换双机主备属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchEquipmentHaTypeRequest 请求对象
     * @return AsyncInvoker<SwitchEquipmentHaTypeRequest, SwitchEquipmentHaTypeResponse>
     */
    public AsyncInvoker<SwitchEquipmentHaTypeRequest, SwitchEquipmentHaTypeResponse> switchEquipmentHaTypeAsyncInvoker(
        SwitchEquipmentHaTypeRequest request) {
        return new AsyncInvoker<SwitchEquipmentHaTypeRequest, SwitchEquipmentHaTypeResponse>(request,
            EcMeta.switchEquipmentHaType, hcClient);
    }

    /**
     * 更新智能企业网关
     *
     * 根据智能企业网关ID，更新智能企业网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIegRequest 请求对象
     * @return CompletableFuture<UpdateIegResponse>
     */
    public CompletableFuture<UpdateIegResponse> updateIegAsync(UpdateIegRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.updateIeg);
    }

    /**
     * 更新智能企业网关
     *
     * 根据智能企业网关ID，更新智能企业网关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateIegRequest 请求对象
     * @return AsyncInvoker<UpdateIegRequest, UpdateIegResponse>
     */
    public AsyncInvoker<UpdateIegRequest, UpdateIegResponse> updateIegAsyncInvoker(UpdateIegRequest request) {
        return new AsyncInvoker<UpdateIegRequest, UpdateIegResponse>(request, EcMeta.updateIeg, hcClient);
    }

    /**
     * 查询EC相关的指定租户的配额
     *
     * 查询EC相关的指定租户的配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasInfoRequest 请求对象
     * @return CompletableFuture<ShowQuotasInfoResponse>
     */
    public CompletableFuture<ShowQuotasInfoResponse> showQuotasInfoAsync(ShowQuotasInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.showQuotasInfo);
    }

    /**
     * 查询EC相关的指定租户的配额
     *
     * 查询EC相关的指定租户的配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasInfoRequest 请求对象
     * @return AsyncInvoker<ShowQuotasInfoRequest, ShowQuotasInfoResponse>
     */
    public AsyncInvoker<ShowQuotasInfoRequest, ShowQuotasInfoResponse> showQuotasInfoAsyncInvoker(
        ShowQuotasInfoRequest request) {
        return new AsyncInvoker<ShowQuotasInfoRequest, ShowQuotasInfoResponse>(request, EcMeta.showQuotasInfo,
            hcClient);
    }

    /**
     * 创建vrrp配置
     *
     * 创建vrrp配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddVrrpConfigRequest 请求对象
     * @return CompletableFuture<AddVrrpConfigResponse>
     */
    public CompletableFuture<AddVrrpConfigResponse> addVrrpConfigAsync(AddVrrpConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.addVrrpConfig);
    }

    /**
     * 创建vrrp配置
     *
     * 创建vrrp配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddVrrpConfigRequest 请求对象
     * @return AsyncInvoker<AddVrrpConfigRequest, AddVrrpConfigResponse>
     */
    public AsyncInvoker<AddVrrpConfigRequest, AddVrrpConfigResponse> addVrrpConfigAsyncInvoker(
        AddVrrpConfigRequest request) {
        return new AsyncInvoker<AddVrrpConfigRequest, AddVrrpConfigResponse>(request, EcMeta.addVrrpConfig, hcClient);
    }

    /**
     * 删除vrrp配置
     *
     * 删除vrrp配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVrrpConfigRequest 请求对象
     * @return CompletableFuture<DeleteVrrpConfigResponse>
     */
    public CompletableFuture<DeleteVrrpConfigResponse> deleteVrrpConfigAsync(DeleteVrrpConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.deleteVrrpConfig);
    }

    /**
     * 删除vrrp配置
     *
     * 删除vrrp配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVrrpConfigRequest 请求对象
     * @return AsyncInvoker<DeleteVrrpConfigRequest, DeleteVrrpConfigResponse>
     */
    public AsyncInvoker<DeleteVrrpConfigRequest, DeleteVrrpConfigResponse> deleteVrrpConfigAsyncInvoker(
        DeleteVrrpConfigRequest request) {
        return new AsyncInvoker<DeleteVrrpConfigRequest, DeleteVrrpConfigResponse>(request, EcMeta.deleteVrrpConfig,
            hcClient);
    }

    /**
     * 查询vrrp配置列表
     *
     * 查询vrrp配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVrrpConfigRequest 请求对象
     * @return CompletableFuture<ShowVrrpConfigResponse>
     */
    public CompletableFuture<ShowVrrpConfigResponse> showVrrpConfigAsync(ShowVrrpConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.showVrrpConfig);
    }

    /**
     * 查询vrrp配置列表
     *
     * 查询vrrp配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVrrpConfigRequest 请求对象
     * @return AsyncInvoker<ShowVrrpConfigRequest, ShowVrrpConfigResponse>
     */
    public AsyncInvoker<ShowVrrpConfigRequest, ShowVrrpConfigResponse> showVrrpConfigAsyncInvoker(
        ShowVrrpConfigRequest request) {
        return new AsyncInvoker<ShowVrrpConfigRequest, ShowVrrpConfigResponse>(request, EcMeta.showVrrpConfig,
            hcClient);
    }

    /**
     * 更新vrrp配置
     *
     * 更新vrrp配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVrrpConfigRequest 请求对象
     * @return CompletableFuture<UpdateVrrpConfigResponse>
     */
    public CompletableFuture<UpdateVrrpConfigResponse> updateVrrpConfigAsync(UpdateVrrpConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, EcMeta.updateVrrpConfig);
    }

    /**
     * 更新vrrp配置
     *
     * 更新vrrp配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVrrpConfigRequest 请求对象
     * @return AsyncInvoker<UpdateVrrpConfigRequest, UpdateVrrpConfigResponse>
     */
    public AsyncInvoker<UpdateVrrpConfigRequest, UpdateVrrpConfigResponse> updateVrrpConfigAsyncInvoker(
        UpdateVrrpConfigRequest request) {
        return new AsyncInvoker<UpdateVrrpConfigRequest, UpdateVrrpConfigResponse>(request, EcMeta.updateVrrpConfig,
            hcClient);
    }

}
