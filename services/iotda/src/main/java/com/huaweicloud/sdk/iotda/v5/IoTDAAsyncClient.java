package com.huaweicloud.sdk.iotda.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.iotda.v5.model.AddApplicationRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddApplicationResponse;
import com.huaweicloud.sdk.iotda.v5.model.AddBridgeRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddBridgeResponse;
import com.huaweicloud.sdk.iotda.v5.model.AddCertificateRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddCertificateResponse;
import com.huaweicloud.sdk.iotda.v5.model.AddDeviceGroupRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddDeviceGroupResponse;
import com.huaweicloud.sdk.iotda.v5.model.AddDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.AddFunctionsRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddFunctionsResponse;
import com.huaweicloud.sdk.iotda.v5.model.AddQueueRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddQueueResponse;
import com.huaweicloud.sdk.iotda.v5.model.AddTunnelRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddTunnelResponse;
import com.huaweicloud.sdk.iotda.v5.model.BatchShowQueueRequest;
import com.huaweicloud.sdk.iotda.v5.model.BatchShowQueueResponse;
import com.huaweicloud.sdk.iotda.v5.model.BindDevicePolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.BindDevicePolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.BroadcastMessageRequest;
import com.huaweicloud.sdk.iotda.v5.model.BroadcastMessageResponse;
import com.huaweicloud.sdk.iotda.v5.model.ChangeGatewayRequest;
import com.huaweicloud.sdk.iotda.v5.model.ChangeGatewayResponse;
import com.huaweicloud.sdk.iotda.v5.model.ChangeRuleStatusRequest;
import com.huaweicloud.sdk.iotda.v5.model.ChangeRuleStatusResponse;
import com.huaweicloud.sdk.iotda.v5.model.CheckCertificateRequest;
import com.huaweicloud.sdk.iotda.v5.model.CheckCertificateResponse;
import com.huaweicloud.sdk.iotda.v5.model.CloseDeviceTunnelRequest;
import com.huaweicloud.sdk.iotda.v5.model.CloseDeviceTunnelResponse;
import com.huaweicloud.sdk.iotda.v5.model.CountAsyncHistoryCommandsRequest;
import com.huaweicloud.sdk.iotda.v5.model.CountAsyncHistoryCommandsResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateAccessCodeRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateAccessCodeResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateAsyncCommandRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateAsyncCommandResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateBatchTaskRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateBatchTaskResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateCommandRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateCommandResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateDeviceAuthorizerRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateDeviceAuthorizerResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateDevicePolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateDevicePolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateDeviceProxyRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateDeviceProxyResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateMessageRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateMessageResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateOrDeleteDeviceInGroupRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateOrDeleteDeviceInGroupResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateOtaPackageRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateOtaPackageResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateProductRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateProductResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateProvisioningTemplateRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateProvisioningTemplateResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateRoutingBacklogPolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateRoutingBacklogPolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateRoutingFlowControlPolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateRoutingFlowControlPolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateRoutingRuleRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateRoutingRuleResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateRuleActionRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateRuleActionResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateRuleRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateRuleResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteApplicationRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteApplicationResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteBatchTaskFileRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteBatchTaskFileResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteBatchTaskRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteBatchTaskResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteBridgeRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteBridgeResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteDeviceAuthorizerRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteDeviceAuthorizerResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteDeviceGroupRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteDeviceGroupResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteDeviceMessageRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteDeviceMessageResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteDevicePolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteDevicePolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteDeviceProxyRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteDeviceProxyResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteDeviceTunnelRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteDeviceTunnelResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteFunctionsRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteFunctionsResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteOtaPackageRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteOtaPackageResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteProductRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteProductResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteProvisioningTemplateRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteProvisioningTemplateResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteQueueRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteQueueResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteRoutingBacklogPolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteRoutingBacklogPolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteRoutingFlowControlPolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteRoutingFlowControlPolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteRoutingRuleRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteRoutingRuleResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteRuleActionRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteRuleActionResponse;
import com.huaweicloud.sdk.iotda.v5.model.DeleteRuleRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeleteRuleResponse;
import com.huaweicloud.sdk.iotda.v5.model.FreezeDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.FreezeDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListAsyncCommandsRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListAsyncCommandsResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListAsyncHistoryCommandsRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListAsyncHistoryCommandsResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListBatchTaskFilesRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListBatchTaskFilesResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListBatchTasksRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListBatchTasksResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListBridgesRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListBridgesResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListCertificatesRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListCertificatesResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListDeviceAuthorizersRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListDeviceAuthorizersResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListDeviceGroupsByDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListDeviceGroupsByDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListDeviceGroupsRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListDeviceGroupsResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListDeviceMessagesRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListDeviceMessagesResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListDevicePoliciesRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListDevicePoliciesResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListDeviceProxiesRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListDeviceProxiesResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListDeviceTunnelsRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListDeviceTunnelsResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListDevicesRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListDevicesResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListFunctionsRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListFunctionsResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListOtaPackageInfoRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListOtaPackageInfoResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListProductsRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListProductsResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListPropertiesRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListPropertiesResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListProvisioningTemplatesRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListProvisioningTemplatesResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListResourcesByTagsRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListResourcesByTagsResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListRoutingBacklogPolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListRoutingBacklogPolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListRoutingFlowControlPolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListRoutingFlowControlPolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListRoutingRulesRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListRoutingRulesResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListRuleActionsRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListRuleActionsResponse;
import com.huaweicloud.sdk.iotda.v5.model.ListRulesRequest;
import com.huaweicloud.sdk.iotda.v5.model.ListRulesResponse;
import com.huaweicloud.sdk.iotda.v5.model.ResetBridgeSecretRequest;
import com.huaweicloud.sdk.iotda.v5.model.ResetBridgeSecretResponse;
import com.huaweicloud.sdk.iotda.v5.model.ResetDeviceSecretRequest;
import com.huaweicloud.sdk.iotda.v5.model.ResetDeviceSecretResponse;
import com.huaweicloud.sdk.iotda.v5.model.ResetFingerprintRequest;
import com.huaweicloud.sdk.iotda.v5.model.ResetFingerprintResponse;
import com.huaweicloud.sdk.iotda.v5.model.RetryBatchTaskRequest;
import com.huaweicloud.sdk.iotda.v5.model.RetryBatchTaskResponse;
import com.huaweicloud.sdk.iotda.v5.model.SearchDevicesRequest;
import com.huaweicloud.sdk.iotda.v5.model.SearchDevicesResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowApplicationRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowApplicationResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowApplicationsRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowApplicationsResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowAsyncDeviceCommandRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowAsyncDeviceCommandResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowBatchTaskRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowBatchTaskResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceAuthorizerRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceAuthorizerResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceGroupRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceGroupResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceMessageRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceMessageResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowDevicePolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowDevicePolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceProxyRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceProxyResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceShadowRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceShadowResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceTunnelRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowDeviceTunnelResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowDevicesInGroupRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowDevicesInGroupResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowOtaPackageRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowOtaPackageResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowProductRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowProductResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowProvisioningTemplateRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowProvisioningTemplateResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowQueueRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowQueueResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowRoutingBacklogPolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowRoutingBacklogPolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowRoutingFlowControlPolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowRoutingFlowControlPolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowRoutingRuleRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowRoutingRuleResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowRuleActionRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowRuleActionResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowRuleRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowRuleResponse;
import com.huaweicloud.sdk.iotda.v5.model.ShowTargetsInDevicePolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.ShowTargetsInDevicePolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.StopBatchTaskRequest;
import com.huaweicloud.sdk.iotda.v5.model.StopBatchTaskResponse;
import com.huaweicloud.sdk.iotda.v5.model.TagDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.TagDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.UnbindDevicePolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.UnbindDevicePolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.UnfreezeDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.UnfreezeDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.UntagDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.UntagDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateApplicationRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateApplicationResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateCertificateRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateCertificateResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceAuthorizerRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceAuthorizerResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceGroupRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceGroupResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDevicePolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDevicePolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceProxyRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceProxyResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceShadowDesiredDataRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceShadowDesiredDataResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateProductRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateProductResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdatePropertiesRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdatePropertiesResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateProvisioningTemplateRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateProvisioningTemplateResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateRoutingBacklogPolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateRoutingBacklogPolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateRoutingFlowControlPolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateRoutingFlowControlPolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateRoutingRuleRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateRoutingRuleResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateRuleActionRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateRuleActionResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateRuleRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateRuleResponse;
import com.huaweicloud.sdk.iotda.v5.model.UploadBatchTaskFileRequest;
import com.huaweicloud.sdk.iotda.v5.model.UploadBatchTaskFileResponse;

import java.util.concurrent.CompletableFuture;

public class IoTDAAsyncClient {

    protected HcClient hcClient;

    public IoTDAAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IoTDAAsyncClient> newBuilder() {
        ClientBuilder<IoTDAAsyncClient> clientBuilder =
            new ClientBuilder<>(IoTDAAsyncClient::new, "BasicCredentials,IoTDACredentials");
        clientBuilder.withDerivedAuthServiceName("iotdm");
        return clientBuilder;
    }

    /**
     * 生成接入凭证
     *
     * 接入凭证是用于客户端使用AMQP等协议与平台建链的一个认证凭据。只保留一条记录，如果重复调用只会重置接入凭证，使得之前的失效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessCodeRequest 请求对象
     * @return CompletableFuture<CreateAccessCodeResponse>
     */
    public CompletableFuture<CreateAccessCodeResponse> createAccessCodeAsync(CreateAccessCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createAccessCode);
    }

    /**
     * 生成接入凭证
     *
     * 接入凭证是用于客户端使用AMQP等协议与平台建链的一个认证凭据。只保留一条记录，如果重复调用只会重置接入凭证，使得之前的失效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessCodeRequest 请求对象
     * @return AsyncInvoker<CreateAccessCodeRequest, CreateAccessCodeResponse>
     */
    public AsyncInvoker<CreateAccessCodeRequest, CreateAccessCodeResponse> createAccessCodeAsyncInvoker(
        CreateAccessCodeRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.createAccessCode, hcClient);
    }

    /**
     * 创建AMQP队列
     *
     * 应用服务器可调用此接口在物联网平台创建一个AMQP队列。每个租户只能创建100个队列，若超过规格，则创建失败，若队列名称与已有的队列名称相同，则创建失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddQueueRequest 请求对象
     * @return CompletableFuture<AddQueueResponse>
     */
    public CompletableFuture<AddQueueResponse> addQueueAsync(AddQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.addQueue);
    }

    /**
     * 创建AMQP队列
     *
     * 应用服务器可调用此接口在物联网平台创建一个AMQP队列。每个租户只能创建100个队列，若超过规格，则创建失败，若队列名称与已有的队列名称相同，则创建失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddQueueRequest 请求对象
     * @return AsyncInvoker<AddQueueRequest, AddQueueResponse>
     */
    public AsyncInvoker<AddQueueRequest, AddQueueResponse> addQueueAsyncInvoker(AddQueueRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.addQueue, hcClient);
    }

    /**
     * 查询AMQP列表
     *
     * 应用服务器可调用此接口查询物联网平台中的AMQP队列信息列表。可通过队列名称作模糊查询，支持分页。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowQueueRequest 请求对象
     * @return CompletableFuture<BatchShowQueueResponse>
     */
    public CompletableFuture<BatchShowQueueResponse> batchShowQueueAsync(BatchShowQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.batchShowQueue);
    }

    /**
     * 查询AMQP列表
     *
     * 应用服务器可调用此接口查询物联网平台中的AMQP队列信息列表。可通过队列名称作模糊查询，支持分页。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowQueueRequest 请求对象
     * @return AsyncInvoker<BatchShowQueueRequest, BatchShowQueueResponse>
     */
    public AsyncInvoker<BatchShowQueueRequest, BatchShowQueueResponse> batchShowQueueAsyncInvoker(
        BatchShowQueueRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.batchShowQueue, hcClient);
    }

    /**
     * 删除AMQP队列
     *
     * 应用服务器可调用此接口在物联网平台上删除指定AMQP队列。若当前队列正在使用，则会删除失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteQueueRequest 请求对象
     * @return CompletableFuture<DeleteQueueResponse>
     */
    public CompletableFuture<DeleteQueueResponse> deleteQueueAsync(DeleteQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteQueue);
    }

    /**
     * 删除AMQP队列
     *
     * 应用服务器可调用此接口在物联网平台上删除指定AMQP队列。若当前队列正在使用，则会删除失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteQueueRequest 请求对象
     * @return AsyncInvoker<DeleteQueueRequest, DeleteQueueResponse>
     */
    public AsyncInvoker<DeleteQueueRequest, DeleteQueueResponse> deleteQueueAsyncInvoker(DeleteQueueRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteQueue, hcClient);
    }

    /**
     * 查询单个AMQP队列
     *
     * 应用服务器可调用此接口查询物联网平台中指定队列的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQueueRequest 请求对象
     * @return CompletableFuture<ShowQueueResponse>
     */
    public CompletableFuture<ShowQueueResponse> showQueueAsync(ShowQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showQueue);
    }

    /**
     * 查询单个AMQP队列
     *
     * 应用服务器可调用此接口查询物联网平台中指定队列的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQueueRequest 请求对象
     * @return AsyncInvoker<ShowQueueRequest, ShowQueueResponse>
     */
    public AsyncInvoker<ShowQueueRequest, ShowQueueResponse> showQueueAsyncInvoker(ShowQueueRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showQueue, hcClient);
    }

    /**
     * 创建资源空间
     *
     * 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口创建资源空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddApplicationRequest 请求对象
     * @return CompletableFuture<AddApplicationResponse>
     */
    public CompletableFuture<AddApplicationResponse> addApplicationAsync(AddApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.addApplication);
    }

    /**
     * 创建资源空间
     *
     * 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口创建资源空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddApplicationRequest 请求对象
     * @return AsyncInvoker<AddApplicationRequest, AddApplicationResponse>
     */
    public AsyncInvoker<AddApplicationRequest, AddApplicationResponse> addApplicationAsyncInvoker(
        AddApplicationRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.addApplication, hcClient);
    }

    /**
     * 删除资源空间
     *
     * 删除指定资源空间。删除资源空间属于高危操作，删除资源空间后，该空间下的产品、设备等资源将不可用，请谨慎操作！
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
     * @return CompletableFuture<DeleteApplicationResponse>
     */
    public CompletableFuture<DeleteApplicationResponse> deleteApplicationAsync(DeleteApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteApplication);
    }

    /**
     * 删除资源空间
     *
     * 删除指定资源空间。删除资源空间属于高危操作，删除资源空间后，该空间下的产品、设备等资源将不可用，请谨慎操作！
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApplicationRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>
     */
    public AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationAsyncInvoker(
        DeleteApplicationRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteApplication, hcClient);
    }

    /**
     * 查询资源空间
     *
     * 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口查询指定资源空间详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicationRequest 请求对象
     * @return CompletableFuture<ShowApplicationResponse>
     */
    public CompletableFuture<ShowApplicationResponse> showApplicationAsync(ShowApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showApplication);
    }

    /**
     * 查询资源空间
     *
     * 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口查询指定资源空间详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicationRequest 请求对象
     * @return AsyncInvoker<ShowApplicationRequest, ShowApplicationResponse>
     */
    public AsyncInvoker<ShowApplicationRequest, ShowApplicationResponse> showApplicationAsyncInvoker(
        ShowApplicationRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showApplication, hcClient);
    }

    /**
     * 查询资源空间列表
     *
     * 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口查询资源空间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicationsRequest 请求对象
     * @return CompletableFuture<ShowApplicationsResponse>
     */
    public CompletableFuture<ShowApplicationsResponse> showApplicationsAsync(ShowApplicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showApplications);
    }

    /**
     * 查询资源空间列表
     *
     * 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口查询资源空间列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicationsRequest 请求对象
     * @return AsyncInvoker<ShowApplicationsRequest, ShowApplicationsResponse>
     */
    public AsyncInvoker<ShowApplicationsRequest, ShowApplicationsResponse> showApplicationsAsyncInvoker(
        ShowApplicationsRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showApplications, hcClient);
    }

    /**
     * 更新资源空间
     *
     * 应用服务器可以调用此接口更新资源空间的名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationRequest 请求对象
     * @return CompletableFuture<UpdateApplicationResponse>
     */
    public CompletableFuture<UpdateApplicationResponse> updateApplicationAsync(UpdateApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateApplication);
    }

    /**
     * 更新资源空间
     *
     * 应用服务器可以调用此接口更新资源空间的名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApplicationRequest 请求对象
     * @return AsyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse>
     */
    public AsyncInvoker<UpdateApplicationRequest, UpdateApplicationResponse> updateApplicationAsyncInvoker(
        UpdateApplicationRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.updateApplication, hcClient);
    }

    /**
     * 统计设备下的历史命令总数
     *
     * 统计设备下的历史命令总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountAsyncHistoryCommandsRequest 请求对象
     * @return CompletableFuture<CountAsyncHistoryCommandsResponse>
     */
    public CompletableFuture<CountAsyncHistoryCommandsResponse> countAsyncHistoryCommandsAsync(
        CountAsyncHistoryCommandsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.countAsyncHistoryCommands);
    }

    /**
     * 统计设备下的历史命令总数
     *
     * 统计设备下的历史命令总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountAsyncHistoryCommandsRequest 请求对象
     * @return AsyncInvoker<CountAsyncHistoryCommandsRequest, CountAsyncHistoryCommandsResponse>
     */
    public AsyncInvoker<CountAsyncHistoryCommandsRequest, CountAsyncHistoryCommandsResponse> countAsyncHistoryCommandsAsyncInvoker(
        CountAsyncHistoryCommandsRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.countAsyncHistoryCommands, hcClient);
    }

    /**
     * 下发异步设备命令
     *
     * 设备的产品模型中定义了物联网平台可向设备下发的命令，应用服务器可调用此接口向指定设备下发异步命令，以实现对设备的控制。平台负责将命令发送给设备，并将设备执行命令结果异步通知应用服务器。 命令执行结果支持灵活的数据流转，应用服务器通过调用物联网平台的创建规则触发条件（Resource:device.command.status，Event:update）、创建规则动作并激活规则后，当命令状态变更时，物联网平台会根据规则将结果发送到规则指定的服务器，如用户自定义的HTTP服务器，AMQP服务器，以及华为云的其他储存服务器等, 详情参考[[设备命令状态变更通知](https://support.huaweicloud.com/api-iothub/iot_06_v5_01212.html)](tag:hws)[[设备命令状态变更通知](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_01212.html)](tag:hws_hk)。
     * 注意：
     * - 此接口适用于NB设备异步命令下发，暂不支持其他协议类型设备命令下发。
     * - 此接口仅支持单个设备异步命令下发，如需多个设备异步命令下发，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAsyncCommandRequest 请求对象
     * @return CompletableFuture<CreateAsyncCommandResponse>
     */
    public CompletableFuture<CreateAsyncCommandResponse> createAsyncCommandAsync(CreateAsyncCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createAsyncCommand);
    }

    /**
     * 下发异步设备命令
     *
     * 设备的产品模型中定义了物联网平台可向设备下发的命令，应用服务器可调用此接口向指定设备下发异步命令，以实现对设备的控制。平台负责将命令发送给设备，并将设备执行命令结果异步通知应用服务器。 命令执行结果支持灵活的数据流转，应用服务器通过调用物联网平台的创建规则触发条件（Resource:device.command.status，Event:update）、创建规则动作并激活规则后，当命令状态变更时，物联网平台会根据规则将结果发送到规则指定的服务器，如用户自定义的HTTP服务器，AMQP服务器，以及华为云的其他储存服务器等, 详情参考[[设备命令状态变更通知](https://support.huaweicloud.com/api-iothub/iot_06_v5_01212.html)](tag:hws)[[设备命令状态变更通知](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_01212.html)](tag:hws_hk)。
     * 注意：
     * - 此接口适用于NB设备异步命令下发，暂不支持其他协议类型设备命令下发。
     * - 此接口仅支持单个设备异步命令下发，如需多个设备异步命令下发，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAsyncCommandRequest 请求对象
     * @return AsyncInvoker<CreateAsyncCommandRequest, CreateAsyncCommandResponse>
     */
    public AsyncInvoker<CreateAsyncCommandRequest, CreateAsyncCommandResponse> createAsyncCommandAsyncInvoker(
        CreateAsyncCommandRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.createAsyncCommand, hcClient);
    }

    /**
     * 查询设备下队列中的命令
     *
     * 查询设备下队列中的命令（处理中的命令），包含PENDING、SENT、DELIVERED三种状态，注意：DELIVERED状态的命令经过系统设定的一段时间（具体以系统配置为准）仍然没有更新，就会从队列中移除，变为历史命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAsyncCommandsRequest 请求对象
     * @return CompletableFuture<ListAsyncCommandsResponse>
     */
    public CompletableFuture<ListAsyncCommandsResponse> listAsyncCommandsAsync(ListAsyncCommandsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listAsyncCommands);
    }

    /**
     * 查询设备下队列中的命令
     *
     * 查询设备下队列中的命令（处理中的命令），包含PENDING、SENT、DELIVERED三种状态，注意：DELIVERED状态的命令经过系统设定的一段时间（具体以系统配置为准）仍然没有更新，就会从队列中移除，变为历史命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAsyncCommandsRequest 请求对象
     * @return AsyncInvoker<ListAsyncCommandsRequest, ListAsyncCommandsResponse>
     */
    public AsyncInvoker<ListAsyncCommandsRequest, ListAsyncCommandsResponse> listAsyncCommandsAsyncInvoker(
        ListAsyncCommandsRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listAsyncCommands, hcClient);
    }

    /**
     * 查询设备下的历史命令
     *
     * 查询设备下发的历史异步命令，包含EXPIRED、SUCCESSFUL、FAILED、TIMEOUT、DELIVERED五种状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAsyncHistoryCommandsRequest 请求对象
     * @return CompletableFuture<ListAsyncHistoryCommandsResponse>
     */
    public CompletableFuture<ListAsyncHistoryCommandsResponse> listAsyncHistoryCommandsAsync(
        ListAsyncHistoryCommandsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listAsyncHistoryCommands);
    }

    /**
     * 查询设备下的历史命令
     *
     * 查询设备下发的历史异步命令，包含EXPIRED、SUCCESSFUL、FAILED、TIMEOUT、DELIVERED五种状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAsyncHistoryCommandsRequest 请求对象
     * @return AsyncInvoker<ListAsyncHistoryCommandsRequest, ListAsyncHistoryCommandsResponse>
     */
    public AsyncInvoker<ListAsyncHistoryCommandsRequest, ListAsyncHistoryCommandsResponse> listAsyncHistoryCommandsAsyncInvoker(
        ListAsyncHistoryCommandsRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listAsyncHistoryCommands, hcClient);
    }

    /**
     * 查询指定id的命令
     *
     * 物联网平台可查询指定id的命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAsyncDeviceCommandRequest 请求对象
     * @return CompletableFuture<ShowAsyncDeviceCommandResponse>
     */
    public CompletableFuture<ShowAsyncDeviceCommandResponse> showAsyncDeviceCommandAsync(
        ShowAsyncDeviceCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showAsyncDeviceCommand);
    }

    /**
     * 查询指定id的命令
     *
     * 物联网平台可查询指定id的命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAsyncDeviceCommandRequest 请求对象
     * @return AsyncInvoker<ShowAsyncDeviceCommandRequest, ShowAsyncDeviceCommandResponse>
     */
    public AsyncInvoker<ShowAsyncDeviceCommandRequest, ShowAsyncDeviceCommandResponse> showAsyncDeviceCommandAsyncInvoker(
        ShowAsyncDeviceCommandRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showAsyncDeviceCommand, hcClient);
    }

    /**
     * 新建数据流转积压策略
     *
     * 应用服务器可调用此接口在物联网平台创建数据流转积压策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRoutingBacklogPolicyRequest 请求对象
     * @return CompletableFuture<CreateRoutingBacklogPolicyResponse>
     */
    public CompletableFuture<CreateRoutingBacklogPolicyResponse> createRoutingBacklogPolicyAsync(
        CreateRoutingBacklogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createRoutingBacklogPolicy);
    }

    /**
     * 新建数据流转积压策略
     *
     * 应用服务器可调用此接口在物联网平台创建数据流转积压策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRoutingBacklogPolicyRequest 请求对象
     * @return AsyncInvoker<CreateRoutingBacklogPolicyRequest, CreateRoutingBacklogPolicyResponse>
     */
    public AsyncInvoker<CreateRoutingBacklogPolicyRequest, CreateRoutingBacklogPolicyResponse> createRoutingBacklogPolicyAsyncInvoker(
        CreateRoutingBacklogPolicyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.createRoutingBacklogPolicy, hcClient);
    }

    /**
     * 删除数据流转积压策略
     *
     * 应用服务器可调用此接口在物联网平台删除指定数据流转积压策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRoutingBacklogPolicyRequest 请求对象
     * @return CompletableFuture<DeleteRoutingBacklogPolicyResponse>
     */
    public CompletableFuture<DeleteRoutingBacklogPolicyResponse> deleteRoutingBacklogPolicyAsync(
        DeleteRoutingBacklogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteRoutingBacklogPolicy);
    }

    /**
     * 删除数据流转积压策略
     *
     * 应用服务器可调用此接口在物联网平台删除指定数据流转积压策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRoutingBacklogPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteRoutingBacklogPolicyRequest, DeleteRoutingBacklogPolicyResponse>
     */
    public AsyncInvoker<DeleteRoutingBacklogPolicyRequest, DeleteRoutingBacklogPolicyResponse> deleteRoutingBacklogPolicyAsyncInvoker(
        DeleteRoutingBacklogPolicyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteRoutingBacklogPolicy, hcClient);
    }

    /**
     * 查询数据流转积压策略列表
     *
     * 应用服务器可调用此接口查询在物联网平台设置的数据流转积压策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRoutingBacklogPolicyRequest 请求对象
     * @return CompletableFuture<ListRoutingBacklogPolicyResponse>
     */
    public CompletableFuture<ListRoutingBacklogPolicyResponse> listRoutingBacklogPolicyAsync(
        ListRoutingBacklogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listRoutingBacklogPolicy);
    }

    /**
     * 查询数据流转积压策略列表
     *
     * 应用服务器可调用此接口查询在物联网平台设置的数据流转积压策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRoutingBacklogPolicyRequest 请求对象
     * @return AsyncInvoker<ListRoutingBacklogPolicyRequest, ListRoutingBacklogPolicyResponse>
     */
    public AsyncInvoker<ListRoutingBacklogPolicyRequest, ListRoutingBacklogPolicyResponse> listRoutingBacklogPolicyAsyncInvoker(
        ListRoutingBacklogPolicyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listRoutingBacklogPolicy, hcClient);
    }

    /**
     * 查询数据流转积压策略
     *
     * 应用服务器可调用此接口在物联网平台查询指定数据流转积压策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRoutingBacklogPolicyRequest 请求对象
     * @return CompletableFuture<ShowRoutingBacklogPolicyResponse>
     */
    public CompletableFuture<ShowRoutingBacklogPolicyResponse> showRoutingBacklogPolicyAsync(
        ShowRoutingBacklogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showRoutingBacklogPolicy);
    }

    /**
     * 查询数据流转积压策略
     *
     * 应用服务器可调用此接口在物联网平台查询指定数据流转积压策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRoutingBacklogPolicyRequest 请求对象
     * @return AsyncInvoker<ShowRoutingBacklogPolicyRequest, ShowRoutingBacklogPolicyResponse>
     */
    public AsyncInvoker<ShowRoutingBacklogPolicyRequest, ShowRoutingBacklogPolicyResponse> showRoutingBacklogPolicyAsyncInvoker(
        ShowRoutingBacklogPolicyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showRoutingBacklogPolicy, hcClient);
    }

    /**
     * 修改数据流转积压策略
     *
     * 应用服务器可调用此接口在物联网平台修改指定数据流转积压策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRoutingBacklogPolicyRequest 请求对象
     * @return CompletableFuture<UpdateRoutingBacklogPolicyResponse>
     */
    public CompletableFuture<UpdateRoutingBacklogPolicyResponse> updateRoutingBacklogPolicyAsync(
        UpdateRoutingBacklogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateRoutingBacklogPolicy);
    }

    /**
     * 修改数据流转积压策略
     *
     * 应用服务器可调用此接口在物联网平台修改指定数据流转积压策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRoutingBacklogPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateRoutingBacklogPolicyRequest, UpdateRoutingBacklogPolicyResponse>
     */
    public AsyncInvoker<UpdateRoutingBacklogPolicyRequest, UpdateRoutingBacklogPolicyResponse> updateRoutingBacklogPolicyAsyncInvoker(
        UpdateRoutingBacklogPolicyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.updateRoutingBacklogPolicy, hcClient);
    }

    /**
     * 创建批量任务
     *
     * 应用服务器可调用此接口为创建批量处理任务，对多个设备进行批量操作。当前支持批量软固件升级、批量创建设备、批量删除设备、批量冻结设备、批量解冻设备、批量创建命令、批量创建消息任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBatchTaskRequest 请求对象
     * @return CompletableFuture<CreateBatchTaskResponse>
     */
    public CompletableFuture<CreateBatchTaskResponse> createBatchTaskAsync(CreateBatchTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createBatchTask);
    }

    /**
     * 创建批量任务
     *
     * 应用服务器可调用此接口为创建批量处理任务，对多个设备进行批量操作。当前支持批量软固件升级、批量创建设备、批量删除设备、批量冻结设备、批量解冻设备、批量创建命令、批量创建消息任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBatchTaskRequest 请求对象
     * @return AsyncInvoker<CreateBatchTaskRequest, CreateBatchTaskResponse>
     */
    public AsyncInvoker<CreateBatchTaskRequest, CreateBatchTaskResponse> createBatchTaskAsyncInvoker(
        CreateBatchTaskRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.createBatchTask, hcClient);
    }

    /**
     * 删除批量任务
     *
     * 应用服务器可调用此接口删除物联网平台中已经完成（状态为成功，失败，部分成功，已停止）的批量任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBatchTaskRequest 请求对象
     * @return CompletableFuture<DeleteBatchTaskResponse>
     */
    public CompletableFuture<DeleteBatchTaskResponse> deleteBatchTaskAsync(DeleteBatchTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteBatchTask);
    }

    /**
     * 删除批量任务
     *
     * 应用服务器可调用此接口删除物联网平台中已经完成（状态为成功，失败，部分成功，已停止）的批量任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBatchTaskRequest 请求对象
     * @return AsyncInvoker<DeleteBatchTaskRequest, DeleteBatchTaskResponse>
     */
    public AsyncInvoker<DeleteBatchTaskRequest, DeleteBatchTaskResponse> deleteBatchTaskAsyncInvoker(
        DeleteBatchTaskRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteBatchTask, hcClient);
    }

    /**
     * 查询批量任务列表
     *
     * 应用服务器可调用此接口查询物联网平台中批量任务列表，每一个任务又包括具体的任务内容、任务状态、任务完成情况统计等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBatchTasksRequest 请求对象
     * @return CompletableFuture<ListBatchTasksResponse>
     */
    public CompletableFuture<ListBatchTasksResponse> listBatchTasksAsync(ListBatchTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listBatchTasks);
    }

    /**
     * 查询批量任务列表
     *
     * 应用服务器可调用此接口查询物联网平台中批量任务列表，每一个任务又包括具体的任务内容、任务状态、任务完成情况统计等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBatchTasksRequest 请求对象
     * @return AsyncInvoker<ListBatchTasksRequest, ListBatchTasksResponse>
     */
    public AsyncInvoker<ListBatchTasksRequest, ListBatchTasksResponse> listBatchTasksAsyncInvoker(
        ListBatchTasksRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listBatchTasks, hcClient);
    }

    /**
     * 重试批量任务
     *
     * 应用服务器可调用此接口重试批量任务，目前只支持task_type为firmwareUpgrade，softwareUpgrade。如果task_id对应任务已经成功、停止、正在停止、等待中或初始化中，则不可以调用该接口。如果请求Body为{}，则调用该接口后会重新执行所有状态为失败、失败待重试和已停止的子任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryBatchTaskRequest 请求对象
     * @return CompletableFuture<RetryBatchTaskResponse>
     */
    public CompletableFuture<RetryBatchTaskResponse> retryBatchTaskAsync(RetryBatchTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.retryBatchTask);
    }

    /**
     * 重试批量任务
     *
     * 应用服务器可调用此接口重试批量任务，目前只支持task_type为firmwareUpgrade，softwareUpgrade。如果task_id对应任务已经成功、停止、正在停止、等待中或初始化中，则不可以调用该接口。如果请求Body为{}，则调用该接口后会重新执行所有状态为失败、失败待重试和已停止的子任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryBatchTaskRequest 请求对象
     * @return AsyncInvoker<RetryBatchTaskRequest, RetryBatchTaskResponse>
     */
    public AsyncInvoker<RetryBatchTaskRequest, RetryBatchTaskResponse> retryBatchTaskAsyncInvoker(
        RetryBatchTaskRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.retryBatchTask, hcClient);
    }

    /**
     * 查询批量任务
     *
     * 应用服务器可调用此接口查询物联网平台中指定批量任务的信息，包括任务内容、任务状态、任务完成情况统计以及子任务列表等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchTaskRequest 请求对象
     * @return CompletableFuture<ShowBatchTaskResponse>
     */
    public CompletableFuture<ShowBatchTaskResponse> showBatchTaskAsync(ShowBatchTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showBatchTask);
    }

    /**
     * 查询批量任务
     *
     * 应用服务器可调用此接口查询物联网平台中指定批量任务的信息，包括任务内容、任务状态、任务完成情况统计以及子任务列表等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchTaskRequest 请求对象
     * @return AsyncInvoker<ShowBatchTaskRequest, ShowBatchTaskResponse>
     */
    public AsyncInvoker<ShowBatchTaskRequest, ShowBatchTaskResponse> showBatchTaskAsyncInvoker(
        ShowBatchTaskRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showBatchTask, hcClient);
    }

    /**
     * 停止批量任务
     *
     * 应用服务器可调用此接口停止批量任务，目前只支持task_type为firmwareUpgrade，softwareUpgrade。如果task_id对应任务已经完成（成功、失败、部分成功，已经停止）或正在停止中，则不可以调用该接口。如果请求Body为{}，则调用该接口后会停止所有正在执行中、等待中和失败待重试状态的子任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBatchTaskRequest 请求对象
     * @return CompletableFuture<StopBatchTaskResponse>
     */
    public CompletableFuture<StopBatchTaskResponse> stopBatchTaskAsync(StopBatchTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.stopBatchTask);
    }

    /**
     * 停止批量任务
     *
     * 应用服务器可调用此接口停止批量任务，目前只支持task_type为firmwareUpgrade，softwareUpgrade。如果task_id对应任务已经完成（成功、失败、部分成功，已经停止）或正在停止中，则不可以调用该接口。如果请求Body为{}，则调用该接口后会停止所有正在执行中、等待中和失败待重试状态的子任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBatchTaskRequest 请求对象
     * @return AsyncInvoker<StopBatchTaskRequest, StopBatchTaskResponse>
     */
    public AsyncInvoker<StopBatchTaskRequest, StopBatchTaskResponse> stopBatchTaskAsyncInvoker(
        StopBatchTaskRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.stopBatchTask, hcClient);
    }

    /**
     * 删除批量任务文件
     *
     * 应用服务器可调用此接口删除批量任务文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBatchTaskFileRequest 请求对象
     * @return CompletableFuture<DeleteBatchTaskFileResponse>
     */
    public CompletableFuture<DeleteBatchTaskFileResponse> deleteBatchTaskFileAsync(DeleteBatchTaskFileRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteBatchTaskFile);
    }

    /**
     * 删除批量任务文件
     *
     * 应用服务器可调用此接口删除批量任务文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBatchTaskFileRequest 请求对象
     * @return AsyncInvoker<DeleteBatchTaskFileRequest, DeleteBatchTaskFileResponse>
     */
    public AsyncInvoker<DeleteBatchTaskFileRequest, DeleteBatchTaskFileResponse> deleteBatchTaskFileAsyncInvoker(
        DeleteBatchTaskFileRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteBatchTaskFile, hcClient);
    }

    /**
     * 查询批量任务文件列表
     *
     * 应用服务器可调用此接口查询批量任务文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBatchTaskFilesRequest 请求对象
     * @return CompletableFuture<ListBatchTaskFilesResponse>
     */
    public CompletableFuture<ListBatchTaskFilesResponse> listBatchTaskFilesAsync(ListBatchTaskFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listBatchTaskFiles);
    }

    /**
     * 查询批量任务文件列表
     *
     * 应用服务器可调用此接口查询批量任务文件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBatchTaskFilesRequest 请求对象
     * @return AsyncInvoker<ListBatchTaskFilesRequest, ListBatchTaskFilesResponse>
     */
    public AsyncInvoker<ListBatchTaskFilesRequest, ListBatchTaskFilesResponse> listBatchTaskFilesAsyncInvoker(
        ListBatchTaskFilesRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listBatchTaskFiles, hcClient);
    }

    /**
     * 上传批量任务文件
     *
     * 应用服务器可调用此接口上传批量任务文件，用于创建批量任务。当前支持批量创建设备任务、批量删除设备任务、批量冻结设备任务、批量解冻设备任务的文件上传。
     * - [批量注册设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchCreateDevices_Template.xlsx)
     * 
     * 
     * - [批量删除设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchDeleteDevices_Template.xlsx)
     * 
     * 
     * - [批量冻结设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchFreezeDevices_Template.xlsx)
     * 
     * 
     * - [批量解冻设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchUnfreezeDevices_Template.xlsx)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadBatchTaskFileRequest 请求对象
     * @return CompletableFuture<UploadBatchTaskFileResponse>
     */
    public CompletableFuture<UploadBatchTaskFileResponse> uploadBatchTaskFileAsync(UploadBatchTaskFileRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.uploadBatchTaskFile);
    }

    /**
     * 上传批量任务文件
     *
     * 应用服务器可调用此接口上传批量任务文件，用于创建批量任务。当前支持批量创建设备任务、批量删除设备任务、批量冻结设备任务、批量解冻设备任务的文件上传。
     * - [批量注册设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchCreateDevices_Template.xlsx)
     * 
     * 
     * - [批量删除设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchDeleteDevices_Template.xlsx)
     * 
     * 
     * - [批量冻结设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchFreezeDevices_Template.xlsx)
     * 
     * 
     * - [批量解冻设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchUnfreezeDevices_Template.xlsx)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadBatchTaskFileRequest 请求对象
     * @return AsyncInvoker<UploadBatchTaskFileRequest, UploadBatchTaskFileResponse>
     */
    public AsyncInvoker<UploadBatchTaskFileRequest, UploadBatchTaskFileResponse> uploadBatchTaskFileAsyncInvoker(
        UploadBatchTaskFileRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.uploadBatchTaskFile, hcClient);
    }

    /**
     * 创建网桥
     *
     * 应用服务器可调用此接口在物联网平台创建一个网桥，仅在创建后的网桥才可以接入物联网平台。
     * - 一个实例最多支持20个网桥。
     * - 仅**标准版实例、企业版实例**支持该接口调用，基础版不支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddBridgeRequest 请求对象
     * @return CompletableFuture<AddBridgeResponse>
     */
    public CompletableFuture<AddBridgeResponse> addBridgeAsync(AddBridgeRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.addBridge);
    }

    /**
     * 创建网桥
     *
     * 应用服务器可调用此接口在物联网平台创建一个网桥，仅在创建后的网桥才可以接入物联网平台。
     * - 一个实例最多支持20个网桥。
     * - 仅**标准版实例、企业版实例**支持该接口调用，基础版不支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddBridgeRequest 请求对象
     * @return AsyncInvoker<AddBridgeRequest, AddBridgeResponse>
     */
    public AsyncInvoker<AddBridgeRequest, AddBridgeResponse> addBridgeAsyncInvoker(AddBridgeRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.addBridge, hcClient);
    }

    /**
     * 删除网桥
     *
     * 应用服务器可调用此接口在物联网平台上删除指定网桥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBridgeRequest 请求对象
     * @return CompletableFuture<DeleteBridgeResponse>
     */
    public CompletableFuture<DeleteBridgeResponse> deleteBridgeAsync(DeleteBridgeRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteBridge);
    }

    /**
     * 删除网桥
     *
     * 应用服务器可调用此接口在物联网平台上删除指定网桥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBridgeRequest 请求对象
     * @return AsyncInvoker<DeleteBridgeRequest, DeleteBridgeResponse>
     */
    public AsyncInvoker<DeleteBridgeRequest, DeleteBridgeResponse> deleteBridgeAsyncInvoker(
        DeleteBridgeRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteBridge, hcClient);
    }

    /**
     * 查询网桥列表
     *
     * 应用服务器可调用此接口在物联网平台查询网桥列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBridgesRequest 请求对象
     * @return CompletableFuture<ListBridgesResponse>
     */
    public CompletableFuture<ListBridgesResponse> listBridgesAsync(ListBridgesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listBridges);
    }

    /**
     * 查询网桥列表
     *
     * 应用服务器可调用此接口在物联网平台查询网桥列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBridgesRequest 请求对象
     * @return AsyncInvoker<ListBridgesRequest, ListBridgesResponse>
     */
    public AsyncInvoker<ListBridgesRequest, ListBridgesResponse> listBridgesAsyncInvoker(ListBridgesRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listBridges, hcClient);
    }

    /**
     * 重置网桥密钥
     *
     * 应用服务器可调用此接口在物联网平台上重置网桥密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetBridgeSecretRequest 请求对象
     * @return CompletableFuture<ResetBridgeSecretResponse>
     */
    public CompletableFuture<ResetBridgeSecretResponse> resetBridgeSecretAsync(ResetBridgeSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.resetBridgeSecret);
    }

    /**
     * 重置网桥密钥
     *
     * 应用服务器可调用此接口在物联网平台上重置网桥密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetBridgeSecretRequest 请求对象
     * @return AsyncInvoker<ResetBridgeSecretRequest, ResetBridgeSecretResponse>
     */
    public AsyncInvoker<ResetBridgeSecretRequest, ResetBridgeSecretResponse> resetBridgeSecretAsyncInvoker(
        ResetBridgeSecretRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.resetBridgeSecret, hcClient);
    }

    /**
     * 下发广播消息
     *
     * 应用服务器可调用此接口向订阅了指定Topic的所有在线设备发布广播消息。应用将广播消息下发给平台后，平台会先返回应用响应结果，再将消息广播给设备。
     * 注意：
     * - 此接口只适用于使用MQTT协议接入的设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BroadcastMessageRequest 请求对象
     * @return CompletableFuture<BroadcastMessageResponse>
     */
    public CompletableFuture<BroadcastMessageResponse> broadcastMessageAsync(BroadcastMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.broadcastMessage);
    }

    /**
     * 下发广播消息
     *
     * 应用服务器可调用此接口向订阅了指定Topic的所有在线设备发布广播消息。应用将广播消息下发给平台后，平台会先返回应用响应结果，再将消息广播给设备。
     * 注意：
     * - 此接口只适用于使用MQTT协议接入的设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BroadcastMessageRequest 请求对象
     * @return AsyncInvoker<BroadcastMessageRequest, BroadcastMessageResponse>
     */
    public AsyncInvoker<BroadcastMessageRequest, BroadcastMessageResponse> broadcastMessageAsyncInvoker(
        BroadcastMessageRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.broadcastMessage, hcClient);
    }

    /**
     * 上传设备CA证书
     *
     * 应用服务器可调用此接口在物联网平台上传设备CA证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCertificateRequest 请求对象
     * @return CompletableFuture<AddCertificateResponse>
     */
    public CompletableFuture<AddCertificateResponse> addCertificateAsync(AddCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.addCertificate);
    }

    /**
     * 上传设备CA证书
     *
     * 应用服务器可调用此接口在物联网平台上传设备CA证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddCertificateRequest 请求对象
     * @return AsyncInvoker<AddCertificateRequest, AddCertificateResponse>
     */
    public AsyncInvoker<AddCertificateRequest, AddCertificateResponse> addCertificateAsyncInvoker(
        AddCertificateRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.addCertificate, hcClient);
    }

    /**
     * 验证设备CA证书
     *
     * 应用服务器可调用此接口在物联网平台验证设备的CA证书，目的是为了验证用户持有设备CA证书的私钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCertificateRequest 请求对象
     * @return CompletableFuture<CheckCertificateResponse>
     */
    public CompletableFuture<CheckCertificateResponse> checkCertificateAsync(CheckCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.checkCertificate);
    }

    /**
     * 验证设备CA证书
     *
     * 应用服务器可调用此接口在物联网平台验证设备的CA证书，目的是为了验证用户持有设备CA证书的私钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCertificateRequest 请求对象
     * @return AsyncInvoker<CheckCertificateRequest, CheckCertificateResponse>
     */
    public AsyncInvoker<CheckCertificateRequest, CheckCertificateResponse> checkCertificateAsyncInvoker(
        CheckCertificateRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.checkCertificate, hcClient);
    }

    /**
     * 删除设备CA证书
     *
     * 应用服务器可调用此接口在物联网平台删除设备CA证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateRequest 请求对象
     * @return CompletableFuture<DeleteCertificateResponse>
     */
    public CompletableFuture<DeleteCertificateResponse> deleteCertificateAsync(DeleteCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteCertificate);
    }

    /**
     * 删除设备CA证书
     *
     * 应用服务器可调用此接口在物联网平台删除设备CA证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateRequest 请求对象
     * @return AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateAsyncInvoker(
        DeleteCertificateRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteCertificate, hcClient);
    }

    /**
     * 获取设备CA证书列表
     *
     * 应用服务器可调用此接口在物联网平台获取设备CA证书列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesRequest 请求对象
     * @return CompletableFuture<ListCertificatesResponse>
     */
    public CompletableFuture<ListCertificatesResponse> listCertificatesAsync(ListCertificatesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listCertificates);
    }

    /**
     * 获取设备CA证书列表
     *
     * 应用服务器可调用此接口在物联网平台获取设备CA证书列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesRequest 请求对象
     * @return AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesAsyncInvoker(
        ListCertificatesRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listCertificates, hcClient);
    }

    /**
     * 更新CA证书
     *
     * 应用服务器可调用此接口在物联网平台上更新CA证书。仅标准版实例、企业版实例支持该接口调用，基础版不支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCertificateRequest 请求对象
     * @return CompletableFuture<UpdateCertificateResponse>
     */
    public CompletableFuture<UpdateCertificateResponse> updateCertificateAsync(UpdateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateCertificate);
    }

    /**
     * 更新CA证书
     *
     * 应用服务器可调用此接口在物联网平台上更新CA证书。仅标准版实例、企业版实例支持该接口调用，基础版不支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCertificateRequest 请求对象
     * @return AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>
     */
    public AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateAsyncInvoker(
        UpdateCertificateRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.updateCertificate, hcClient);
    }

    /**
     * 下发设备命令
     *
     * 设备的产品模型中定义了物联网平台可向设备下发的命令，应用服务器可调用此接口向指定设备下发命令，以实现对设备的同步控制。平台负责将命令以同步方式发送给设备，并将设备执行命令结果同步返回, 如果设备没有响应，平台会返回给应用服务器超时，平台超时时间是20秒。如果命令下发需要超过20秒，建议采用[[消息下发](https://support.huaweicloud.com/api-iothub/iot_06_v5_0059.html)](tag:hws)[[消息下发](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0059.html)](tag:hws_hk)。
     * 注意：
     * - 此接口适用于MQTT设备同步命令下发，暂不支持NB-IoT设备命令下发。
     * - 此接口仅支持单个设备同步命令下发，如需多个设备同步命令下发，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCommandRequest 请求对象
     * @return CompletableFuture<CreateCommandResponse>
     */
    public CompletableFuture<CreateCommandResponse> createCommandAsync(CreateCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createCommand);
    }

    /**
     * 下发设备命令
     *
     * 设备的产品模型中定义了物联网平台可向设备下发的命令，应用服务器可调用此接口向指定设备下发命令，以实现对设备的同步控制。平台负责将命令以同步方式发送给设备，并将设备执行命令结果同步返回, 如果设备没有响应，平台会返回给应用服务器超时，平台超时时间是20秒。如果命令下发需要超过20秒，建议采用[[消息下发](https://support.huaweicloud.com/api-iothub/iot_06_v5_0059.html)](tag:hws)[[消息下发](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0059.html)](tag:hws_hk)。
     * 注意：
     * - 此接口适用于MQTT设备同步命令下发，暂不支持NB-IoT设备命令下发。
     * - 此接口仅支持单个设备同步命令下发，如需多个设备同步命令下发，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCommandRequest 请求对象
     * @return AsyncInvoker<CreateCommandRequest, CreateCommandResponse>
     */
    public AsyncInvoker<CreateCommandRequest, CreateCommandResponse> createCommandAsyncInvoker(
        CreateCommandRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.createCommand, hcClient);
    }

    /**
     * 创建自定义鉴权
     *
     * 应用服务器可调用此接口在物联网平台创建一个自定义鉴权。自定义鉴权是指用户可以通过函数服务自定义实现鉴权逻辑，以对接入平台的设备进行身份认证。
     * - 单个实例最大可配置10个自定义鉴权
     * - 仅标准版实例、企业版实例支持该接口调用，基础版不支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeviceAuthorizerRequest 请求对象
     * @return CompletableFuture<CreateDeviceAuthorizerResponse>
     */
    public CompletableFuture<CreateDeviceAuthorizerResponse> createDeviceAuthorizerAsync(
        CreateDeviceAuthorizerRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createDeviceAuthorizer);
    }

    /**
     * 创建自定义鉴权
     *
     * 应用服务器可调用此接口在物联网平台创建一个自定义鉴权。自定义鉴权是指用户可以通过函数服务自定义实现鉴权逻辑，以对接入平台的设备进行身份认证。
     * - 单个实例最大可配置10个自定义鉴权
     * - 仅标准版实例、企业版实例支持该接口调用，基础版不支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeviceAuthorizerRequest 请求对象
     * @return AsyncInvoker<CreateDeviceAuthorizerRequest, CreateDeviceAuthorizerResponse>
     */
    public AsyncInvoker<CreateDeviceAuthorizerRequest, CreateDeviceAuthorizerResponse> createDeviceAuthorizerAsyncInvoker(
        CreateDeviceAuthorizerRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.createDeviceAuthorizer, hcClient);
    }

    /**
     * 删除自定义鉴权
     *
     * 应用服务器可调用此接口在物联网平台上删除指定自定义鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceAuthorizerRequest 请求对象
     * @return CompletableFuture<DeleteDeviceAuthorizerResponse>
     */
    public CompletableFuture<DeleteDeviceAuthorizerResponse> deleteDeviceAuthorizerAsync(
        DeleteDeviceAuthorizerRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteDeviceAuthorizer);
    }

    /**
     * 删除自定义鉴权
     *
     * 应用服务器可调用此接口在物联网平台上删除指定自定义鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceAuthorizerRequest 请求对象
     * @return AsyncInvoker<DeleteDeviceAuthorizerRequest, DeleteDeviceAuthorizerResponse>
     */
    public AsyncInvoker<DeleteDeviceAuthorizerRequest, DeleteDeviceAuthorizerResponse> deleteDeviceAuthorizerAsyncInvoker(
        DeleteDeviceAuthorizerRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteDeviceAuthorizer, hcClient);
    }

    /**
     * 查询自定义鉴权列表
     *
     * 应用服务器可调用此接口在物联网平台查询自定义鉴权列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeviceAuthorizersRequest 请求对象
     * @return CompletableFuture<ListDeviceAuthorizersResponse>
     */
    public CompletableFuture<ListDeviceAuthorizersResponse> listDeviceAuthorizersAsync(
        ListDeviceAuthorizersRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listDeviceAuthorizers);
    }

    /**
     * 查询自定义鉴权列表
     *
     * 应用服务器可调用此接口在物联网平台查询自定义鉴权列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeviceAuthorizersRequest 请求对象
     * @return AsyncInvoker<ListDeviceAuthorizersRequest, ListDeviceAuthorizersResponse>
     */
    public AsyncInvoker<ListDeviceAuthorizersRequest, ListDeviceAuthorizersResponse> listDeviceAuthorizersAsyncInvoker(
        ListDeviceAuthorizersRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listDeviceAuthorizers, hcClient);
    }

    /**
     * 查询自定义鉴权详情
     *
     * 应用服务器可调用此接口在物联网平台查询指定自定义鉴权ID的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceAuthorizerRequest 请求对象
     * @return CompletableFuture<ShowDeviceAuthorizerResponse>
     */
    public CompletableFuture<ShowDeviceAuthorizerResponse> showDeviceAuthorizerAsync(
        ShowDeviceAuthorizerRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showDeviceAuthorizer);
    }

    /**
     * 查询自定义鉴权详情
     *
     * 应用服务器可调用此接口在物联网平台查询指定自定义鉴权ID的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceAuthorizerRequest 请求对象
     * @return AsyncInvoker<ShowDeviceAuthorizerRequest, ShowDeviceAuthorizerResponse>
     */
    public AsyncInvoker<ShowDeviceAuthorizerRequest, ShowDeviceAuthorizerResponse> showDeviceAuthorizerAsyncInvoker(
        ShowDeviceAuthorizerRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showDeviceAuthorizer, hcClient);
    }

    /**
     * 更新指定id的自定义鉴权
     *
     * 应用服务器可调用此接口在物联网平台更新指定id的自定义鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceAuthorizerRequest 请求对象
     * @return CompletableFuture<UpdateDeviceAuthorizerResponse>
     */
    public CompletableFuture<UpdateDeviceAuthorizerResponse> updateDeviceAuthorizerAsync(
        UpdateDeviceAuthorizerRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateDeviceAuthorizer);
    }

    /**
     * 更新指定id的自定义鉴权
     *
     * 应用服务器可调用此接口在物联网平台更新指定id的自定义鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceAuthorizerRequest 请求对象
     * @return AsyncInvoker<UpdateDeviceAuthorizerRequest, UpdateDeviceAuthorizerResponse>
     */
    public AsyncInvoker<UpdateDeviceAuthorizerRequest, UpdateDeviceAuthorizerResponse> updateDeviceAuthorizerAsyncInvoker(
        UpdateDeviceAuthorizerRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.updateDeviceAuthorizer, hcClient);
    }

    /**
     * 添加设备组
     *
     * 应用服务器可调用此接口新建设备组，一个华为云账号下最多可有1,000个设备组，包括父设备组和子设备组。设备组的最大层级关系不超过5层，即群组形成的关系树最大深度不超过5。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDeviceGroupRequest 请求对象
     * @return CompletableFuture<AddDeviceGroupResponse>
     */
    public CompletableFuture<AddDeviceGroupResponse> addDeviceGroupAsync(AddDeviceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.addDeviceGroup);
    }

    /**
     * 添加设备组
     *
     * 应用服务器可调用此接口新建设备组，一个华为云账号下最多可有1,000个设备组，包括父设备组和子设备组。设备组的最大层级关系不超过5层，即群组形成的关系树最大深度不超过5。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDeviceGroupRequest 请求对象
     * @return AsyncInvoker<AddDeviceGroupRequest, AddDeviceGroupResponse>
     */
    public AsyncInvoker<AddDeviceGroupRequest, AddDeviceGroupResponse> addDeviceGroupAsyncInvoker(
        AddDeviceGroupRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.addDeviceGroup, hcClient);
    }

    /**
     * 管理设备组中的设备
     *
     * 应用服务器可调用此接口管理设备组中的设备。单个设备组内最多添加20,000个设备，一个设备最多可以被添加到10个设备组中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrDeleteDeviceInGroupRequest 请求对象
     * @return CompletableFuture<CreateOrDeleteDeviceInGroupResponse>
     */
    public CompletableFuture<CreateOrDeleteDeviceInGroupResponse> createOrDeleteDeviceInGroupAsync(
        CreateOrDeleteDeviceInGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createOrDeleteDeviceInGroup);
    }

    /**
     * 管理设备组中的设备
     *
     * 应用服务器可调用此接口管理设备组中的设备。单个设备组内最多添加20,000个设备，一个设备最多可以被添加到10个设备组中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrDeleteDeviceInGroupRequest 请求对象
     * @return AsyncInvoker<CreateOrDeleteDeviceInGroupRequest, CreateOrDeleteDeviceInGroupResponse>
     */
    public AsyncInvoker<CreateOrDeleteDeviceInGroupRequest, CreateOrDeleteDeviceInGroupResponse> createOrDeleteDeviceInGroupAsyncInvoker(
        CreateOrDeleteDeviceInGroupRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.createOrDeleteDeviceInGroup, hcClient);
    }

    /**
     * 删除设备组
     *
     * 应用服务器可调用此接口删除指定设备组，如果该设备组存在子设备组或者该设备组中存在设备，必须先删除子设备组并将设备从该设备组移除，才能删除该设备组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceGroupRequest 请求对象
     * @return CompletableFuture<DeleteDeviceGroupResponse>
     */
    public CompletableFuture<DeleteDeviceGroupResponse> deleteDeviceGroupAsync(DeleteDeviceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteDeviceGroup);
    }

    /**
     * 删除设备组
     *
     * 应用服务器可调用此接口删除指定设备组，如果该设备组存在子设备组或者该设备组中存在设备，必须先删除子设备组并将设备从该设备组移除，才能删除该设备组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceGroupRequest 请求对象
     * @return AsyncInvoker<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse>
     */
    public AsyncInvoker<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> deleteDeviceGroupAsyncInvoker(
        DeleteDeviceGroupRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteDeviceGroup, hcClient);
    }

    /**
     * 查询设备组列表
     *
     * 应用服务器可调用此接口查询物联网平台中的设备组信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeviceGroupsRequest 请求对象
     * @return CompletableFuture<ListDeviceGroupsResponse>
     */
    public CompletableFuture<ListDeviceGroupsResponse> listDeviceGroupsAsync(ListDeviceGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listDeviceGroups);
    }

    /**
     * 查询设备组列表
     *
     * 应用服务器可调用此接口查询物联网平台中的设备组信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeviceGroupsRequest 请求对象
     * @return AsyncInvoker<ListDeviceGroupsRequest, ListDeviceGroupsResponse>
     */
    public AsyncInvoker<ListDeviceGroupsRequest, ListDeviceGroupsResponse> listDeviceGroupsAsyncInvoker(
        ListDeviceGroupsRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listDeviceGroups, hcClient);
    }

    /**
     * 查询设备组
     *
     * 应用服务器可调用此接口查询指定设备组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceGroupRequest 请求对象
     * @return CompletableFuture<ShowDeviceGroupResponse>
     */
    public CompletableFuture<ShowDeviceGroupResponse> showDeviceGroupAsync(ShowDeviceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showDeviceGroup);
    }

    /**
     * 查询设备组
     *
     * 应用服务器可调用此接口查询指定设备组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceGroupRequest 请求对象
     * @return AsyncInvoker<ShowDeviceGroupRequest, ShowDeviceGroupResponse>
     */
    public AsyncInvoker<ShowDeviceGroupRequest, ShowDeviceGroupResponse> showDeviceGroupAsyncInvoker(
        ShowDeviceGroupRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showDeviceGroup, hcClient);
    }

    /**
     * 查询设备组设备列表
     *
     * 应用服务器可调用此接口查询指定设备组下的设备列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDevicesInGroupRequest 请求对象
     * @return CompletableFuture<ShowDevicesInGroupResponse>
     */
    public CompletableFuture<ShowDevicesInGroupResponse> showDevicesInGroupAsync(ShowDevicesInGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showDevicesInGroup);
    }

    /**
     * 查询设备组设备列表
     *
     * 应用服务器可调用此接口查询指定设备组下的设备列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDevicesInGroupRequest 请求对象
     * @return AsyncInvoker<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse>
     */
    public AsyncInvoker<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> showDevicesInGroupAsyncInvoker(
        ShowDevicesInGroupRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showDevicesInGroup, hcClient);
    }

    /**
     * 修改设备组
     *
     * 应用服务器可调用此接口修改物联网平台中指定设备组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceGroupRequest 请求对象
     * @return CompletableFuture<UpdateDeviceGroupResponse>
     */
    public CompletableFuture<UpdateDeviceGroupResponse> updateDeviceGroupAsync(UpdateDeviceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateDeviceGroup);
    }

    /**
     * 修改设备组
     *
     * 应用服务器可调用此接口修改物联网平台中指定设备组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceGroupRequest 请求对象
     * @return AsyncInvoker<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse>
     */
    public AsyncInvoker<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> updateDeviceGroupAsyncInvoker(
        UpdateDeviceGroupRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.updateDeviceGroup, hcClient);
    }

    /**
     * 创建设备
     *
     * 应用服务器可调用此接口在物联网平台创建一个设备，仅在创建后设备才可以接入物联网平台。
     * 
     * - 该接口支持使用gateway_id参数指定在父设备下创建一个子设备，并且支持多级子设备，当前最大支持二级子设备。
     * - 该接口同时还支持对设备进行初始配置，接口会读取创建设备请求参数product_id对应的产品详情，如果产品的属性有定义默认值，则会将该属性默认值写入该设备的设备影子中。
     * - 用户还可以使用创建设备请求参数shadow字段为设备指定初始配置，指定后将会根据service_id和desired设置的属性值与产品中对应属性的默认值比对，如果不同，则将以shadow字段中设置的属性值为准写入到设备影子中。
     * - 该接口仅支持创建单个设备，如需批量注册设备，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDeviceRequest 请求对象
     * @return CompletableFuture<AddDeviceResponse>
     */
    public CompletableFuture<AddDeviceResponse> addDeviceAsync(AddDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.addDevice);
    }

    /**
     * 创建设备
     *
     * 应用服务器可调用此接口在物联网平台创建一个设备，仅在创建后设备才可以接入物联网平台。
     * 
     * - 该接口支持使用gateway_id参数指定在父设备下创建一个子设备，并且支持多级子设备，当前最大支持二级子设备。
     * - 该接口同时还支持对设备进行初始配置，接口会读取创建设备请求参数product_id对应的产品详情，如果产品的属性有定义默认值，则会将该属性默认值写入该设备的设备影子中。
     * - 用户还可以使用创建设备请求参数shadow字段为设备指定初始配置，指定后将会根据service_id和desired设置的属性值与产品中对应属性的默认值比对，如果不同，则将以shadow字段中设置的属性值为准写入到设备影子中。
     * - 该接口仅支持创建单个设备，如需批量注册设备，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDeviceRequest 请求对象
     * @return AsyncInvoker<AddDeviceRequest, AddDeviceResponse>
     */
    public AsyncInvoker<AddDeviceRequest, AddDeviceResponse> addDeviceAsyncInvoker(AddDeviceRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.addDevice, hcClient);
    }

    /**
     * 修改设备网关
     *
     * 应用服务器可调用此接口在物联网平台修改子设备网关。
     * - 只允许子设备修改网关。
     * - 目标网关必须和当前设备在同一个资源空间。
     * - 网关id不能和当前子设备网关id相同。
     * - 设备如果有下级子设备，则不允许切换网关。
     * - 支持多级子设备，当前最大支持二级子设备。
     * - 该接口仅支持创建单个设备切换网关，如需批量切换设备网关，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeGatewayRequest 请求对象
     * @return CompletableFuture<ChangeGatewayResponse>
     */
    public CompletableFuture<ChangeGatewayResponse> changeGatewayAsync(ChangeGatewayRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.changeGateway);
    }

    /**
     * 修改设备网关
     *
     * 应用服务器可调用此接口在物联网平台修改子设备网关。
     * - 只允许子设备修改网关。
     * - 目标网关必须和当前设备在同一个资源空间。
     * - 网关id不能和当前子设备网关id相同。
     * - 设备如果有下级子设备，则不允许切换网关。
     * - 支持多级子设备，当前最大支持二级子设备。
     * - 该接口仅支持创建单个设备切换网关，如需批量切换设备网关，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeGatewayRequest 请求对象
     * @return AsyncInvoker<ChangeGatewayRequest, ChangeGatewayResponse>
     */
    public AsyncInvoker<ChangeGatewayRequest, ChangeGatewayResponse> changeGatewayAsyncInvoker(
        ChangeGatewayRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.changeGateway, hcClient);
    }

    /**
     * 删除设备
     *
     * 应用服务器可调用此接口在物联网平台上删除指定设备。若设备下连接了非直连设备，则必须把设备下的非直连设备都删除后，才能删除该设备。该接口仅支持删除单个设备，如需批量删除设备，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceRequest 请求对象
     * @return CompletableFuture<DeleteDeviceResponse>
     */
    public CompletableFuture<DeleteDeviceResponse> deleteDeviceAsync(DeleteDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteDevice);
    }

    /**
     * 删除设备
     *
     * 应用服务器可调用此接口在物联网平台上删除指定设备。若设备下连接了非直连设备，则必须把设备下的非直连设备都删除后，才能删除该设备。该接口仅支持删除单个设备，如需批量删除设备，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceRequest 请求对象
     * @return AsyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse>
     */
    public AsyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse> deleteDeviceAsyncInvoker(
        DeleteDeviceRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteDevice, hcClient);
    }

    /**
     * 冻结设备
     *
     * 应用服务器可调用此接口冻结设备，设备冻结后不能再连接上线，可以通过解冻设备接口解除设备冻结。注意，当前仅支持冻结与平台直连的设备。该接口仅支持冻结单个设备，如需批量冻结设备，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request FreezeDeviceRequest 请求对象
     * @return CompletableFuture<FreezeDeviceResponse>
     */
    public CompletableFuture<FreezeDeviceResponse> freezeDeviceAsync(FreezeDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.freezeDevice);
    }

    /**
     * 冻结设备
     *
     * 应用服务器可调用此接口冻结设备，设备冻结后不能再连接上线，可以通过解冻设备接口解除设备冻结。注意，当前仅支持冻结与平台直连的设备。该接口仅支持冻结单个设备，如需批量冻结设备，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request FreezeDeviceRequest 请求对象
     * @return AsyncInvoker<FreezeDeviceRequest, FreezeDeviceResponse>
     */
    public AsyncInvoker<FreezeDeviceRequest, FreezeDeviceResponse> freezeDeviceAsyncInvoker(
        FreezeDeviceRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.freezeDevice, hcClient);
    }

    /**
     * 查询指定设备加入的设备组列表
     *
     * 应用服务器可调用此接口查询物联网平台中的某个设备加入的设备组信息列表。仅标准版实例、企业版实例支持该接口调用，基础版不支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeviceGroupsByDeviceRequest 请求对象
     * @return CompletableFuture<ListDeviceGroupsByDeviceResponse>
     */
    public CompletableFuture<ListDeviceGroupsByDeviceResponse> listDeviceGroupsByDeviceAsync(
        ListDeviceGroupsByDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listDeviceGroupsByDevice);
    }

    /**
     * 查询指定设备加入的设备组列表
     *
     * 应用服务器可调用此接口查询物联网平台中的某个设备加入的设备组信息列表。仅标准版实例、企业版实例支持该接口调用，基础版不支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeviceGroupsByDeviceRequest 请求对象
     * @return AsyncInvoker<ListDeviceGroupsByDeviceRequest, ListDeviceGroupsByDeviceResponse>
     */
    public AsyncInvoker<ListDeviceGroupsByDeviceRequest, ListDeviceGroupsByDeviceResponse> listDeviceGroupsByDeviceAsyncInvoker(
        ListDeviceGroupsByDeviceRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listDeviceGroupsByDevice, hcClient);
    }

    /**
     * 查询设备列表
     *
     * 应用服务器可调用此接口查询物联网平台中的设备信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevicesRequest 请求对象
     * @return CompletableFuture<ListDevicesResponse>
     */
    public CompletableFuture<ListDevicesResponse> listDevicesAsync(ListDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listDevices);
    }

    /**
     * 查询设备列表
     *
     * 应用服务器可调用此接口查询物联网平台中的设备信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevicesRequest 请求对象
     * @return AsyncInvoker<ListDevicesRequest, ListDevicesResponse>
     */
    public AsyncInvoker<ListDevicesRequest, ListDevicesResponse> listDevicesAsyncInvoker(ListDevicesRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listDevices, hcClient);
    }

    /**
     * 重置设备密钥
     *
     * 应用服务器可调用此接口重置设备密钥，携带指定密钥时平台将设备密钥重置为指定的密钥，不携带密钥时平台将自动生成一个新的随机密钥返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetDeviceSecretRequest 请求对象
     * @return CompletableFuture<ResetDeviceSecretResponse>
     */
    public CompletableFuture<ResetDeviceSecretResponse> resetDeviceSecretAsync(ResetDeviceSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.resetDeviceSecret);
    }

    /**
     * 重置设备密钥
     *
     * 应用服务器可调用此接口重置设备密钥，携带指定密钥时平台将设备密钥重置为指定的密钥，不携带密钥时平台将自动生成一个新的随机密钥返回。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetDeviceSecretRequest 请求对象
     * @return AsyncInvoker<ResetDeviceSecretRequest, ResetDeviceSecretResponse>
     */
    public AsyncInvoker<ResetDeviceSecretRequest, ResetDeviceSecretResponse> resetDeviceSecretAsyncInvoker(
        ResetDeviceSecretRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.resetDeviceSecret, hcClient);
    }

    /**
     * 重置设备指纹
     *
     * 应用服务器可调用此接口重置设备指纹。携带指定设备指纹时将之重置为指定值；不携带时将之置空，后续设备第一次接入时，该设备指纹的值将设置为第一次接入时的证书指纹。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetFingerprintRequest 请求对象
     * @return CompletableFuture<ResetFingerprintResponse>
     */
    public CompletableFuture<ResetFingerprintResponse> resetFingerprintAsync(ResetFingerprintRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.resetFingerprint);
    }

    /**
     * 重置设备指纹
     *
     * 应用服务器可调用此接口重置设备指纹。携带指定设备指纹时将之重置为指定值；不携带时将之置空，后续设备第一次接入时，该设备指纹的值将设置为第一次接入时的证书指纹。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetFingerprintRequest 请求对象
     * @return AsyncInvoker<ResetFingerprintRequest, ResetFingerprintResponse>
     */
    public AsyncInvoker<ResetFingerprintRequest, ResetFingerprintResponse> resetFingerprintAsyncInvoker(
        ResetFingerprintRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.resetFingerprint, hcClient);
    }

    /**
     * 灵活搜索设备列表
     *
     * #### 接口说明
     * 
     * 应用服务器使用SQL语句调用该接口，灵活的搜索所需要的设备资源列表
     * 
     * #### 限制
     * 
     * - 仅**标准版实例、企业版实例**支持该接口调用，基础版不支持。
     * - 单账号调用该接口的 TPS 限制最大为1/S(每秒1次请求数)
     * 
     * #### 类SQL语法使用说明
     * 
     * 类SQL语句有select、from、where(可选)、order by(可选)、limit子句(可选)组成，长度限制为400个字符。子句里的内容大小写敏感，SQL语句的关键字大小写不敏感。
     * 
     * 示例：
     * 
     * &#x60;&#x60;&#x60;
     * select * from device where device_id &#x3D; &#39;as********&#39; limit 0,5
     * &#x60;&#x60;&#x60;
     * 
     * ##### SELECT子句
     * 
     * &#x60;&#x60;&#x60;
     * select [field]/[count(*)/count(1)] from device
     * &#x60;&#x60;&#x60;
     * 
     * 其中field为需要获取的字段，请参考响应参数字段名称，也可填*，获取所有字段。
     * 
     * 如果需要统计搜索的设备个数，请填count(*)或者count(1).
     * 
     * ##### FROM子句
     * 
     * &#x60;&#x60;&#x60;
     * from device
     * &#x60;&#x60;&#x60;
     * 
     * from后为要查询的资源名，当前支持\&quot;device\&quot;
     * 
     * ##### WHERE子句(可选)
     * 
     * &#x60;&#x60;&#x60;
     * WHERE [condition1] AND [condition2]
     * &#x60;&#x60;&#x60;
     * 
     * 最多支持5个condition，不支持嵌套；支持的检索字段请参见下面的**搜索条件字段说明**和**支持的运算符**章节
     * 
     * 连接词支持AND、OR，优先级参考标准SQL语法，默认AND优先级高于OR。
     * 
     * ##### LIMIT子句(可选)
     * 
     * &#x60;&#x60;&#x60;
     * limit [offset,] rows
     * &#x60;&#x60;&#x60;
     * 
     * offset标识搜索的偏移量，rows标识返回搜索结果的最大行数，例如：
     * 
     * - limit n ;示例(select * from device limit 10)
     * 
     *   最大返回n条结果数据
     *   
     * - limit m,n; 示例(select * from device limit 20,10) 
     *   搜索偏移量为m，最大返回n条结果数据
     * 
     * ###### 限制
     * 
     *  offset 最大 500， rows最大50，如果不填写limit子句，默认为limit 10
     * 
     * ##### ORDER BY子句(可选)
     * 
     * 用于实现自定义排序，当前支持自定义排序的字段为：\&quot;marker\&quot;。
     * 
     * &#x60;&#x60;&#x60;
     * order by marker [asc]/[desc]
     * &#x60;&#x60;&#x60;
     * 
     * 子句不填写时默认逻辑为随机排序
     * 
     * #### 搜索条件字段说明
     * 
     * | 字段名      | 类型   | 说明             | 取值范围                                                     |
     * | :---------- | :----- | :--------------- | :----------------------------------------------------------- |
     * | app_id      | string | 资源空间ID       | 长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。 |
     * | device_id   | string | 设备ID           | 长度不超过128，只允许字母、数字、下划线（_）、连接符（-）的组合。 |
     * | gateway_id  | string | 网关ID           | 长度不超过128，只允许字母、数字、下划线（_）、连接符（-）的组合。 |
     * | product_id  | string | 设备关联的产品ID | 长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。 |
     * | device_name | string | 设备名称         | 长度不超过256，只允许中文、字母、数字、以及_?&#39;#().,&amp;%@!-等字符的组合符。 |
     * | node_id     | string | 设备标识码       | 长度不超过64，只允许字母、数字、下划线（_）、连接符（-）的组合 |
     * | status      | string | 设备的状态       | ONLINE(在线)、OFFLINE(离线)、ABNORMAL(异常)、INACTIVE(未激活)、FROZEN(冻结) |
     * | node_type   | string | 设备节点类型     | GATEWAY(直连设备或网关)、ENDPOINT(非直连设备)                |
     * | tag_key     | string | 标签键           | 长度不超过64，只允许中文、字母、数字、以及_.-等字符的组合。  |
     * | tag_value   | string | 标签值           | 长度不超过128，只允许中文、字母、数字、以及_.-等字符的组合。 |
     * | sw_version  | string | 软件版本         | 长度不超过64，只允许字母、数字、下划线（_）、连接符（-）、英文点(.)的组合。 |
     * | fw_version  | string | 固件版本         | 长度不超过64，只允许字母、数字、下划线（_）、连接符（-）、英文点(.)的组合。 |
     * | group_id    | string | 群组Id           | 长度不超过36，十六进制字符串和连接符（-）的组合              |
     * | create_time | string | 设备注册时间     | 格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;，如：2015-06-06T12:10:10.000Z |
     * | marker      | string | 结果记录ID       | 长度为24的十六进制字符串，如ffffffffffffffffffffffff         |
     * 
     * #### 支持的运算符
     * 
     * | 运算符  | 支持的字段                               |
     * | ------- | ---------------------------------------- |
     * | &#x3D;       | 所有                                     |
     * | !&#x3D;      | 所有                                     |
     * | &gt;       | create_time、marker                      |
     * | &lt;       | create_time、marker                      |
     * | like    | device_name、node_id、tag_key、tag_value |
     * | in      | 除tag_key、tag_value以外字段             |
     * | not  in | 除tag_key、tag_value以外字段             |
     * 
     * #### SQL 限制
     * 
     * - like: 只支持前缀匹配，不支持后缀匹配或者通配符匹配。前缀匹配不得少于4个字符，且不能包含任何特殊字符(只允许中文、字母、数字、下划线（_）、连接符（-）). 前缀后必须跟上\&quot;%\&quot;结尾。
     * - 不支持除了count(*)/count(1)以外的其他任何函数。
     * - 不支持其他SQL用法，如嵌套SQL、union、join、别名(Alias)等用法
     * - SQL长度限制为400个字符，单个请求条件最大支持5个。
     * - 不支持\&quot;null\&quot;和空字符串等条件值匹配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDevicesRequest 请求对象
     * @return CompletableFuture<SearchDevicesResponse>
     */
    public CompletableFuture<SearchDevicesResponse> searchDevicesAsync(SearchDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.searchDevices);
    }

    /**
     * 灵活搜索设备列表
     *
     * #### 接口说明
     * 
     * 应用服务器使用SQL语句调用该接口，灵活的搜索所需要的设备资源列表
     * 
     * #### 限制
     * 
     * - 仅**标准版实例、企业版实例**支持该接口调用，基础版不支持。
     * - 单账号调用该接口的 TPS 限制最大为1/S(每秒1次请求数)
     * 
     * #### 类SQL语法使用说明
     * 
     * 类SQL语句有select、from、where(可选)、order by(可选)、limit子句(可选)组成，长度限制为400个字符。子句里的内容大小写敏感，SQL语句的关键字大小写不敏感。
     * 
     * 示例：
     * 
     * &#x60;&#x60;&#x60;
     * select * from device where device_id &#x3D; &#39;as********&#39; limit 0,5
     * &#x60;&#x60;&#x60;
     * 
     * ##### SELECT子句
     * 
     * &#x60;&#x60;&#x60;
     * select [field]/[count(*)/count(1)] from device
     * &#x60;&#x60;&#x60;
     * 
     * 其中field为需要获取的字段，请参考响应参数字段名称，也可填*，获取所有字段。
     * 
     * 如果需要统计搜索的设备个数，请填count(*)或者count(1).
     * 
     * ##### FROM子句
     * 
     * &#x60;&#x60;&#x60;
     * from device
     * &#x60;&#x60;&#x60;
     * 
     * from后为要查询的资源名，当前支持\&quot;device\&quot;
     * 
     * ##### WHERE子句(可选)
     * 
     * &#x60;&#x60;&#x60;
     * WHERE [condition1] AND [condition2]
     * &#x60;&#x60;&#x60;
     * 
     * 最多支持5个condition，不支持嵌套；支持的检索字段请参见下面的**搜索条件字段说明**和**支持的运算符**章节
     * 
     * 连接词支持AND、OR，优先级参考标准SQL语法，默认AND优先级高于OR。
     * 
     * ##### LIMIT子句(可选)
     * 
     * &#x60;&#x60;&#x60;
     * limit [offset,] rows
     * &#x60;&#x60;&#x60;
     * 
     * offset标识搜索的偏移量，rows标识返回搜索结果的最大行数，例如：
     * 
     * - limit n ;示例(select * from device limit 10)
     * 
     *   最大返回n条结果数据
     *   
     * - limit m,n; 示例(select * from device limit 20,10) 
     *   搜索偏移量为m，最大返回n条结果数据
     * 
     * ###### 限制
     * 
     *  offset 最大 500， rows最大50，如果不填写limit子句，默认为limit 10
     * 
     * ##### ORDER BY子句(可选)
     * 
     * 用于实现自定义排序，当前支持自定义排序的字段为：\&quot;marker\&quot;。
     * 
     * &#x60;&#x60;&#x60;
     * order by marker [asc]/[desc]
     * &#x60;&#x60;&#x60;
     * 
     * 子句不填写时默认逻辑为随机排序
     * 
     * #### 搜索条件字段说明
     * 
     * | 字段名      | 类型   | 说明             | 取值范围                                                     |
     * | :---------- | :----- | :--------------- | :----------------------------------------------------------- |
     * | app_id      | string | 资源空间ID       | 长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。 |
     * | device_id   | string | 设备ID           | 长度不超过128，只允许字母、数字、下划线（_）、连接符（-）的组合。 |
     * | gateway_id  | string | 网关ID           | 长度不超过128，只允许字母、数字、下划线（_）、连接符（-）的组合。 |
     * | product_id  | string | 设备关联的产品ID | 长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。 |
     * | device_name | string | 设备名称         | 长度不超过256，只允许中文、字母、数字、以及_?&#39;#().,&amp;%@!-等字符的组合符。 |
     * | node_id     | string | 设备标识码       | 长度不超过64，只允许字母、数字、下划线（_）、连接符（-）的组合 |
     * | status      | string | 设备的状态       | ONLINE(在线)、OFFLINE(离线)、ABNORMAL(异常)、INACTIVE(未激活)、FROZEN(冻结) |
     * | node_type   | string | 设备节点类型     | GATEWAY(直连设备或网关)、ENDPOINT(非直连设备)                |
     * | tag_key     | string | 标签键           | 长度不超过64，只允许中文、字母、数字、以及_.-等字符的组合。  |
     * | tag_value   | string | 标签值           | 长度不超过128，只允许中文、字母、数字、以及_.-等字符的组合。 |
     * | sw_version  | string | 软件版本         | 长度不超过64，只允许字母、数字、下划线（_）、连接符（-）、英文点(.)的组合。 |
     * | fw_version  | string | 固件版本         | 长度不超过64，只允许字母、数字、下划线（_）、连接符（-）、英文点(.)的组合。 |
     * | group_id    | string | 群组Id           | 长度不超过36，十六进制字符串和连接符（-）的组合              |
     * | create_time | string | 设备注册时间     | 格式：yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;，如：2015-06-06T12:10:10.000Z |
     * | marker      | string | 结果记录ID       | 长度为24的十六进制字符串，如ffffffffffffffffffffffff         |
     * 
     * #### 支持的运算符
     * 
     * | 运算符  | 支持的字段                               |
     * | ------- | ---------------------------------------- |
     * | &#x3D;       | 所有                                     |
     * | !&#x3D;      | 所有                                     |
     * | &gt;       | create_time、marker                      |
     * | &lt;       | create_time、marker                      |
     * | like    | device_name、node_id、tag_key、tag_value |
     * | in      | 除tag_key、tag_value以外字段             |
     * | not  in | 除tag_key、tag_value以外字段             |
     * 
     * #### SQL 限制
     * 
     * - like: 只支持前缀匹配，不支持后缀匹配或者通配符匹配。前缀匹配不得少于4个字符，且不能包含任何特殊字符(只允许中文、字母、数字、下划线（_）、连接符（-）). 前缀后必须跟上\&quot;%\&quot;结尾。
     * - 不支持除了count(*)/count(1)以外的其他任何函数。
     * - 不支持其他SQL用法，如嵌套SQL、union、join、别名(Alias)等用法
     * - SQL长度限制为400个字符，单个请求条件最大支持5个。
     * - 不支持\&quot;null\&quot;和空字符串等条件值匹配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchDevicesRequest 请求对象
     * @return AsyncInvoker<SearchDevicesRequest, SearchDevicesResponse>
     */
    public AsyncInvoker<SearchDevicesRequest, SearchDevicesResponse> searchDevicesAsyncInvoker(
        SearchDevicesRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.searchDevices, hcClient);
    }

    /**
     * 查询设备
     *
     * 应用服务器可调用此接口查询物联网平台中指定设备的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceRequest 请求对象
     * @return CompletableFuture<ShowDeviceResponse>
     */
    public CompletableFuture<ShowDeviceResponse> showDeviceAsync(ShowDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showDevice);
    }

    /**
     * 查询设备
     *
     * 应用服务器可调用此接口查询物联网平台中指定设备的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceRequest 请求对象
     * @return AsyncInvoker<ShowDeviceRequest, ShowDeviceResponse>
     */
    public AsyncInvoker<ShowDeviceRequest, ShowDeviceResponse> showDeviceAsyncInvoker(ShowDeviceRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showDevice, hcClient);
    }

    /**
     * 解冻设备
     *
     * 应用服务器可调用此接口解冻设备，解除冻结后，设备可以连接上线。该接口仅支持解冻单个设备，如需批量解冻设备，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnfreezeDeviceRequest 请求对象
     * @return CompletableFuture<UnfreezeDeviceResponse>
     */
    public CompletableFuture<UnfreezeDeviceResponse> unfreezeDeviceAsync(UnfreezeDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.unfreezeDevice);
    }

    /**
     * 解冻设备
     *
     * 应用服务器可调用此接口解冻设备，解除冻结后，设备可以连接上线。该接口仅支持解冻单个设备，如需批量解冻设备，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnfreezeDeviceRequest 请求对象
     * @return AsyncInvoker<UnfreezeDeviceRequest, UnfreezeDeviceResponse>
     */
    public AsyncInvoker<UnfreezeDeviceRequest, UnfreezeDeviceResponse> unfreezeDeviceAsyncInvoker(
        UnfreezeDeviceRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.unfreezeDevice, hcClient);
    }

    /**
     * 修改设备
     *
     * 应用服务器可调用此接口修改物联网平台中指定设备的基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceRequest 请求对象
     * @return CompletableFuture<UpdateDeviceResponse>
     */
    public CompletableFuture<UpdateDeviceResponse> updateDeviceAsync(UpdateDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateDevice);
    }

    /**
     * 修改设备
     *
     * 应用服务器可调用此接口修改物联网平台中指定设备的基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceRequest 请求对象
     * @return AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>
     */
    public AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> updateDeviceAsyncInvoker(
        UpdateDeviceRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.updateDevice, hcClient);
    }

    /**
     * 创建设备代理
     *
     * 应用服务器可调用此接口在物联网平台创建一个动态设备代理规则，用于子设备自主选择网关设备上线和上报消息，即代理组下的任意网关下的子设备均可以通过代理组里其他设备上线([[网关更新子设备状态](https://support.huaweicloud.com/api-iothub/iot_06_v5_3022.html)](tag:hws) [[网关更新子设备状态](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_3022.html)](tag:hws_hk))然后进行数据上报([[网关批量设备属性上报](https://support.huaweicloud.com/api-iothub/iot_06_v5_3006.html)](tag:hws) [[网关更新子设备状态](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_3006.html)](tag:hws_hk))。
     * - 单实例最多可以配置10个设备代理
     * - 单账号调用该接口的 TPS 限制最大为1/S(每秒1次请求数)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeviceProxyRequest 请求对象
     * @return CompletableFuture<CreateDeviceProxyResponse>
     */
    public CompletableFuture<CreateDeviceProxyResponse> createDeviceProxyAsync(CreateDeviceProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createDeviceProxy);
    }

    /**
     * 创建设备代理
     *
     * 应用服务器可调用此接口在物联网平台创建一个动态设备代理规则，用于子设备自主选择网关设备上线和上报消息，即代理组下的任意网关下的子设备均可以通过代理组里其他设备上线([[网关更新子设备状态](https://support.huaweicloud.com/api-iothub/iot_06_v5_3022.html)](tag:hws) [[网关更新子设备状态](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_3022.html)](tag:hws_hk))然后进行数据上报([[网关批量设备属性上报](https://support.huaweicloud.com/api-iothub/iot_06_v5_3006.html)](tag:hws) [[网关更新子设备状态](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_3006.html)](tag:hws_hk))。
     * - 单实例最多可以配置10个设备代理
     * - 单账号调用该接口的 TPS 限制最大为1/S(每秒1次请求数)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDeviceProxyRequest 请求对象
     * @return AsyncInvoker<CreateDeviceProxyRequest, CreateDeviceProxyResponse>
     */
    public AsyncInvoker<CreateDeviceProxyRequest, CreateDeviceProxyResponse> createDeviceProxyAsyncInvoker(
        CreateDeviceProxyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.createDeviceProxy, hcClient);
    }

    /**
     * 删除设备代理
     *
     * 应用服务器可调用此接口在物联网平台上删除指定设备代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceProxyRequest 请求对象
     * @return CompletableFuture<DeleteDeviceProxyResponse>
     */
    public CompletableFuture<DeleteDeviceProxyResponse> deleteDeviceProxyAsync(DeleteDeviceProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteDeviceProxy);
    }

    /**
     * 删除设备代理
     *
     * 应用服务器可调用此接口在物联网平台上删除指定设备代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceProxyRequest 请求对象
     * @return AsyncInvoker<DeleteDeviceProxyRequest, DeleteDeviceProxyResponse>
     */
    public AsyncInvoker<DeleteDeviceProxyRequest, DeleteDeviceProxyResponse> deleteDeviceProxyAsyncInvoker(
        DeleteDeviceProxyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteDeviceProxy, hcClient);
    }

    /**
     * 查询设备代理列表
     *
     * 应用服务器可调用此接口查询物联网平台中的设备代理列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeviceProxiesRequest 请求对象
     * @return CompletableFuture<ListDeviceProxiesResponse>
     */
    public CompletableFuture<ListDeviceProxiesResponse> listDeviceProxiesAsync(ListDeviceProxiesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listDeviceProxies);
    }

    /**
     * 查询设备代理列表
     *
     * 应用服务器可调用此接口查询物联网平台中的设备代理列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeviceProxiesRequest 请求对象
     * @return AsyncInvoker<ListDeviceProxiesRequest, ListDeviceProxiesResponse>
     */
    public AsyncInvoker<ListDeviceProxiesRequest, ListDeviceProxiesResponse> listDeviceProxiesAsyncInvoker(
        ListDeviceProxiesRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listDeviceProxies, hcClient);
    }

    /**
     * 查询设备代理详情
     *
     * 应用服务器可调用此接口查询物联网平台中指定设备代理的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceProxyRequest 请求对象
     * @return CompletableFuture<ShowDeviceProxyResponse>
     */
    public CompletableFuture<ShowDeviceProxyResponse> showDeviceProxyAsync(ShowDeviceProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showDeviceProxy);
    }

    /**
     * 查询设备代理详情
     *
     * 应用服务器可调用此接口查询物联网平台中指定设备代理的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceProxyRequest 请求对象
     * @return AsyncInvoker<ShowDeviceProxyRequest, ShowDeviceProxyResponse>
     */
    public AsyncInvoker<ShowDeviceProxyRequest, ShowDeviceProxyResponse> showDeviceProxyAsyncInvoker(
        ShowDeviceProxyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showDeviceProxy, hcClient);
    }

    /**
     * 修改设备代理
     *
     * 应用服务器可调用此接口修改物联网平台中指定设备代理的基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceProxyRequest 请求对象
     * @return CompletableFuture<UpdateDeviceProxyResponse>
     */
    public CompletableFuture<UpdateDeviceProxyResponse> updateDeviceProxyAsync(UpdateDeviceProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateDeviceProxy);
    }

    /**
     * 修改设备代理
     *
     * 应用服务器可调用此接口修改物联网平台中指定设备代理的基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceProxyRequest 请求对象
     * @return AsyncInvoker<UpdateDeviceProxyRequest, UpdateDeviceProxyResponse>
     */
    public AsyncInvoker<UpdateDeviceProxyRequest, UpdateDeviceProxyResponse> updateDeviceProxyAsyncInvoker(
        UpdateDeviceProxyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.updateDeviceProxy, hcClient);
    }

    /**
     * 查询设备影子数据
     *
     * 应用服务器可调用此接口查询指定设备的设备影子信息，包括对设备的期望属性信息（desired区）和设备最新上报的属性信息（reported区）。
     * 
     * 设备影子介绍：
     * 设备影子是一个用于存储和检索设备当前状态信息的JSON文档。
     * - 每个设备有且只有一个设备影子，由设备ID唯一标识
     * - 设备影子用于存储设备上报的(状态)属性和应用程序期望的设备(状态)属性
     * - 无论该设备是否在线，都可以通过该影子获取和设置设备的属性
     * - 设备上线或者设备上报属性时，如果desired区和reported区存在差异，则将差异部分下发给设备，配置的预期属性需在产品模型中定义且method具有可写属性“W”才可下发
     * 
     * 限制：
     * 设备影子JSON文档中的key不允许特殊字符：点(.)、dollar符号($)、空char(十六进制的ASCII码为00)。如果包含了以上特殊字符则无法正常刷新影子文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceShadowRequest 请求对象
     * @return CompletableFuture<ShowDeviceShadowResponse>
     */
    public CompletableFuture<ShowDeviceShadowResponse> showDeviceShadowAsync(ShowDeviceShadowRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showDeviceShadow);
    }

    /**
     * 查询设备影子数据
     *
     * 应用服务器可调用此接口查询指定设备的设备影子信息，包括对设备的期望属性信息（desired区）和设备最新上报的属性信息（reported区）。
     * 
     * 设备影子介绍：
     * 设备影子是一个用于存储和检索设备当前状态信息的JSON文档。
     * - 每个设备有且只有一个设备影子，由设备ID唯一标识
     * - 设备影子用于存储设备上报的(状态)属性和应用程序期望的设备(状态)属性
     * - 无论该设备是否在线，都可以通过该影子获取和设置设备的属性
     * - 设备上线或者设备上报属性时，如果desired区和reported区存在差异，则将差异部分下发给设备，配置的预期属性需在产品模型中定义且method具有可写属性“W”才可下发
     * 
     * 限制：
     * 设备影子JSON文档中的key不允许特殊字符：点(.)、dollar符号($)、空char(十六进制的ASCII码为00)。如果包含了以上特殊字符则无法正常刷新影子文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceShadowRequest 请求对象
     * @return AsyncInvoker<ShowDeviceShadowRequest, ShowDeviceShadowResponse>
     */
    public AsyncInvoker<ShowDeviceShadowRequest, ShowDeviceShadowResponse> showDeviceShadowAsyncInvoker(
        ShowDeviceShadowRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showDeviceShadow, hcClient);
    }

    /**
     * 配置设备影子预期数据
     *
     * 应用服务器可调用此接口配置设备影子的预期属性（desired区），当设备上线或者设备上报属性时把属性下发给设备。
     * 
     * 设备影子介绍：
     * 设备影子是一个用于存储和检索设备当前状态信息的JSON文档。
     * - 每个设备有且只有一个设备影子，由设备ID唯一标识
     * - 设备影子用于存储设备上报的(状态)属性和应用程序期望的设备(状态)属性
     * - 无论该设备是否在线，都可以通过该影子获取和设置设备的属性
     * - 设备上线或者设备上报属性时，如果desired区和reported区存在差异，则将差异部分下发给设备，配置的预期属性需在产品模型中定义且method具有可写属性“W”才可下发
     * - 该接口仅支持配置单个设备的设备影子的预期数据，如需多个设备的设备影子配置，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * 限制：
     * 设备影子JSON文档中的key不允许特殊字符：点(.)、dollar符号($)、空char(十六进制的ASCII码为00)。如果包含了以上特殊字符则无法正常刷新影子文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceShadowDesiredDataRequest 请求对象
     * @return CompletableFuture<UpdateDeviceShadowDesiredDataResponse>
     */
    public CompletableFuture<UpdateDeviceShadowDesiredDataResponse> updateDeviceShadowDesiredDataAsync(
        UpdateDeviceShadowDesiredDataRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateDeviceShadowDesiredData);
    }

    /**
     * 配置设备影子预期数据
     *
     * 应用服务器可调用此接口配置设备影子的预期属性（desired区），当设备上线或者设备上报属性时把属性下发给设备。
     * 
     * 设备影子介绍：
     * 设备影子是一个用于存储和检索设备当前状态信息的JSON文档。
     * - 每个设备有且只有一个设备影子，由设备ID唯一标识
     * - 设备影子用于存储设备上报的(状态)属性和应用程序期望的设备(状态)属性
     * - 无论该设备是否在线，都可以通过该影子获取和设置设备的属性
     * - 设备上线或者设备上报属性时，如果desired区和reported区存在差异，则将差异部分下发给设备，配置的预期属性需在产品模型中定义且method具有可写属性“W”才可下发
     * - 该接口仅支持配置单个设备的设备影子的预期数据，如需多个设备的设备影子配置，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * 限制：
     * 设备影子JSON文档中的key不允许特殊字符：点(.)、dollar符号($)、空char(十六进制的ASCII码为00)。如果包含了以上特殊字符则无法正常刷新影子文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDeviceShadowDesiredDataRequest 请求对象
     * @return AsyncInvoker<UpdateDeviceShadowDesiredDataRequest, UpdateDeviceShadowDesiredDataResponse>
     */
    public AsyncInvoker<UpdateDeviceShadowDesiredDataRequest, UpdateDeviceShadowDesiredDataResponse> updateDeviceShadowDesiredDataAsyncInvoker(
        UpdateDeviceShadowDesiredDataRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.updateDeviceShadowDesiredData, hcClient);
    }

    /**
     * 新建数据流转流控策略
     *
     * 应用服务器可调用此接口在物联网平台创建数据流转流控策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRoutingFlowControlPolicyRequest 请求对象
     * @return CompletableFuture<CreateRoutingFlowControlPolicyResponse>
     */
    public CompletableFuture<CreateRoutingFlowControlPolicyResponse> createRoutingFlowControlPolicyAsync(
        CreateRoutingFlowControlPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createRoutingFlowControlPolicy);
    }

    /**
     * 新建数据流转流控策略
     *
     * 应用服务器可调用此接口在物联网平台创建数据流转流控策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRoutingFlowControlPolicyRequest 请求对象
     * @return AsyncInvoker<CreateRoutingFlowControlPolicyRequest, CreateRoutingFlowControlPolicyResponse>
     */
    public AsyncInvoker<CreateRoutingFlowControlPolicyRequest, CreateRoutingFlowControlPolicyResponse> createRoutingFlowControlPolicyAsyncInvoker(
        CreateRoutingFlowControlPolicyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.createRoutingFlowControlPolicy, hcClient);
    }

    /**
     * 删除数据流转流控策略
     *
     * 应用服务器可调用此接口在物联网平台删除指定数据流转流控策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRoutingFlowControlPolicyRequest 请求对象
     * @return CompletableFuture<DeleteRoutingFlowControlPolicyResponse>
     */
    public CompletableFuture<DeleteRoutingFlowControlPolicyResponse> deleteRoutingFlowControlPolicyAsync(
        DeleteRoutingFlowControlPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteRoutingFlowControlPolicy);
    }

    /**
     * 删除数据流转流控策略
     *
     * 应用服务器可调用此接口在物联网平台删除指定数据流转流控策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRoutingFlowControlPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteRoutingFlowControlPolicyRequest, DeleteRoutingFlowControlPolicyResponse>
     */
    public AsyncInvoker<DeleteRoutingFlowControlPolicyRequest, DeleteRoutingFlowControlPolicyResponse> deleteRoutingFlowControlPolicyAsyncInvoker(
        DeleteRoutingFlowControlPolicyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteRoutingFlowControlPolicy, hcClient);
    }

    /**
     * 查询数据流转流控策略列表
     *
     * 应用服务器可调用此接口查询在物联网平台设置的数据流转流控策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRoutingFlowControlPolicyRequest 请求对象
     * @return CompletableFuture<ListRoutingFlowControlPolicyResponse>
     */
    public CompletableFuture<ListRoutingFlowControlPolicyResponse> listRoutingFlowControlPolicyAsync(
        ListRoutingFlowControlPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listRoutingFlowControlPolicy);
    }

    /**
     * 查询数据流转流控策略列表
     *
     * 应用服务器可调用此接口查询在物联网平台设置的数据流转流控策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRoutingFlowControlPolicyRequest 请求对象
     * @return AsyncInvoker<ListRoutingFlowControlPolicyRequest, ListRoutingFlowControlPolicyResponse>
     */
    public AsyncInvoker<ListRoutingFlowControlPolicyRequest, ListRoutingFlowControlPolicyResponse> listRoutingFlowControlPolicyAsyncInvoker(
        ListRoutingFlowControlPolicyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listRoutingFlowControlPolicy, hcClient);
    }

    /**
     * 查询数据流转流控策略
     *
     * 应用服务器可调用此接口在物联网平台查询指定数据流转流控策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRoutingFlowControlPolicyRequest 请求对象
     * @return CompletableFuture<ShowRoutingFlowControlPolicyResponse>
     */
    public CompletableFuture<ShowRoutingFlowControlPolicyResponse> showRoutingFlowControlPolicyAsync(
        ShowRoutingFlowControlPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showRoutingFlowControlPolicy);
    }

    /**
     * 查询数据流转流控策略
     *
     * 应用服务器可调用此接口在物联网平台查询指定数据流转流控策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRoutingFlowControlPolicyRequest 请求对象
     * @return AsyncInvoker<ShowRoutingFlowControlPolicyRequest, ShowRoutingFlowControlPolicyResponse>
     */
    public AsyncInvoker<ShowRoutingFlowControlPolicyRequest, ShowRoutingFlowControlPolicyResponse> showRoutingFlowControlPolicyAsyncInvoker(
        ShowRoutingFlowControlPolicyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showRoutingFlowControlPolicy, hcClient);
    }

    /**
     * 修改数据流转流控策略
     *
     * 应用服务器可调用此接口在物联网平台修改指定数据流转流控策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRoutingFlowControlPolicyRequest 请求对象
     * @return CompletableFuture<UpdateRoutingFlowControlPolicyResponse>
     */
    public CompletableFuture<UpdateRoutingFlowControlPolicyResponse> updateRoutingFlowControlPolicyAsync(
        UpdateRoutingFlowControlPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateRoutingFlowControlPolicy);
    }

    /**
     * 修改数据流转流控策略
     *
     * 应用服务器可调用此接口在物联网平台修改指定数据流转流控策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRoutingFlowControlPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateRoutingFlowControlPolicyRequest, UpdateRoutingFlowControlPolicyResponse>
     */
    public AsyncInvoker<UpdateRoutingFlowControlPolicyRequest, UpdateRoutingFlowControlPolicyResponse> updateRoutingFlowControlPolicyAsyncInvoker(
        UpdateRoutingFlowControlPolicyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.updateRoutingFlowControlPolicy, hcClient);
    }

    /**
     * 创建编解码函数
     *
     * 提供创建编解码函数的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFunctionsRequest 请求对象
     * @return CompletableFuture<AddFunctionsResponse>
     */
    public CompletableFuture<AddFunctionsResponse> addFunctionsAsync(AddFunctionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.addFunctions);
    }

    /**
     * 创建编解码函数
     *
     * 提供创建编解码函数的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFunctionsRequest 请求对象
     * @return AsyncInvoker<AddFunctionsRequest, AddFunctionsResponse>
     */
    public AsyncInvoker<AddFunctionsRequest, AddFunctionsResponse> addFunctionsAsyncInvoker(
        AddFunctionsRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.addFunctions, hcClient);
    }

    /**
     * 删除编解码函数
     *
     * 提供删除编解码函数的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFunctionsRequest 请求对象
     * @return CompletableFuture<DeleteFunctionsResponse>
     */
    public CompletableFuture<DeleteFunctionsResponse> deleteFunctionsAsync(DeleteFunctionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteFunctions);
    }

    /**
     * 删除编解码函数
     *
     * 提供删除编解码函数的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFunctionsRequest 请求对象
     * @return AsyncInvoker<DeleteFunctionsRequest, DeleteFunctionsResponse>
     */
    public AsyncInvoker<DeleteFunctionsRequest, DeleteFunctionsResponse> deleteFunctionsAsyncInvoker(
        DeleteFunctionsRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteFunctions, hcClient);
    }

    /**
     * 查询编解码函数
     *
     * 提供查询编解码函数的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFunctionsRequest 请求对象
     * @return CompletableFuture<ListFunctionsResponse>
     */
    public CompletableFuture<ListFunctionsResponse> listFunctionsAsync(ListFunctionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listFunctions);
    }

    /**
     * 查询编解码函数
     *
     * 提供查询编解码函数的功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFunctionsRequest 请求对象
     * @return AsyncInvoker<ListFunctionsRequest, ListFunctionsResponse>
     */
    public AsyncInvoker<ListFunctionsRequest, ListFunctionsResponse> listFunctionsAsyncInvoker(
        ListFunctionsRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listFunctions, hcClient);
    }

    /**
     * 下发设备消息
     *
     * 物联网平台可向设备下发消息，应用服务器可调用此接口向指定设备下发消息，以实现对设备的控制。应用将消息下发给平台后，平台返回应用响应结果，平台再将消息发送给设备。平台返回应用响应结果不一定是设备接收结果，建议用户应用通过订阅[[设备消息状态变更通知](https://support.huaweicloud.com/api-iothub/iot_06_v5_01203.html)](tag:hws)[[设备消息状态变更通知](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_01203.html)](tag:hws_hk)，订阅后平台会将设备接收结果推送给订阅的应用。
     * 注意：
     * - 此接口适用于MQTT设备消息下发，暂不支持其他协议接入的设备消息下发。
     * - 此接口仅支持单个设备消息下发，如需多个设备消息下发，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessageRequest 请求对象
     * @return CompletableFuture<CreateMessageResponse>
     */
    public CompletableFuture<CreateMessageResponse> createMessageAsync(CreateMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createMessage);
    }

    /**
     * 下发设备消息
     *
     * 物联网平台可向设备下发消息，应用服务器可调用此接口向指定设备下发消息，以实现对设备的控制。应用将消息下发给平台后，平台返回应用响应结果，平台再将消息发送给设备。平台返回应用响应结果不一定是设备接收结果，建议用户应用通过订阅[[设备消息状态变更通知](https://support.huaweicloud.com/api-iothub/iot_06_v5_01203.html)](tag:hws)[[设备消息状态变更通知](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_01203.html)](tag:hws_hk)，订阅后平台会将设备接收结果推送给订阅的应用。
     * 注意：
     * - 此接口适用于MQTT设备消息下发，暂不支持其他协议接入的设备消息下发。
     * - 此接口仅支持单个设备消息下发，如需多个设备消息下发，请参见 [[创建批量任务](https://support.huaweicloud.com/api-iothub/iot_06_v5_0045.html)](tag:hws)[[创建批量任务](https://support.huaweicloud.com/intl/zh-cn/api-iothub/iot_06_v5_0045.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMessageRequest 请求对象
     * @return AsyncInvoker<CreateMessageRequest, CreateMessageResponse>
     */
    public AsyncInvoker<CreateMessageRequest, CreateMessageResponse> createMessageAsyncInvoker(
        CreateMessageRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.createMessage, hcClient);
    }

    /**
     * 删除指定消息id的消息
     *
     * 应用服务器可调用此接口删除平台下发给设备的指定消息id的消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceMessageRequest 请求对象
     * @return CompletableFuture<DeleteDeviceMessageResponse>
     */
    public CompletableFuture<DeleteDeviceMessageResponse> deleteDeviceMessageAsync(DeleteDeviceMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteDeviceMessage);
    }

    /**
     * 删除指定消息id的消息
     *
     * 应用服务器可调用此接口删除平台下发给设备的指定消息id的消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceMessageRequest 请求对象
     * @return AsyncInvoker<DeleteDeviceMessageRequest, DeleteDeviceMessageResponse>
     */
    public AsyncInvoker<DeleteDeviceMessageRequest, DeleteDeviceMessageResponse> deleteDeviceMessageAsyncInvoker(
        DeleteDeviceMessageRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteDeviceMessage, hcClient);
    }

    /**
     * 查询设备消息
     *
     * 应用服务器可调用此接口查询平台下发给设备的消息，平台为每个设备默认最多保存20条消息，超过20条后， 后续的消息会替换下发最早的消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeviceMessagesRequest 请求对象
     * @return CompletableFuture<ListDeviceMessagesResponse>
     */
    public CompletableFuture<ListDeviceMessagesResponse> listDeviceMessagesAsync(ListDeviceMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listDeviceMessages);
    }

    /**
     * 查询设备消息
     *
     * 应用服务器可调用此接口查询平台下发给设备的消息，平台为每个设备默认最多保存20条消息，超过20条后， 后续的消息会替换下发最早的消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeviceMessagesRequest 请求对象
     * @return AsyncInvoker<ListDeviceMessagesRequest, ListDeviceMessagesResponse>
     */
    public AsyncInvoker<ListDeviceMessagesRequest, ListDeviceMessagesResponse> listDeviceMessagesAsyncInvoker(
        ListDeviceMessagesRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listDeviceMessages, hcClient);
    }

    /**
     * 查询指定消息id的消息
     *
     * 应用服务器可调用此接口查询平台下发给设备的指定消息id的消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceMessageRequest 请求对象
     * @return CompletableFuture<ShowDeviceMessageResponse>
     */
    public CompletableFuture<ShowDeviceMessageResponse> showDeviceMessageAsync(ShowDeviceMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showDeviceMessage);
    }

    /**
     * 查询指定消息id的消息
     *
     * 应用服务器可调用此接口查询平台下发给设备的指定消息id的消息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceMessageRequest 请求对象
     * @return AsyncInvoker<ShowDeviceMessageRequest, ShowDeviceMessageResponse>
     */
    public AsyncInvoker<ShowDeviceMessageRequest, ShowDeviceMessageResponse> showDeviceMessageAsyncInvoker(
        ShowDeviceMessageRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showDeviceMessage, hcClient);
    }

    /**
     * 创建OTA升级包
     *
     * 用户可调用此接口创建升级包关联OBS对象
     * 使用前提：使用该API需要您授权设备接入服务(IoTDA)的实例访问对象存储服务(OBS)以及 密钥管理服务(KMS Administrator)的权限。在“[[统一身份认证服务（IAM）](https://console.huaweicloud.com/iam)](tag:hws)[[统一身份认证服务（IAM）](https://console-intl.huaweicloud.com/iam)](tag:hws_hk) - 委托”中将委托名称为iotda_admin_trust的委托授权KMS Administrator和OBS OperateAccess
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOtaPackageRequest 请求对象
     * @return CompletableFuture<CreateOtaPackageResponse>
     */
    public CompletableFuture<CreateOtaPackageResponse> createOtaPackageAsync(CreateOtaPackageRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createOtaPackage);
    }

    /**
     * 创建OTA升级包
     *
     * 用户可调用此接口创建升级包关联OBS对象
     * 使用前提：使用该API需要您授权设备接入服务(IoTDA)的实例访问对象存储服务(OBS)以及 密钥管理服务(KMS Administrator)的权限。在“[[统一身份认证服务（IAM）](https://console.huaweicloud.com/iam)](tag:hws)[[统一身份认证服务（IAM）](https://console-intl.huaweicloud.com/iam)](tag:hws_hk) - 委托”中将委托名称为iotda_admin_trust的委托授权KMS Administrator和OBS OperateAccess
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOtaPackageRequest 请求对象
     * @return AsyncInvoker<CreateOtaPackageRequest, CreateOtaPackageResponse>
     */
    public AsyncInvoker<CreateOtaPackageRequest, CreateOtaPackageResponse> createOtaPackageAsyncInvoker(
        CreateOtaPackageRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.createOtaPackage, hcClient);
    }

    /**
     * 删除OTA升级包
     *
     * 用户可调用此接口删除关联OBS对象的升级包信息，不会删除OBS上对象
     * 使用前提：使用该API需要您授权设备接入服务(IoTDA)的实例访问对象存储服务(OBS)以及 密钥管理服务(KMS Administrator)的权限。在“[[统一身份认证服务（IAM）](https://console.huaweicloud.com/iam)](tag:hws)[[统一身份认证服务（IAM）](https://console-intl.huaweicloud.com/iam)](tag:hws_hk) - 委托”中将委托名称为iotda_admin_trust的委托授权KMS Administrator和OBS OperateAccess
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOtaPackageRequest 请求对象
     * @return CompletableFuture<DeleteOtaPackageResponse>
     */
    public CompletableFuture<DeleteOtaPackageResponse> deleteOtaPackageAsync(DeleteOtaPackageRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteOtaPackage);
    }

    /**
     * 删除OTA升级包
     *
     * 用户可调用此接口删除关联OBS对象的升级包信息，不会删除OBS上对象
     * 使用前提：使用该API需要您授权设备接入服务(IoTDA)的实例访问对象存储服务(OBS)以及 密钥管理服务(KMS Administrator)的权限。在“[[统一身份认证服务（IAM）](https://console.huaweicloud.com/iam)](tag:hws)[[统一身份认证服务（IAM）](https://console-intl.huaweicloud.com/iam)](tag:hws_hk) - 委托”中将委托名称为iotda_admin_trust的委托授权KMS Administrator和OBS OperateAccess
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOtaPackageRequest 请求对象
     * @return AsyncInvoker<DeleteOtaPackageRequest, DeleteOtaPackageResponse>
     */
    public AsyncInvoker<DeleteOtaPackageRequest, DeleteOtaPackageResponse> deleteOtaPackageAsyncInvoker(
        DeleteOtaPackageRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteOtaPackage, hcClient);
    }

    /**
     * 查询OTA升级包列表
     *
     * 用户可调用此接口查询关联OBS对象的升级包列表
     * 使用前提：使用该API需要您授权设备接入服务(IoTDA)的实例访问对象存储服务(OBS)以及 密钥管理服务(KMS Administrator)的权限。在“[[统一身份认证服务（IAM）](https://console.huaweicloud.com/iam)](tag:hws)[[统一身份认证服务（IAM）](https://console-intl.huaweicloud.com/iam)](tag:hws_hk) - 委托”中将委托名称为iotda_admin_trust的委托授权KMS Administrator和OBS OperateAccess
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOtaPackageInfoRequest 请求对象
     * @return CompletableFuture<ListOtaPackageInfoResponse>
     */
    public CompletableFuture<ListOtaPackageInfoResponse> listOtaPackageInfoAsync(ListOtaPackageInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listOtaPackageInfo);
    }

    /**
     * 查询OTA升级包列表
     *
     * 用户可调用此接口查询关联OBS对象的升级包列表
     * 使用前提：使用该API需要您授权设备接入服务(IoTDA)的实例访问对象存储服务(OBS)以及 密钥管理服务(KMS Administrator)的权限。在“[[统一身份认证服务（IAM）](https://console.huaweicloud.com/iam)](tag:hws)[[统一身份认证服务（IAM）](https://console-intl.huaweicloud.com/iam)](tag:hws_hk) - 委托”中将委托名称为iotda_admin_trust的委托授权KMS Administrator和OBS OperateAccess
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOtaPackageInfoRequest 请求对象
     * @return AsyncInvoker<ListOtaPackageInfoRequest, ListOtaPackageInfoResponse>
     */
    public AsyncInvoker<ListOtaPackageInfoRequest, ListOtaPackageInfoResponse> listOtaPackageInfoAsyncInvoker(
        ListOtaPackageInfoRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listOtaPackageInfo, hcClient);
    }

    /**
     * 获取OTA升级包详情
     *
     * 用户可调用此接口查询关联OBS对象的升级包详情
     * 使用前提：使用该API需要您授权设备接入服务(IoTDA)的实例访问对象存储服务(OBS)以及 密钥管理服务(KMS Administrator)的权限。在“[[统一身份认证服务（IAM）](https://console.huaweicloud.com/iam)](tag:hws)[[统一身份认证服务（IAM）](https://console-intl.huaweicloud.com/iam)](tag:hws_hk) - 委托”中将委托名称为iotda_admin_trust的委托授权KMS Administrator和OBS OperateAccess
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOtaPackageRequest 请求对象
     * @return CompletableFuture<ShowOtaPackageResponse>
     */
    public CompletableFuture<ShowOtaPackageResponse> showOtaPackageAsync(ShowOtaPackageRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showOtaPackage);
    }

    /**
     * 获取OTA升级包详情
     *
     * 用户可调用此接口查询关联OBS对象的升级包详情
     * 使用前提：使用该API需要您授权设备接入服务(IoTDA)的实例访问对象存储服务(OBS)以及 密钥管理服务(KMS Administrator)的权限。在“[[统一身份认证服务（IAM）](https://console.huaweicloud.com/iam)](tag:hws)[[统一身份认证服务（IAM）](https://console-intl.huaweicloud.com/iam)](tag:hws_hk) - 委托”中将委托名称为iotda_admin_trust的委托授权KMS Administrator和OBS OperateAccess
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOtaPackageRequest 请求对象
     * @return AsyncInvoker<ShowOtaPackageRequest, ShowOtaPackageResponse>
     */
    public AsyncInvoker<ShowOtaPackageRequest, ShowOtaPackageResponse> showOtaPackageAsyncInvoker(
        ShowOtaPackageRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showOtaPackage, hcClient);
    }

    /**
     * 绑定设备策略
     *
     * 应用服务器可调用此接口在物联网平台上为批量设备绑定目标策略，目前支持绑定目标类型为：设备、产品，当目标类型为产品时，该产品下所有设备都会生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindDevicePolicyRequest 请求对象
     * @return CompletableFuture<BindDevicePolicyResponse>
     */
    public CompletableFuture<BindDevicePolicyResponse> bindDevicePolicyAsync(BindDevicePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.bindDevicePolicy);
    }

    /**
     * 绑定设备策略
     *
     * 应用服务器可调用此接口在物联网平台上为批量设备绑定目标策略，目前支持绑定目标类型为：设备、产品，当目标类型为产品时，该产品下所有设备都会生效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindDevicePolicyRequest 请求对象
     * @return AsyncInvoker<BindDevicePolicyRequest, BindDevicePolicyResponse>
     */
    public AsyncInvoker<BindDevicePolicyRequest, BindDevicePolicyResponse> bindDevicePolicyAsyncInvoker(
        BindDevicePolicyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.bindDevicePolicy, hcClient);
    }

    /**
     * 创建设备策略
     *
     * 应用服务器可调用此接口在物联网平台创建一个策略，该策略需要绑定到设备和产品下才能生效。
     * - 一个实例最多能创建50个设备策略。
     * - 仅**标准版实例、企业版实例**支持该接口调用，基础版不支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDevicePolicyRequest 请求对象
     * @return CompletableFuture<CreateDevicePolicyResponse>
     */
    public CompletableFuture<CreateDevicePolicyResponse> createDevicePolicyAsync(CreateDevicePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createDevicePolicy);
    }

    /**
     * 创建设备策略
     *
     * 应用服务器可调用此接口在物联网平台创建一个策略，该策略需要绑定到设备和产品下才能生效。
     * - 一个实例最多能创建50个设备策略。
     * - 仅**标准版实例、企业版实例**支持该接口调用，基础版不支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDevicePolicyRequest 请求对象
     * @return AsyncInvoker<CreateDevicePolicyRequest, CreateDevicePolicyResponse>
     */
    public AsyncInvoker<CreateDevicePolicyRequest, CreateDevicePolicyResponse> createDevicePolicyAsyncInvoker(
        CreateDevicePolicyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.createDevicePolicy, hcClient);
    }

    /**
     * 删除设备策略
     *
     * 应用服务器可调用此接口在物联网平台上删除指定策略，注意：删除策略同时会解绑该策略下所有绑定对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDevicePolicyRequest 请求对象
     * @return CompletableFuture<DeleteDevicePolicyResponse>
     */
    public CompletableFuture<DeleteDevicePolicyResponse> deleteDevicePolicyAsync(DeleteDevicePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteDevicePolicy);
    }

    /**
     * 删除设备策略
     *
     * 应用服务器可调用此接口在物联网平台上删除指定策略，注意：删除策略同时会解绑该策略下所有绑定对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDevicePolicyRequest 请求对象
     * @return AsyncInvoker<DeleteDevicePolicyRequest, DeleteDevicePolicyResponse>
     */
    public AsyncInvoker<DeleteDevicePolicyRequest, DeleteDevicePolicyResponse> deleteDevicePolicyAsyncInvoker(
        DeleteDevicePolicyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteDevicePolicy, hcClient);
    }

    /**
     * 查询设备策略列表
     *
     * 应用服务器可调用此接口在物联网平台查询策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevicePoliciesRequest 请求对象
     * @return CompletableFuture<ListDevicePoliciesResponse>
     */
    public CompletableFuture<ListDevicePoliciesResponse> listDevicePoliciesAsync(ListDevicePoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listDevicePolicies);
    }

    /**
     * 查询设备策略列表
     *
     * 应用服务器可调用此接口在物联网平台查询策略列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevicePoliciesRequest 请求对象
     * @return AsyncInvoker<ListDevicePoliciesRequest, ListDevicePoliciesResponse>
     */
    public AsyncInvoker<ListDevicePoliciesRequest, ListDevicePoliciesResponse> listDevicePoliciesAsyncInvoker(
        ListDevicePoliciesRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listDevicePolicies, hcClient);
    }

    /**
     * 查询设备策略详情
     *
     * 应用服务器可调用此接口在物联网平台查询指定策略ID的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDevicePolicyRequest 请求对象
     * @return CompletableFuture<ShowDevicePolicyResponse>
     */
    public CompletableFuture<ShowDevicePolicyResponse> showDevicePolicyAsync(ShowDevicePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showDevicePolicy);
    }

    /**
     * 查询设备策略详情
     *
     * 应用服务器可调用此接口在物联网平台查询指定策略ID的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDevicePolicyRequest 请求对象
     * @return AsyncInvoker<ShowDevicePolicyRequest, ShowDevicePolicyResponse>
     */
    public AsyncInvoker<ShowDevicePolicyRequest, ShowDevicePolicyResponse> showDevicePolicyAsyncInvoker(
        ShowDevicePolicyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showDevicePolicy, hcClient);
    }

    /**
     * 查询设备策略绑定的目标列表
     *
     * 应用服务器可调用此接口在物联网平台上查询指定策略ID下绑定的目标列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTargetsInDevicePolicyRequest 请求对象
     * @return CompletableFuture<ShowTargetsInDevicePolicyResponse>
     */
    public CompletableFuture<ShowTargetsInDevicePolicyResponse> showTargetsInDevicePolicyAsync(
        ShowTargetsInDevicePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showTargetsInDevicePolicy);
    }

    /**
     * 查询设备策略绑定的目标列表
     *
     * 应用服务器可调用此接口在物联网平台上查询指定策略ID下绑定的目标列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTargetsInDevicePolicyRequest 请求对象
     * @return AsyncInvoker<ShowTargetsInDevicePolicyRequest, ShowTargetsInDevicePolicyResponse>
     */
    public AsyncInvoker<ShowTargetsInDevicePolicyRequest, ShowTargetsInDevicePolicyResponse> showTargetsInDevicePolicyAsyncInvoker(
        ShowTargetsInDevicePolicyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showTargetsInDevicePolicy, hcClient);
    }

    /**
     * 解绑设备策略
     *
     * 应用服务器可调用此接口在物联网平台上解除指定策略下绑定的目标对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindDevicePolicyRequest 请求对象
     * @return CompletableFuture<UnbindDevicePolicyResponse>
     */
    public CompletableFuture<UnbindDevicePolicyResponse> unbindDevicePolicyAsync(UnbindDevicePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.unbindDevicePolicy);
    }

    /**
     * 解绑设备策略
     *
     * 应用服务器可调用此接口在物联网平台上解除指定策略下绑定的目标对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindDevicePolicyRequest 请求对象
     * @return AsyncInvoker<UnbindDevicePolicyRequest, UnbindDevicePolicyResponse>
     */
    public AsyncInvoker<UnbindDevicePolicyRequest, UnbindDevicePolicyResponse> unbindDevicePolicyAsyncInvoker(
        UnbindDevicePolicyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.unbindDevicePolicy, hcClient);
    }

    /**
     * 更新设备策略信息
     *
     * 应用服务器可调用此接口在物联网平台更新策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDevicePolicyRequest 请求对象
     * @return CompletableFuture<UpdateDevicePolicyResponse>
     */
    public CompletableFuture<UpdateDevicePolicyResponse> updateDevicePolicyAsync(UpdateDevicePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateDevicePolicy);
    }

    /**
     * 更新设备策略信息
     *
     * 应用服务器可调用此接口在物联网平台更新策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDevicePolicyRequest 请求对象
     * @return AsyncInvoker<UpdateDevicePolicyRequest, UpdateDevicePolicyResponse>
     */
    public AsyncInvoker<UpdateDevicePolicyRequest, UpdateDevicePolicyResponse> updateDevicePolicyAsyncInvoker(
        UpdateDevicePolicyRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.updateDevicePolicy, hcClient);
    }

    /**
     * 创建产品
     *
     * 应用服务器可调用此接口创建产品。此接口仅创建了产品，没有创建和安装插件，如果需要对数据进行编解码，还需要在平台开发和安装插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProductRequest 请求对象
     * @return CompletableFuture<CreateProductResponse>
     */
    public CompletableFuture<CreateProductResponse> createProductAsync(CreateProductRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createProduct);
    }

    /**
     * 创建产品
     *
     * 应用服务器可调用此接口创建产品。此接口仅创建了产品，没有创建和安装插件，如果需要对数据进行编解码，还需要在平台开发和安装插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProductRequest 请求对象
     * @return AsyncInvoker<CreateProductRequest, CreateProductResponse>
     */
    public AsyncInvoker<CreateProductRequest, CreateProductResponse> createProductAsyncInvoker(
        CreateProductRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.createProduct, hcClient);
    }

    /**
     * 删除产品
     *
     * 应用服务器可调用此接口删除已导入物联网平台的指定产品模型。此接口仅删除了产品，未删除关联的插件，在产品下存在设备时，该产品不允许删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProductRequest 请求对象
     * @return CompletableFuture<DeleteProductResponse>
     */
    public CompletableFuture<DeleteProductResponse> deleteProductAsync(DeleteProductRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteProduct);
    }

    /**
     * 删除产品
     *
     * 应用服务器可调用此接口删除已导入物联网平台的指定产品模型。此接口仅删除了产品，未删除关联的插件，在产品下存在设备时，该产品不允许删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProductRequest 请求对象
     * @return AsyncInvoker<DeleteProductRequest, DeleteProductResponse>
     */
    public AsyncInvoker<DeleteProductRequest, DeleteProductResponse> deleteProductAsyncInvoker(
        DeleteProductRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteProduct, hcClient);
    }

    /**
     * 查询产品列表
     *
     * 应用服务器可调用此接口查询已导入物联网平台的产品模型信息列表，了解产品模型的概要信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductsRequest 请求对象
     * @return CompletableFuture<ListProductsResponse>
     */
    public CompletableFuture<ListProductsResponse> listProductsAsync(ListProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listProducts);
    }

    /**
     * 查询产品列表
     *
     * 应用服务器可调用此接口查询已导入物联网平台的产品模型信息列表，了解产品模型的概要信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductsRequest 请求对象
     * @return AsyncInvoker<ListProductsRequest, ListProductsResponse>
     */
    public AsyncInvoker<ListProductsRequest, ListProductsResponse> listProductsAsyncInvoker(
        ListProductsRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listProducts, hcClient);
    }

    /**
     * 查询产品
     *
     * 应用服务器可调用此接口查询已导入物联网平台的指定产品模型详细信息，包括产品模型的服务、属性、命令等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProductRequest 请求对象
     * @return CompletableFuture<ShowProductResponse>
     */
    public CompletableFuture<ShowProductResponse> showProductAsync(ShowProductRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showProduct);
    }

    /**
     * 查询产品
     *
     * 应用服务器可调用此接口查询已导入物联网平台的指定产品模型详细信息，包括产品模型的服务、属性、命令等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProductRequest 请求对象
     * @return AsyncInvoker<ShowProductRequest, ShowProductResponse>
     */
    public AsyncInvoker<ShowProductRequest, ShowProductResponse> showProductAsyncInvoker(ShowProductRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showProduct, hcClient);
    }

    /**
     * 修改产品
     *
     * 应用服务器可调用此接口修改已导入物联网平台的指定产品模型，包括产品模型的服务、属性、命令等。此接口仅修改了产品，未修改和安装插件，如果修改了产品中的service定义，且在平台中有对应的插件，请修改并重新安装插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProductRequest 请求对象
     * @return CompletableFuture<UpdateProductResponse>
     */
    public CompletableFuture<UpdateProductResponse> updateProductAsync(UpdateProductRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateProduct);
    }

    /**
     * 修改产品
     *
     * 应用服务器可调用此接口修改已导入物联网平台的指定产品模型，包括产品模型的服务、属性、命令等。此接口仅修改了产品，未修改和安装插件，如果修改了产品中的service定义，且在平台中有对应的插件，请修改并重新安装插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProductRequest 请求对象
     * @return AsyncInvoker<UpdateProductRequest, UpdateProductResponse>
     */
    public AsyncInvoker<UpdateProductRequest, UpdateProductResponse> updateProductAsyncInvoker(
        UpdateProductRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.updateProduct, hcClient);
    }

    /**
     * 查询设备属性
     *
     * 设备的产品模型中定义了物联网平台可向设备下发的属性，应用服务器可调用此接口向设备发送指令用以查询设备的实时属性, 并由设备将属性查询的结果同步返回给应用服务器。
     * 注意：此接口适用于MQTT设备，暂不支持NB-IoT设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPropertiesRequest 请求对象
     * @return CompletableFuture<ListPropertiesResponse>
     */
    public CompletableFuture<ListPropertiesResponse> listPropertiesAsync(ListPropertiesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listProperties);
    }

    /**
     * 查询设备属性
     *
     * 设备的产品模型中定义了物联网平台可向设备下发的属性，应用服务器可调用此接口向设备发送指令用以查询设备的实时属性, 并由设备将属性查询的结果同步返回给应用服务器。
     * 注意：此接口适用于MQTT设备，暂不支持NB-IoT设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPropertiesRequest 请求对象
     * @return AsyncInvoker<ListPropertiesRequest, ListPropertiesResponse>
     */
    public AsyncInvoker<ListPropertiesRequest, ListPropertiesResponse> listPropertiesAsyncInvoker(
        ListPropertiesRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listProperties, hcClient);
    }

    /**
     * 修改设备属性
     *
     * 设备的产品模型中定义了物联网平台可向设备下发的属性，应用服务器可调用此接口向指定设备下发属性。平台负责将属性以同步方式发送给设备，并将设备执行属性结果同步返回。
     * 注意：此接口适用于MQTT设备，暂不支持NB-IoT设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePropertiesRequest 请求对象
     * @return CompletableFuture<UpdatePropertiesResponse>
     */
    public CompletableFuture<UpdatePropertiesResponse> updatePropertiesAsync(UpdatePropertiesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateProperties);
    }

    /**
     * 修改设备属性
     *
     * 设备的产品模型中定义了物联网平台可向设备下发的属性，应用服务器可调用此接口向指定设备下发属性。平台负责将属性以同步方式发送给设备，并将设备执行属性结果同步返回。
     * 注意：此接口适用于MQTT设备，暂不支持NB-IoT设备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePropertiesRequest 请求对象
     * @return AsyncInvoker<UpdatePropertiesRequest, UpdatePropertiesResponse>
     */
    public AsyncInvoker<UpdatePropertiesRequest, UpdatePropertiesResponse> updatePropertiesAsyncInvoker(
        UpdatePropertiesRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.updateProperties, hcClient);
    }

    /**
     * 创建预调配模板
     *
     * 应用服务器可调用此接口在物联网平台创建一个预调配模板。用户的设备未在平台注册时，可以通过预调配模板在设备首次接入物联网平台时将设备信息自动注册到物联网平台。
     * - 该预调配模板至少需要绑定到一个设备CA证书下才能生效。
     * - 一个实例最多可有10个预调配模板。
     * - 仅标准版实例、企业版实例支持该接口调用，基础版不支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProvisioningTemplateRequest 请求对象
     * @return CompletableFuture<CreateProvisioningTemplateResponse>
     */
    public CompletableFuture<CreateProvisioningTemplateResponse> createProvisioningTemplateAsync(
        CreateProvisioningTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createProvisioningTemplate);
    }

    /**
     * 创建预调配模板
     *
     * 应用服务器可调用此接口在物联网平台创建一个预调配模板。用户的设备未在平台注册时，可以通过预调配模板在设备首次接入物联网平台时将设备信息自动注册到物联网平台。
     * - 该预调配模板至少需要绑定到一个设备CA证书下才能生效。
     * - 一个实例最多可有10个预调配模板。
     * - 仅标准版实例、企业版实例支持该接口调用，基础版不支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProvisioningTemplateRequest 请求对象
     * @return AsyncInvoker<CreateProvisioningTemplateRequest, CreateProvisioningTemplateResponse>
     */
    public AsyncInvoker<CreateProvisioningTemplateRequest, CreateProvisioningTemplateResponse> createProvisioningTemplateAsyncInvoker(
        CreateProvisioningTemplateRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.createProvisioningTemplate, hcClient);
    }

    /**
     * 删除预调配模板
     *
     * 应用服务器可调用此接口在物联网平台上删除指定预调配模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProvisioningTemplateRequest 请求对象
     * @return CompletableFuture<DeleteProvisioningTemplateResponse>
     */
    public CompletableFuture<DeleteProvisioningTemplateResponse> deleteProvisioningTemplateAsync(
        DeleteProvisioningTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteProvisioningTemplate);
    }

    /**
     * 删除预调配模板
     *
     * 应用服务器可调用此接口在物联网平台上删除指定预调配模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProvisioningTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteProvisioningTemplateRequest, DeleteProvisioningTemplateResponse>
     */
    public AsyncInvoker<DeleteProvisioningTemplateRequest, DeleteProvisioningTemplateResponse> deleteProvisioningTemplateAsyncInvoker(
        DeleteProvisioningTemplateRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteProvisioningTemplate, hcClient);
    }

    /**
     * 查询预调配模板列表
     *
     * 应用服务器可调用此接口在物联网平台查询预调配模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProvisioningTemplatesRequest 请求对象
     * @return CompletableFuture<ListProvisioningTemplatesResponse>
     */
    public CompletableFuture<ListProvisioningTemplatesResponse> listProvisioningTemplatesAsync(
        ListProvisioningTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listProvisioningTemplates);
    }

    /**
     * 查询预调配模板列表
     *
     * 应用服务器可调用此接口在物联网平台查询预调配模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProvisioningTemplatesRequest 请求对象
     * @return AsyncInvoker<ListProvisioningTemplatesRequest, ListProvisioningTemplatesResponse>
     */
    public AsyncInvoker<ListProvisioningTemplatesRequest, ListProvisioningTemplatesResponse> listProvisioningTemplatesAsyncInvoker(
        ListProvisioningTemplatesRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listProvisioningTemplates, hcClient);
    }

    /**
     * 查询预调配模板详情
     *
     * 应用服务器可调用此接口在物联网平台查询指定预调配模板ID的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProvisioningTemplateRequest 请求对象
     * @return CompletableFuture<ShowProvisioningTemplateResponse>
     */
    public CompletableFuture<ShowProvisioningTemplateResponse> showProvisioningTemplateAsync(
        ShowProvisioningTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showProvisioningTemplate);
    }

    /**
     * 查询预调配模板详情
     *
     * 应用服务器可调用此接口在物联网平台查询指定预调配模板ID的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProvisioningTemplateRequest 请求对象
     * @return AsyncInvoker<ShowProvisioningTemplateRequest, ShowProvisioningTemplateResponse>
     */
    public AsyncInvoker<ShowProvisioningTemplateRequest, ShowProvisioningTemplateResponse> showProvisioningTemplateAsyncInvoker(
        ShowProvisioningTemplateRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showProvisioningTemplate, hcClient);
    }

    /**
     * 更新指定id的预调配模板信息
     *
     * 应用服务器可调用此接口在物联网平台更新指定id的预调配模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProvisioningTemplateRequest 请求对象
     * @return CompletableFuture<UpdateProvisioningTemplateResponse>
     */
    public CompletableFuture<UpdateProvisioningTemplateResponse> updateProvisioningTemplateAsync(
        UpdateProvisioningTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateProvisioningTemplate);
    }

    /**
     * 更新指定id的预调配模板信息
     *
     * 应用服务器可调用此接口在物联网平台更新指定id的预调配模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProvisioningTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateProvisioningTemplateRequest, UpdateProvisioningTemplateResponse>
     */
    public AsyncInvoker<UpdateProvisioningTemplateRequest, UpdateProvisioningTemplateResponse> updateProvisioningTemplateAsyncInvoker(
        UpdateProvisioningTemplateRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.updateProvisioningTemplate, hcClient);
    }

    /**
     * 创建规则触发条件
     *
     * 应用服务器可调用此接口在物联网平台创建一条规则触发条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRoutingRuleRequest 请求对象
     * @return CompletableFuture<CreateRoutingRuleResponse>
     */
    public CompletableFuture<CreateRoutingRuleResponse> createRoutingRuleAsync(CreateRoutingRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createRoutingRule);
    }

    /**
     * 创建规则触发条件
     *
     * 应用服务器可调用此接口在物联网平台创建一条规则触发条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRoutingRuleRequest 请求对象
     * @return AsyncInvoker<CreateRoutingRuleRequest, CreateRoutingRuleResponse>
     */
    public AsyncInvoker<CreateRoutingRuleRequest, CreateRoutingRuleResponse> createRoutingRuleAsyncInvoker(
        CreateRoutingRuleRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.createRoutingRule, hcClient);
    }

    /**
     * 创建规则动作
     *
     * 应用服务器可调用此接口在物联网平台创建一条规则动作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRuleActionRequest 请求对象
     * @return CompletableFuture<CreateRuleActionResponse>
     */
    public CompletableFuture<CreateRuleActionResponse> createRuleActionAsync(CreateRuleActionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createRuleAction);
    }

    /**
     * 创建规则动作
     *
     * 应用服务器可调用此接口在物联网平台创建一条规则动作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRuleActionRequest 请求对象
     * @return AsyncInvoker<CreateRuleActionRequest, CreateRuleActionResponse>
     */
    public AsyncInvoker<CreateRuleActionRequest, CreateRuleActionResponse> createRuleActionAsyncInvoker(
        CreateRuleActionRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.createRuleAction, hcClient);
    }

    /**
     * 删除规则触发条件
     *
     * 应用服务器可调用此接口删除物联网平台中的指定规则条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRoutingRuleRequest 请求对象
     * @return CompletableFuture<DeleteRoutingRuleResponse>
     */
    public CompletableFuture<DeleteRoutingRuleResponse> deleteRoutingRuleAsync(DeleteRoutingRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteRoutingRule);
    }

    /**
     * 删除规则触发条件
     *
     * 应用服务器可调用此接口删除物联网平台中的指定规则条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRoutingRuleRequest 请求对象
     * @return AsyncInvoker<DeleteRoutingRuleRequest, DeleteRoutingRuleResponse>
     */
    public AsyncInvoker<DeleteRoutingRuleRequest, DeleteRoutingRuleResponse> deleteRoutingRuleAsyncInvoker(
        DeleteRoutingRuleRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteRoutingRule, hcClient);
    }

    /**
     * 删除规则动作
     *
     * 应用服务器可调用此接口删除物联网平台中的指定规则动作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleActionRequest 请求对象
     * @return CompletableFuture<DeleteRuleActionResponse>
     */
    public CompletableFuture<DeleteRuleActionResponse> deleteRuleActionAsync(DeleteRuleActionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteRuleAction);
    }

    /**
     * 删除规则动作
     *
     * 应用服务器可调用此接口删除物联网平台中的指定规则动作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleActionRequest 请求对象
     * @return AsyncInvoker<DeleteRuleActionRequest, DeleteRuleActionResponse>
     */
    public AsyncInvoker<DeleteRuleActionRequest, DeleteRuleActionResponse> deleteRuleActionAsyncInvoker(
        DeleteRuleActionRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteRuleAction, hcClient);
    }

    /**
     * 查询规则条件列表
     *
     * 应用服务器可调用此接口查询物联网平台中设置的规则条件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRoutingRulesRequest 请求对象
     * @return CompletableFuture<ListRoutingRulesResponse>
     */
    public CompletableFuture<ListRoutingRulesResponse> listRoutingRulesAsync(ListRoutingRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listRoutingRules);
    }

    /**
     * 查询规则条件列表
     *
     * 应用服务器可调用此接口查询物联网平台中设置的规则条件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRoutingRulesRequest 请求对象
     * @return AsyncInvoker<ListRoutingRulesRequest, ListRoutingRulesResponse>
     */
    public AsyncInvoker<ListRoutingRulesRequest, ListRoutingRulesResponse> listRoutingRulesAsyncInvoker(
        ListRoutingRulesRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listRoutingRules, hcClient);
    }

    /**
     * 查询规则动作列表
     *
     * 应用服务器可调用此接口查询物联网平台中设置的规则动作列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuleActionsRequest 请求对象
     * @return CompletableFuture<ListRuleActionsResponse>
     */
    public CompletableFuture<ListRuleActionsResponse> listRuleActionsAsync(ListRuleActionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listRuleActions);
    }

    /**
     * 查询规则动作列表
     *
     * 应用服务器可调用此接口查询物联网平台中设置的规则动作列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuleActionsRequest 请求对象
     * @return AsyncInvoker<ListRuleActionsRequest, ListRuleActionsResponse>
     */
    public AsyncInvoker<ListRuleActionsRequest, ListRuleActionsResponse> listRuleActionsAsyncInvoker(
        ListRuleActionsRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listRuleActions, hcClient);
    }

    /**
     * 查询规则条件
     *
     * 应用服务器可调用此接口查询物联网平台中指定规则条件的配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRoutingRuleRequest 请求对象
     * @return CompletableFuture<ShowRoutingRuleResponse>
     */
    public CompletableFuture<ShowRoutingRuleResponse> showRoutingRuleAsync(ShowRoutingRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showRoutingRule);
    }

    /**
     * 查询规则条件
     *
     * 应用服务器可调用此接口查询物联网平台中指定规则条件的配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRoutingRuleRequest 请求对象
     * @return AsyncInvoker<ShowRoutingRuleRequest, ShowRoutingRuleResponse>
     */
    public AsyncInvoker<ShowRoutingRuleRequest, ShowRoutingRuleResponse> showRoutingRuleAsyncInvoker(
        ShowRoutingRuleRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showRoutingRule, hcClient);
    }

    /**
     * 查询规则动作
     *
     * 应用服务器可调用此接口查询物联网平台中指定规则动作的配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRuleActionRequest 请求对象
     * @return CompletableFuture<ShowRuleActionResponse>
     */
    public CompletableFuture<ShowRuleActionResponse> showRuleActionAsync(ShowRuleActionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showRuleAction);
    }

    /**
     * 查询规则动作
     *
     * 应用服务器可调用此接口查询物联网平台中指定规则动作的配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRuleActionRequest 请求对象
     * @return AsyncInvoker<ShowRuleActionRequest, ShowRuleActionResponse>
     */
    public AsyncInvoker<ShowRuleActionRequest, ShowRuleActionResponse> showRuleActionAsyncInvoker(
        ShowRuleActionRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showRuleAction, hcClient);
    }

    /**
     * 修改规则触发条件
     *
     * 应用服务器可调用此接口修改物联网平台中指定规则条件的配置参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRoutingRuleRequest 请求对象
     * @return CompletableFuture<UpdateRoutingRuleResponse>
     */
    public CompletableFuture<UpdateRoutingRuleResponse> updateRoutingRuleAsync(UpdateRoutingRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateRoutingRule);
    }

    /**
     * 修改规则触发条件
     *
     * 应用服务器可调用此接口修改物联网平台中指定规则条件的配置参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRoutingRuleRequest 请求对象
     * @return AsyncInvoker<UpdateRoutingRuleRequest, UpdateRoutingRuleResponse>
     */
    public AsyncInvoker<UpdateRoutingRuleRequest, UpdateRoutingRuleResponse> updateRoutingRuleAsyncInvoker(
        UpdateRoutingRuleRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.updateRoutingRule, hcClient);
    }

    /**
     * 修改规则动作
     *
     * 应用服务器可调用此接口修改物联网平台中指定规则动作的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRuleActionRequest 请求对象
     * @return CompletableFuture<UpdateRuleActionResponse>
     */
    public CompletableFuture<UpdateRuleActionResponse> updateRuleActionAsync(UpdateRuleActionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateRuleAction);
    }

    /**
     * 修改规则动作
     *
     * 应用服务器可调用此接口修改物联网平台中指定规则动作的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRuleActionRequest 请求对象
     * @return AsyncInvoker<UpdateRuleActionRequest, UpdateRuleActionResponse>
     */
    public AsyncInvoker<UpdateRuleActionRequest, UpdateRuleActionResponse> updateRuleActionAsyncInvoker(
        UpdateRuleActionRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.updateRuleAction, hcClient);
    }

    /**
     * 修改规则状态
     *
     * 应用服务器可调用此接口修改物联网平台中指定规则的状态，激活或者去激活规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeRuleStatusRequest 请求对象
     * @return CompletableFuture<ChangeRuleStatusResponse>
     */
    public CompletableFuture<ChangeRuleStatusResponse> changeRuleStatusAsync(ChangeRuleStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.changeRuleStatus);
    }

    /**
     * 修改规则状态
     *
     * 应用服务器可调用此接口修改物联网平台中指定规则的状态，激活或者去激活规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeRuleStatusRequest 请求对象
     * @return AsyncInvoker<ChangeRuleStatusRequest, ChangeRuleStatusResponse>
     */
    public AsyncInvoker<ChangeRuleStatusRequest, ChangeRuleStatusResponse> changeRuleStatusAsyncInvoker(
        ChangeRuleStatusRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.changeRuleStatus, hcClient);
    }

    /**
     * 创建规则
     *
     * 应用服务器可调用此接口在物联网平台创建一条规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRuleRequest 请求对象
     * @return CompletableFuture<CreateRuleResponse>
     */
    public CompletableFuture<CreateRuleResponse> createRuleAsync(CreateRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createRule);
    }

    /**
     * 创建规则
     *
     * 应用服务器可调用此接口在物联网平台创建一条规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRuleRequest 请求对象
     * @return AsyncInvoker<CreateRuleRequest, CreateRuleResponse>
     */
    public AsyncInvoker<CreateRuleRequest, CreateRuleResponse> createRuleAsyncInvoker(CreateRuleRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.createRule, hcClient);
    }

    /**
     * 删除规则
     *
     * 应用服务器可调用此接口删除物联网平台中的指定规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleRequest 请求对象
     * @return CompletableFuture<DeleteRuleResponse>
     */
    public CompletableFuture<DeleteRuleResponse> deleteRuleAsync(DeleteRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteRule);
    }

    /**
     * 删除规则
     *
     * 应用服务器可调用此接口删除物联网平台中的指定规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleRequest 请求对象
     * @return AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse>
     */
    public AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse> deleteRuleAsyncInvoker(DeleteRuleRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteRule, hcClient);
    }

    /**
     * 查询规则列表
     *
     * 应用服务器可调用此接口查询物联网平台中设置的规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRulesRequest 请求对象
     * @return CompletableFuture<ListRulesResponse>
     */
    public CompletableFuture<ListRulesResponse> listRulesAsync(ListRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listRules);
    }

    /**
     * 查询规则列表
     *
     * 应用服务器可调用此接口查询物联网平台中设置的规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRulesRequest 请求对象
     * @return AsyncInvoker<ListRulesRequest, ListRulesResponse>
     */
    public AsyncInvoker<ListRulesRequest, ListRulesResponse> listRulesAsyncInvoker(ListRulesRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listRules, hcClient);
    }

    /**
     * 查询规则
     *
     * 应用服务器可调用此接口查询物联网平台中指定规则的配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRuleRequest 请求对象
     * @return CompletableFuture<ShowRuleResponse>
     */
    public CompletableFuture<ShowRuleResponse> showRuleAsync(ShowRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showRule);
    }

    /**
     * 查询规则
     *
     * 应用服务器可调用此接口查询物联网平台中指定规则的配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRuleRequest 请求对象
     * @return AsyncInvoker<ShowRuleRequest, ShowRuleResponse>
     */
    public AsyncInvoker<ShowRuleRequest, ShowRuleResponse> showRuleAsyncInvoker(ShowRuleRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showRule, hcClient);
    }

    /**
     * 修改规则
     *
     * 应用服务器可调用此接口修改物联网平台中指定规则的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRuleRequest 请求对象
     * @return CompletableFuture<UpdateRuleResponse>
     */
    public CompletableFuture<UpdateRuleResponse> updateRuleAsync(UpdateRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateRule);
    }

    /**
     * 修改规则
     *
     * 应用服务器可调用此接口修改物联网平台中指定规则的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRuleRequest 请求对象
     * @return AsyncInvoker<UpdateRuleRequest, UpdateRuleResponse>
     */
    public AsyncInvoker<UpdateRuleRequest, UpdateRuleResponse> updateRuleAsyncInvoker(UpdateRuleRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.updateRule, hcClient);
    }

    /**
     * 按标签查询资源
     *
     * 应用服务器可调用此接口查询绑定了指定标签的资源。当前支持标签的资源有Device(设备)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesByTagsRequest 请求对象
     * @return CompletableFuture<ListResourcesByTagsResponse>
     */
    public CompletableFuture<ListResourcesByTagsResponse> listResourcesByTagsAsync(ListResourcesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listResourcesByTags);
    }

    /**
     * 按标签查询资源
     *
     * 应用服务器可调用此接口查询绑定了指定标签的资源。当前支持标签的资源有Device(设备)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcesByTagsRequest 请求对象
     * @return AsyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse>
     */
    public AsyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse> listResourcesByTagsAsyncInvoker(
        ListResourcesByTagsRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listResourcesByTags, hcClient);
    }

    /**
     * 绑定标签
     *
     * 应用服务器可调用此接口为指定资源绑定标签。当前支持标签的资源有Device(设备)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagDeviceRequest 请求对象
     * @return CompletableFuture<TagDeviceResponse>
     */
    public CompletableFuture<TagDeviceResponse> tagDeviceAsync(TagDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.tagDevice);
    }

    /**
     * 绑定标签
     *
     * 应用服务器可调用此接口为指定资源绑定标签。当前支持标签的资源有Device(设备)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagDeviceRequest 请求对象
     * @return AsyncInvoker<TagDeviceRequest, TagDeviceResponse>
     */
    public AsyncInvoker<TagDeviceRequest, TagDeviceResponse> tagDeviceAsyncInvoker(TagDeviceRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.tagDevice, hcClient);
    }

    /**
     * 解绑标签
     *
     * 应用服务器可调用此接口为指定资源解绑标签。当前支持标签的资源有Device(设备)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UntagDeviceRequest 请求对象
     * @return CompletableFuture<UntagDeviceResponse>
     */
    public CompletableFuture<UntagDeviceResponse> untagDeviceAsync(UntagDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.untagDevice);
    }

    /**
     * 解绑标签
     *
     * 应用服务器可调用此接口为指定资源解绑标签。当前支持标签的资源有Device(设备)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UntagDeviceRequest 请求对象
     * @return AsyncInvoker<UntagDeviceRequest, UntagDeviceResponse>
     */
    public AsyncInvoker<UntagDeviceRequest, UntagDeviceResponse> untagDeviceAsyncInvoker(UntagDeviceRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.untagDevice, hcClient);
    }

    /**
     * 创建设备隧道
     *
     * 用户可以通过该接口创建隧道（WebSocket协议），应用服务器和设备可以通过该隧道进行数据传输。
     * 
     * - 该API接口在基础版不支持。
     * - 该API调用后平台会向对应的MQTT/MQTTS设备下发隧道地址及密钥，同时给应用服务器也返回隧道地址及密钥，设备可以通过该地址及密钥创建WebSocket协议连接。
     * - 一个设备无法创建多个隧道。
     * - 具体应用可见“设备远程登录”功能，请参见[[设备远程登录](https://support.huaweicloud.com/usermanual-iothub/iot_01_00301.html)](tag:hws)[[设备远程登录](https://support.huaweicloud.com/intl/zh-cn/usermanual-iothub/iot_01_00301.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTunnelRequest 请求对象
     * @return CompletableFuture<AddTunnelResponse>
     */
    public CompletableFuture<AddTunnelResponse> addTunnelAsync(AddTunnelRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.addTunnel);
    }

    /**
     * 创建设备隧道
     *
     * 用户可以通过该接口创建隧道（WebSocket协议），应用服务器和设备可以通过该隧道进行数据传输。
     * 
     * - 该API接口在基础版不支持。
     * - 该API调用后平台会向对应的MQTT/MQTTS设备下发隧道地址及密钥，同时给应用服务器也返回隧道地址及密钥，设备可以通过该地址及密钥创建WebSocket协议连接。
     * - 一个设备无法创建多个隧道。
     * - 具体应用可见“设备远程登录”功能，请参见[[设备远程登录](https://support.huaweicloud.com/usermanual-iothub/iot_01_00301.html)](tag:hws)[[设备远程登录](https://support.huaweicloud.com/intl/zh-cn/usermanual-iothub/iot_01_00301.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTunnelRequest 请求对象
     * @return AsyncInvoker<AddTunnelRequest, AddTunnelResponse>
     */
    public AsyncInvoker<AddTunnelRequest, AddTunnelResponse> addTunnelAsyncInvoker(AddTunnelRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.addTunnel, hcClient);
    }

    /**
     * 关闭设备隧道
     *
     * 应用服务器可通过该接口关闭某个设备隧道。关闭后可以再次连接。
     * - 该API接口在基础版不支持。
     * - 具体应用可见“设备远程登录”功能，请参见[[设备远程登录](https://support.huaweicloud.com/usermanual-iothub/iot_01_00301.html)](tag:hws)[[设备远程登录](https://support.huaweicloud.com/intl/zh-cn/usermanual-iothub/iot_01_00301.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CloseDeviceTunnelRequest 请求对象
     * @return CompletableFuture<CloseDeviceTunnelResponse>
     */
    public CompletableFuture<CloseDeviceTunnelResponse> closeDeviceTunnelAsync(CloseDeviceTunnelRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.closeDeviceTunnel);
    }

    /**
     * 关闭设备隧道
     *
     * 应用服务器可通过该接口关闭某个设备隧道。关闭后可以再次连接。
     * - 该API接口在基础版不支持。
     * - 具体应用可见“设备远程登录”功能，请参见[[设备远程登录](https://support.huaweicloud.com/usermanual-iothub/iot_01_00301.html)](tag:hws)[[设备远程登录](https://support.huaweicloud.com/intl/zh-cn/usermanual-iothub/iot_01_00301.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CloseDeviceTunnelRequest 请求对象
     * @return AsyncInvoker<CloseDeviceTunnelRequest, CloseDeviceTunnelResponse>
     */
    public AsyncInvoker<CloseDeviceTunnelRequest, CloseDeviceTunnelResponse> closeDeviceTunnelAsyncInvoker(
        CloseDeviceTunnelRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.closeDeviceTunnel, hcClient);
    }

    /**
     * 删除设备隧道
     *
     * 用户可通过该接口删除某个设备隧道。删除后该通道不存在，无法再次连接。
     * - 该API接口在基础版不支持。
     * - 具体应用可见“设备远程登录”功能，请参见[[设备远程登录](https://support.huaweicloud.com/usermanual-iothub/iot_01_00301.html)](tag:hws)[[设备远程登录](https://support.huaweicloud.com/intl/zh-cn/usermanual-iothub/iot_01_00301.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceTunnelRequest 请求对象
     * @return CompletableFuture<DeleteDeviceTunnelResponse>
     */
    public CompletableFuture<DeleteDeviceTunnelResponse> deleteDeviceTunnelAsync(DeleteDeviceTunnelRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteDeviceTunnel);
    }

    /**
     * 删除设备隧道
     *
     * 用户可通过该接口删除某个设备隧道。删除后该通道不存在，无法再次连接。
     * - 该API接口在基础版不支持。
     * - 具体应用可见“设备远程登录”功能，请参见[[设备远程登录](https://support.huaweicloud.com/usermanual-iothub/iot_01_00301.html)](tag:hws)[[设备远程登录](https://support.huaweicloud.com/intl/zh-cn/usermanual-iothub/iot_01_00301.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeviceTunnelRequest 请求对象
     * @return AsyncInvoker<DeleteDeviceTunnelRequest, DeleteDeviceTunnelResponse>
     */
    public AsyncInvoker<DeleteDeviceTunnelRequest, DeleteDeviceTunnelResponse> deleteDeviceTunnelAsyncInvoker(
        DeleteDeviceTunnelRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.deleteDeviceTunnel, hcClient);
    }

    /**
     * 查询设备所有隧道
     *
     * 用户可通过该接口查询某项目下的所有设备隧道，以实现对设备管理。应用服务器可通过此接口向平台查询设备隧道建立的情况。
     * - 该API接口在基础版不支持。
     * - 具体应用可见“设备远程登录”功能，请参见[[设备远程登录](https://support.huaweicloud.com/usermanual-iothub/iot_01_00301.html)](tag:hws)[[设备远程登录](https://support.huaweicloud.com/intl/zh-cn/usermanual-iothub/iot_01_00301.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeviceTunnelsRequest 请求对象
     * @return CompletableFuture<ListDeviceTunnelsResponse>
     */
    public CompletableFuture<ListDeviceTunnelsResponse> listDeviceTunnelsAsync(ListDeviceTunnelsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listDeviceTunnels);
    }

    /**
     * 查询设备所有隧道
     *
     * 用户可通过该接口查询某项目下的所有设备隧道，以实现对设备管理。应用服务器可通过此接口向平台查询设备隧道建立的情况。
     * - 该API接口在基础版不支持。
     * - 具体应用可见“设备远程登录”功能，请参见[[设备远程登录](https://support.huaweicloud.com/usermanual-iothub/iot_01_00301.html)](tag:hws)[[设备远程登录](https://support.huaweicloud.com/intl/zh-cn/usermanual-iothub/iot_01_00301.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeviceTunnelsRequest 请求对象
     * @return AsyncInvoker<ListDeviceTunnelsRequest, ListDeviceTunnelsResponse>
     */
    public AsyncInvoker<ListDeviceTunnelsRequest, ListDeviceTunnelsResponse> listDeviceTunnelsAsyncInvoker(
        ListDeviceTunnelsRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.listDeviceTunnels, hcClient);
    }

    /**
     * 查询设备隧道
     *
     * 用户可通过该接口查询某项目中的某个设备隧道，查看该设备隧道的信息与连接情况。应用服务器可调用此接口向平台查询设备隧道建立情况。
     * - 该API接口在基础版不支持。
     * - 具体应用可见“设备远程登录”功能，请参见[[设备远程登录](https://support.huaweicloud.com/usermanual-iothub/iot_01_00301.html)](tag:hws)[[设备远程登录](https://support.huaweicloud.com/intl/zh-cn/usermanual-iothub/iot_01_00301.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceTunnelRequest 请求对象
     * @return CompletableFuture<ShowDeviceTunnelResponse>
     */
    public CompletableFuture<ShowDeviceTunnelResponse> showDeviceTunnelAsync(ShowDeviceTunnelRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showDeviceTunnel);
    }

    /**
     * 查询设备隧道
     *
     * 用户可通过该接口查询某项目中的某个设备隧道，查看该设备隧道的信息与连接情况。应用服务器可调用此接口向平台查询设备隧道建立情况。
     * - 该API接口在基础版不支持。
     * - 具体应用可见“设备远程登录”功能，请参见[[设备远程登录](https://support.huaweicloud.com/usermanual-iothub/iot_01_00301.html)](tag:hws)[[设备远程登录](https://support.huaweicloud.com/intl/zh-cn/usermanual-iothub/iot_01_00301.html)](tag:hws_hk)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeviceTunnelRequest 请求对象
     * @return AsyncInvoker<ShowDeviceTunnelRequest, ShowDeviceTunnelResponse>
     */
    public AsyncInvoker<ShowDeviceTunnelRequest, ShowDeviceTunnelResponse> showDeviceTunnelAsyncInvoker(
        ShowDeviceTunnelRequest request) {
        return new AsyncInvoker<>(request, IoTDAMeta.showDeviceTunnel, hcClient);
    }

}
