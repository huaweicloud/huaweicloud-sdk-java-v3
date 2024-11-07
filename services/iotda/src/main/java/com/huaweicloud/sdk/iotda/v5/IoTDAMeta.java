package com.huaweicloud.sdk.iotda.v5;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.iotda.v5.model.AddActionReq;
import com.huaweicloud.sdk.iotda.v5.model.AddApplication;
import com.huaweicloud.sdk.iotda.v5.model.AddApplicationRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddApplicationResponse;
import com.huaweicloud.sdk.iotda.v5.model.AddBacklogPolicy;
import com.huaweicloud.sdk.iotda.v5.model.AddBridge;
import com.huaweicloud.sdk.iotda.v5.model.AddBridgeRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddBridgeResponse;
import com.huaweicloud.sdk.iotda.v5.model.AddCertificateRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddCertificateResponse;
import com.huaweicloud.sdk.iotda.v5.model.AddDevice;
import com.huaweicloud.sdk.iotda.v5.model.AddDeviceGroupDTO;
import com.huaweicloud.sdk.iotda.v5.model.AddDeviceGroupRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddDeviceGroupResponse;
import com.huaweicloud.sdk.iotda.v5.model.AddDeviceProxy;
import com.huaweicloud.sdk.iotda.v5.model.AddDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.AddFlowControlPolicy;
import com.huaweicloud.sdk.iotda.v5.model.AddFunctionsRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddFunctionsResponse;
import com.huaweicloud.sdk.iotda.v5.model.AddProduct;
import com.huaweicloud.sdk.iotda.v5.model.AddQueueRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddQueueResponse;
import com.huaweicloud.sdk.iotda.v5.model.AddRuleReq;
import com.huaweicloud.sdk.iotda.v5.model.AddTunnelDto;
import com.huaweicloud.sdk.iotda.v5.model.AddTunnelRequest;
import com.huaweicloud.sdk.iotda.v5.model.AddTunnelResponse;
import com.huaweicloud.sdk.iotda.v5.model.AsyncDeviceCommandRequest;
import com.huaweicloud.sdk.iotda.v5.model.BatchShowQueueRequest;
import com.huaweicloud.sdk.iotda.v5.model.BatchShowQueueResponse;
import com.huaweicloud.sdk.iotda.v5.model.BatchTargets;
import com.huaweicloud.sdk.iotda.v5.model.BindDevicePolicy;
import com.huaweicloud.sdk.iotda.v5.model.BindDevicePolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.BindDevicePolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.BindTagsDTO;
import com.huaweicloud.sdk.iotda.v5.model.BroadcastMessageRequest;
import com.huaweicloud.sdk.iotda.v5.model.BroadcastMessageResponse;
import com.huaweicloud.sdk.iotda.v5.model.ChangeRuleStatusRequest;
import com.huaweicloud.sdk.iotda.v5.model.ChangeRuleStatusResponse;
import com.huaweicloud.sdk.iotda.v5.model.CheckCertificateRequest;
import com.huaweicloud.sdk.iotda.v5.model.CheckCertificateResponse;
import com.huaweicloud.sdk.iotda.v5.model.CloseDeviceTunnelRequest;
import com.huaweicloud.sdk.iotda.v5.model.CloseDeviceTunnelResponse;
import com.huaweicloud.sdk.iotda.v5.model.CountAsyncHistoryCommandsRequest;
import com.huaweicloud.sdk.iotda.v5.model.CountAsyncHistoryCommandsResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateAccessCodeRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateAccessCodeRequestBody;
import com.huaweicloud.sdk.iotda.v5.model.CreateAccessCodeResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateAsyncCommandRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateAsyncCommandResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateBatchTask;
import com.huaweicloud.sdk.iotda.v5.model.CreateBatchTaskRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateBatchTaskResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateCertificateDTO;
import com.huaweicloud.sdk.iotda.v5.model.CreateCommandRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateCommandResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateDeviceAuthorizer;
import com.huaweicloud.sdk.iotda.v5.model.CreateDeviceAuthorizerRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateDeviceAuthorizerResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateDevicePolicy;
import com.huaweicloud.sdk.iotda.v5.model.CreateDevicePolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateDevicePolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateDeviceProxyRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateDeviceProxyResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateMessageRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateMessageResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateOrDeleteDeviceInGroupRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateOrDeleteDeviceInGroupResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateOtaPackage;
import com.huaweicloud.sdk.iotda.v5.model.CreateOtaPackageRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateOtaPackageResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateProductRequest;
import com.huaweicloud.sdk.iotda.v5.model.CreateProductResponse;
import com.huaweicloud.sdk.iotda.v5.model.CreateProvisioningTemplate;
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
import com.huaweicloud.sdk.iotda.v5.model.DeviceBroadcastRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeviceCommandRequest;
import com.huaweicloud.sdk.iotda.v5.model.DeviceMessageRequest;
import com.huaweicloud.sdk.iotda.v5.model.DevicePropertiesRequest;
import com.huaweicloud.sdk.iotda.v5.model.FreezeDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.FreezeDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.FunctionRequestDTO;
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
import com.huaweicloud.sdk.iotda.v5.model.QueryResourceByTagsDTO;
import com.huaweicloud.sdk.iotda.v5.model.QueueInfo;
import com.huaweicloud.sdk.iotda.v5.model.ResetBridgeSecret;
import com.huaweicloud.sdk.iotda.v5.model.ResetBridgeSecretRequest;
import com.huaweicloud.sdk.iotda.v5.model.ResetBridgeSecretResponse;
import com.huaweicloud.sdk.iotda.v5.model.ResetDeviceSecret;
import com.huaweicloud.sdk.iotda.v5.model.ResetDeviceSecretRequest;
import com.huaweicloud.sdk.iotda.v5.model.ResetDeviceSecretResponse;
import com.huaweicloud.sdk.iotda.v5.model.ResetFingerprint;
import com.huaweicloud.sdk.iotda.v5.model.ResetFingerprintRequest;
import com.huaweicloud.sdk.iotda.v5.model.ResetFingerprintResponse;
import com.huaweicloud.sdk.iotda.v5.model.RetryBatchTaskRequest;
import com.huaweicloud.sdk.iotda.v5.model.RetryBatchTaskResponse;
import com.huaweicloud.sdk.iotda.v5.model.Rule;
import com.huaweicloud.sdk.iotda.v5.model.RuleStatus;
import com.huaweicloud.sdk.iotda.v5.model.SearchDevicesRequest;
import com.huaweicloud.sdk.iotda.v5.model.SearchDevicesResponse;
import com.huaweicloud.sdk.iotda.v5.model.SearchSql;
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
import com.huaweicloud.sdk.iotda.v5.model.ShowTargetsInDevicePolicyRequestBody;
import com.huaweicloud.sdk.iotda.v5.model.ShowTargetsInDevicePolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.StopBatchTaskRequest;
import com.huaweicloud.sdk.iotda.v5.model.StopBatchTaskResponse;
import com.huaweicloud.sdk.iotda.v5.model.TagDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.TagDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.UnBindDevicePolicy;
import com.huaweicloud.sdk.iotda.v5.model.UnbindDevicePolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.UnbindDevicePolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.UnbindTagsDTO;
import com.huaweicloud.sdk.iotda.v5.model.UnfreezeDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.UnfreezeDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.UntagDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.UntagDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateActionReq;
import com.huaweicloud.sdk.iotda.v5.model.UpdateApplicationDTO;
import com.huaweicloud.sdk.iotda.v5.model.UpdateApplicationRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateApplicationResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateBacklogPolicy;
import com.huaweicloud.sdk.iotda.v5.model.UpdateCertificateDTO;
import com.huaweicloud.sdk.iotda.v5.model.UpdateCertificateRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateCertificateResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDesireds;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDevice;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceAuthorizer;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceAuthorizerRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceAuthorizerResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceGroupDTO;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceGroupRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceGroupResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDevicePolicy;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDevicePolicyRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDevicePolicyResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceProxy;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceProxyRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceProxyResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceShadowDesiredDataRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceShadowDesiredDataResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateFlowControlPolicy;
import com.huaweicloud.sdk.iotda.v5.model.UpdateProduct;
import com.huaweicloud.sdk.iotda.v5.model.UpdateProductRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateProductResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdatePropertiesRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdatePropertiesResponse;
import com.huaweicloud.sdk.iotda.v5.model.UpdateProvisioningTemplate;
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
import com.huaweicloud.sdk.iotda.v5.model.UpdateRuleReq;
import com.huaweicloud.sdk.iotda.v5.model.UpdateRuleRequest;
import com.huaweicloud.sdk.iotda.v5.model.UpdateRuleResponse;
import com.huaweicloud.sdk.iotda.v5.model.UploadBatchTaskFileRequest;
import com.huaweicloud.sdk.iotda.v5.model.UploadBatchTaskFileRequestBody;
import com.huaweicloud.sdk.iotda.v5.model.UploadBatchTaskFileResponse;
import com.huaweicloud.sdk.iotda.v5.model.VerifyCertificateDTO;

@SuppressWarnings("unchecked")
public class IoTDAMeta {

    public static final HttpRequestDef<CreateAccessCodeRequest, CreateAccessCodeResponse> createAccessCode =
        genForCreateAccessCode();

    private static HttpRequestDef<CreateAccessCodeRequest, CreateAccessCodeResponse> genForCreateAccessCode() {
        // basic
        HttpRequestDef.Builder<CreateAccessCodeRequest, CreateAccessCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAccessCodeRequest.class, CreateAccessCodeResponse.class)
                .withName("CreateAccessCode")
                .withUri("/v5/iot/{project_id}/auth/accesscode")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAccessCodeRequest::getInstanceId, CreateAccessCodeRequest::setInstanceId));
        builder.<CreateAccessCodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAccessCodeRequestBody.class),
            f -> f.withMarshaller(CreateAccessCodeRequest::getBody, CreateAccessCodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddQueueRequest, AddQueueResponse> addQueue = genForAddQueue();

    private static HttpRequestDef<AddQueueRequest, AddQueueResponse> genForAddQueue() {
        // basic
        HttpRequestDef.Builder<AddQueueRequest, AddQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddQueueRequest.class, AddQueueResponse.class)
                .withName("AddQueue")
                .withUri("/v5/iot/{project_id}/amqp-queues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddQueueRequest::getInstanceId, AddQueueRequest::setInstanceId));
        builder.<QueueInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueueInfo.class),
            f -> f.withMarshaller(AddQueueRequest::getBody, AddQueueRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowQueueRequest, BatchShowQueueResponse> batchShowQueue =
        genForBatchShowQueue();

    private static HttpRequestDef<BatchShowQueueRequest, BatchShowQueueResponse> genForBatchShowQueue() {
        // basic
        HttpRequestDef.Builder<BatchShowQueueRequest, BatchShowQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, BatchShowQueueRequest.class, BatchShowQueueResponse.class)
                .withName("BatchShowQueue")
                .withUri("/v5/iot/{project_id}/amqp-queues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowQueueRequest::getQueueName, BatchShowQueueRequest::setQueueName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowQueueRequest::getLimit, BatchShowQueueRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowQueueRequest::getMarker, BatchShowQueueRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowQueueRequest::getOffset, BatchShowQueueRequest::setOffset));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowQueueRequest::getInstanceId, BatchShowQueueRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteQueueRequest, DeleteQueueResponse> deleteQueue = genForDeleteQueue();

    private static HttpRequestDef<DeleteQueueRequest, DeleteQueueResponse> genForDeleteQueue() {
        // basic
        HttpRequestDef.Builder<DeleteQueueRequest, DeleteQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteQueueRequest.class, DeleteQueueResponse.class)
                .withName("DeleteQueue")
                .withUri("/v5/iot/{project_id}/amqp-queues/{queue_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteQueueRequest::getQueueId, DeleteQueueRequest::setQueueId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteQueueRequest::getInstanceId, DeleteQueueRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteQueueResponse::getBody, DeleteQueueResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowQueueRequest, ShowQueueResponse> showQueue = genForShowQueue();

    private static HttpRequestDef<ShowQueueRequest, ShowQueueResponse> genForShowQueue() {
        // basic
        HttpRequestDef.Builder<ShowQueueRequest, ShowQueueResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQueueRequest.class, ShowQueueResponse.class)
                .withName("ShowQueue")
                .withUri("/v5/iot/{project_id}/amqp-queues/{queue_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("queue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQueueRequest::getQueueId, ShowQueueRequest::setQueueId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQueueRequest::getInstanceId, ShowQueueRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddApplicationRequest, AddApplicationResponse> addApplication =
        genForAddApplication();

    private static HttpRequestDef<AddApplicationRequest, AddApplicationResponse> genForAddApplication() {
        // basic
        HttpRequestDef.Builder<AddApplicationRequest, AddApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddApplicationRequest.class, AddApplicationResponse.class)
                .withName("AddApplication")
                .withUri("/v5/iot/{project_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddApplicationRequest::getInstanceId, AddApplicationRequest::setInstanceId));
        builder.<AddApplication>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddApplication.class),
            f -> f.withMarshaller(AddApplicationRequest::getBody, AddApplicationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplication =
        genForDeleteApplication();

    private static HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> genForDeleteApplication() {
        // basic
        HttpRequestDef.Builder<DeleteApplicationRequest, DeleteApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteApplicationRequest.class, DeleteApplicationResponse.class)
                .withName("DeleteApplication")
                .withUri("/v5/iot/{project_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationRequest::getAppId, DeleteApplicationRequest::setAppId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationRequest::getInstanceId, DeleteApplicationRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteApplicationResponse::getBody, DeleteApplicationResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationRequest, ShowApplicationResponse> showApplication =
        genForShowApplication();

    private static HttpRequestDef<ShowApplicationRequest, ShowApplicationResponse> genForShowApplication() {
        // basic
        HttpRequestDef.Builder<ShowApplicationRequest, ShowApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApplicationRequest.class, ShowApplicationResponse.class)
                .withName("ShowApplication")
                .withUri("/v5/iot/{project_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationRequest::getAppId, ShowApplicationRequest::setAppId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationRequest::getInstanceId, ShowApplicationRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationsRequest, ShowApplicationsResponse> showApplications =
        genForShowApplications();

    private static HttpRequestDef<ShowApplicationsRequest, ShowApplicationsResponse> genForShowApplications() {
        // basic
        HttpRequestDef.Builder<ShowApplicationsRequest, ShowApplicationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApplicationsRequest.class, ShowApplicationsResponse.class)
                .withName("ShowApplications")
                .withUri("/v5/iot/{project_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("default_app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowApplicationsRequest::getDefaultApp, ShowApplicationsRequest::setDefaultApp));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationsRequest::getInstanceId, ShowApplicationsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApplicationRequest, UpdateApplicationResponse> updateApplication =
        genForUpdateApplication();

    private static HttpRequestDef<UpdateApplicationRequest, UpdateApplicationResponse> genForUpdateApplication() {
        // basic
        HttpRequestDef.Builder<UpdateApplicationRequest, UpdateApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateApplicationRequest.class, UpdateApplicationResponse.class)
                .withName("UpdateApplication")
                .withUri("/v5/iot/{project_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationRequest::getAppId, UpdateApplicationRequest::setAppId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationRequest::getInstanceId, UpdateApplicationRequest::setInstanceId));
        builder.<UpdateApplicationDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateApplicationDTO.class),
            f -> f.withMarshaller(UpdateApplicationRequest::getBody, UpdateApplicationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountAsyncHistoryCommandsRequest, CountAsyncHistoryCommandsResponse> countAsyncHistoryCommands =
        genForCountAsyncHistoryCommands();

    private static HttpRequestDef<CountAsyncHistoryCommandsRequest, CountAsyncHistoryCommandsResponse> genForCountAsyncHistoryCommands() {
        // basic
        HttpRequestDef.Builder<CountAsyncHistoryCommandsRequest, CountAsyncHistoryCommandsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CountAsyncHistoryCommandsRequest.class,
                    CountAsyncHistoryCommandsResponse.class)
                .withName("CountAsyncHistoryCommands")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/async-commands-history/count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountAsyncHistoryCommandsRequest::getDeviceId,
                CountAsyncHistoryCommandsRequest::setDeviceId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountAsyncHistoryCommandsRequest::getStartTime,
                CountAsyncHistoryCommandsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountAsyncHistoryCommandsRequest::getEndTime,
                CountAsyncHistoryCommandsRequest::setEndTime));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountAsyncHistoryCommandsRequest::getStatus,
                CountAsyncHistoryCommandsRequest::setStatus));
        builder.<String>withRequestField("command_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountAsyncHistoryCommandsRequest::getCommandName,
                CountAsyncHistoryCommandsRequest::setCommandName));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountAsyncHistoryCommandsRequest::getInstanceId,
                CountAsyncHistoryCommandsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAsyncCommandRequest, CreateAsyncCommandResponse> createAsyncCommand =
        genForCreateAsyncCommand();

    private static HttpRequestDef<CreateAsyncCommandRequest, CreateAsyncCommandResponse> genForCreateAsyncCommand() {
        // basic
        HttpRequestDef.Builder<CreateAsyncCommandRequest, CreateAsyncCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAsyncCommandRequest.class, CreateAsyncCommandResponse.class)
                .withName("CreateAsyncCommand")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/async-commands")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAsyncCommandRequest::getDeviceId, CreateAsyncCommandRequest::setDeviceId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAsyncCommandRequest::getInstanceId, CreateAsyncCommandRequest::setInstanceId));
        builder.<AsyncDeviceCommandRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AsyncDeviceCommandRequest.class),
            f -> f.withMarshaller(CreateAsyncCommandRequest::getBody, CreateAsyncCommandRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAsyncCommandsRequest, ListAsyncCommandsResponse> listAsyncCommands =
        genForListAsyncCommands();

    private static HttpRequestDef<ListAsyncCommandsRequest, ListAsyncCommandsResponse> genForListAsyncCommands() {
        // basic
        HttpRequestDef.Builder<ListAsyncCommandsRequest, ListAsyncCommandsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAsyncCommandsRequest.class, ListAsyncCommandsResponse.class)
                .withName("ListAsyncCommands")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/async-commands")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncCommandsRequest::getDeviceId, ListAsyncCommandsRequest::setDeviceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAsyncCommandsRequest::getLimit, ListAsyncCommandsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncCommandsRequest::getMarker, ListAsyncCommandsRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAsyncCommandsRequest::getOffset, ListAsyncCommandsRequest::setOffset));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncCommandsRequest::getStartTime, ListAsyncCommandsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncCommandsRequest::getEndTime, ListAsyncCommandsRequest::setEndTime));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncCommandsRequest::getStatus, ListAsyncCommandsRequest::setStatus));
        builder.<String>withRequestField("command_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncCommandsRequest::getCommandName, ListAsyncCommandsRequest::setCommandName));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncCommandsRequest::getInstanceId, ListAsyncCommandsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAsyncHistoryCommandsRequest, ListAsyncHistoryCommandsResponse> listAsyncHistoryCommands =
        genForListAsyncHistoryCommands();

    private static HttpRequestDef<ListAsyncHistoryCommandsRequest, ListAsyncHistoryCommandsResponse> genForListAsyncHistoryCommands() {
        // basic
        HttpRequestDef.Builder<ListAsyncHistoryCommandsRequest, ListAsyncHistoryCommandsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListAsyncHistoryCommandsRequest.class, ListAsyncHistoryCommandsResponse.class)
                .withName("ListAsyncHistoryCommands")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/async-commands-history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncHistoryCommandsRequest::getDeviceId,
                ListAsyncHistoryCommandsRequest::setDeviceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAsyncHistoryCommandsRequest::getLimit,
                ListAsyncHistoryCommandsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncHistoryCommandsRequest::getMarker,
                ListAsyncHistoryCommandsRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAsyncHistoryCommandsRequest::getOffset,
                ListAsyncHistoryCommandsRequest::setOffset));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncHistoryCommandsRequest::getStartTime,
                ListAsyncHistoryCommandsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncHistoryCommandsRequest::getEndTime,
                ListAsyncHistoryCommandsRequest::setEndTime));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncHistoryCommandsRequest::getStatus,
                ListAsyncHistoryCommandsRequest::setStatus));
        builder.<String>withRequestField("command_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncHistoryCommandsRequest::getCommandName,
                ListAsyncHistoryCommandsRequest::setCommandName));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAsyncHistoryCommandsRequest::getInstanceId,
                ListAsyncHistoryCommandsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAsyncDeviceCommandRequest, ShowAsyncDeviceCommandResponse> showAsyncDeviceCommand =
        genForShowAsyncDeviceCommand();

    private static HttpRequestDef<ShowAsyncDeviceCommandRequest, ShowAsyncDeviceCommandResponse> genForShowAsyncDeviceCommand() {
        // basic
        HttpRequestDef.Builder<ShowAsyncDeviceCommandRequest, ShowAsyncDeviceCommandResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAsyncDeviceCommandRequest.class, ShowAsyncDeviceCommandResponse.class)
            .withName("ShowAsyncDeviceCommand")
            .withUri("/v5/iot/{project_id}/devices/{device_id}/async-commands/{command_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAsyncDeviceCommandRequest::getDeviceId,
                ShowAsyncDeviceCommandRequest::setDeviceId));
        builder.<String>withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAsyncDeviceCommandRequest::getCommandId,
                ShowAsyncDeviceCommandRequest::setCommandId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAsyncDeviceCommandRequest::getInstanceId,
                ShowAsyncDeviceCommandRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRoutingBacklogPolicyRequest, CreateRoutingBacklogPolicyResponse> createRoutingBacklogPolicy =
        genForCreateRoutingBacklogPolicy();

    private static HttpRequestDef<CreateRoutingBacklogPolicyRequest, CreateRoutingBacklogPolicyResponse> genForCreateRoutingBacklogPolicy() {
        // basic
        HttpRequestDef.Builder<CreateRoutingBacklogPolicyRequest, CreateRoutingBacklogPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateRoutingBacklogPolicyRequest.class,
                    CreateRoutingBacklogPolicyResponse.class)
                .withName("CreateRoutingBacklogPolicy")
                .withUri("/v5/iot/{project_id}/routing-rule/backlog-policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRoutingBacklogPolicyRequest::getInstanceId,
                CreateRoutingBacklogPolicyRequest::setInstanceId));
        builder.<AddBacklogPolicy>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddBacklogPolicy.class),
            f -> f.withMarshaller(CreateRoutingBacklogPolicyRequest::getBody,
                CreateRoutingBacklogPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRoutingBacklogPolicyRequest, DeleteRoutingBacklogPolicyResponse> deleteRoutingBacklogPolicy =
        genForDeleteRoutingBacklogPolicy();

    private static HttpRequestDef<DeleteRoutingBacklogPolicyRequest, DeleteRoutingBacklogPolicyResponse> genForDeleteRoutingBacklogPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteRoutingBacklogPolicyRequest, DeleteRoutingBacklogPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteRoutingBacklogPolicyRequest.class,
                    DeleteRoutingBacklogPolicyResponse.class)
                .withName("DeleteRoutingBacklogPolicy")
                .withUri("/v5/iot/{project_id}/routing-rule/backlog-policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRoutingBacklogPolicyRequest::getPolicyId,
                DeleteRoutingBacklogPolicyRequest::setPolicyId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRoutingBacklogPolicyRequest::getInstanceId,
                DeleteRoutingBacklogPolicyRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRoutingBacklogPolicyResponse::getBody,
                DeleteRoutingBacklogPolicyResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListRoutingBacklogPolicyRequest, ListRoutingBacklogPolicyResponse> listRoutingBacklogPolicy =
        genForListRoutingBacklogPolicy();

    private static HttpRequestDef<ListRoutingBacklogPolicyRequest, ListRoutingBacklogPolicyResponse> genForListRoutingBacklogPolicy() {
        // basic
        HttpRequestDef.Builder<ListRoutingBacklogPolicyRequest, ListRoutingBacklogPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListRoutingBacklogPolicyRequest.class, ListRoutingBacklogPolicyResponse.class)
                .withName("ListRoutingBacklogPolicy")
                .withUri("/v5/iot/{project_id}/routing-rule/backlog-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingBacklogPolicyRequest::getPolicyName,
                ListRoutingBacklogPolicyRequest::setPolicyName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRoutingBacklogPolicyRequest::getLimit,
                ListRoutingBacklogPolicyRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingBacklogPolicyRequest::getMarker,
                ListRoutingBacklogPolicyRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRoutingBacklogPolicyRequest::getOffset,
                ListRoutingBacklogPolicyRequest::setOffset));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingBacklogPolicyRequest::getInstanceId,
                ListRoutingBacklogPolicyRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRoutingBacklogPolicyRequest, ShowRoutingBacklogPolicyResponse> showRoutingBacklogPolicy =
        genForShowRoutingBacklogPolicy();

    private static HttpRequestDef<ShowRoutingBacklogPolicyRequest, ShowRoutingBacklogPolicyResponse> genForShowRoutingBacklogPolicy() {
        // basic
        HttpRequestDef.Builder<ShowRoutingBacklogPolicyRequest, ShowRoutingBacklogPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowRoutingBacklogPolicyRequest.class, ShowRoutingBacklogPolicyResponse.class)
                .withName("ShowRoutingBacklogPolicy")
                .withUri("/v5/iot/{project_id}/routing-rule/backlog-policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRoutingBacklogPolicyRequest::getPolicyId,
                ShowRoutingBacklogPolicyRequest::setPolicyId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRoutingBacklogPolicyRequest::getInstanceId,
                ShowRoutingBacklogPolicyRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRoutingBacklogPolicyRequest, UpdateRoutingBacklogPolicyResponse> updateRoutingBacklogPolicy =
        genForUpdateRoutingBacklogPolicy();

    private static HttpRequestDef<UpdateRoutingBacklogPolicyRequest, UpdateRoutingBacklogPolicyResponse> genForUpdateRoutingBacklogPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateRoutingBacklogPolicyRequest, UpdateRoutingBacklogPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateRoutingBacklogPolicyRequest.class,
                    UpdateRoutingBacklogPolicyResponse.class)
                .withName("UpdateRoutingBacklogPolicy")
                .withUri("/v5/iot/{project_id}/routing-rule/backlog-policy/{policy_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoutingBacklogPolicyRequest::getPolicyId,
                UpdateRoutingBacklogPolicyRequest::setPolicyId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoutingBacklogPolicyRequest::getInstanceId,
                UpdateRoutingBacklogPolicyRequest::setInstanceId));
        builder.<UpdateBacklogPolicy>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBacklogPolicy.class),
            f -> f.withMarshaller(UpdateRoutingBacklogPolicyRequest::getBody,
                UpdateRoutingBacklogPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBatchTaskRequest, CreateBatchTaskResponse> createBatchTask =
        genForCreateBatchTask();

    private static HttpRequestDef<CreateBatchTaskRequest, CreateBatchTaskResponse> genForCreateBatchTask() {
        // basic
        HttpRequestDef.Builder<CreateBatchTaskRequest, CreateBatchTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBatchTaskRequest.class, CreateBatchTaskResponse.class)
                .withName("CreateBatchTask")
                .withUri("/v5/iot/{project_id}/batchtasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBatchTaskRequest::getInstanceId, CreateBatchTaskRequest::setInstanceId));
        builder.<CreateBatchTask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBatchTask.class),
            f -> f.withMarshaller(CreateBatchTaskRequest::getBody, CreateBatchTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBatchTaskRequest, DeleteBatchTaskResponse> deleteBatchTask =
        genForDeleteBatchTask();

    private static HttpRequestDef<DeleteBatchTaskRequest, DeleteBatchTaskResponse> genForDeleteBatchTask() {
        // basic
        HttpRequestDef.Builder<DeleteBatchTaskRequest, DeleteBatchTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBatchTaskRequest.class, DeleteBatchTaskResponse.class)
                .withName("DeleteBatchTask")
                .withUri("/v5/iot/{project_id}/batchtasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBatchTaskRequest::getTaskId, DeleteBatchTaskRequest::setTaskId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBatchTaskRequest::getInstanceId, DeleteBatchTaskRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBatchTaskResponse::getBody, DeleteBatchTaskResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListBatchTasksRequest, ListBatchTasksResponse> listBatchTasks =
        genForListBatchTasks();

    private static HttpRequestDef<ListBatchTasksRequest, ListBatchTasksResponse> genForListBatchTasks() {
        // basic
        HttpRequestDef.Builder<ListBatchTasksRequest, ListBatchTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBatchTasksRequest.class, ListBatchTasksResponse.class)
                .withName("ListBatchTasks")
                .withUri("/v5/iot/{project_id}/batchtasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getAppId, ListBatchTasksRequest::setAppId));
        builder.<String>withRequestField("task_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getTaskType, ListBatchTasksRequest::setTaskType));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getStatus, ListBatchTasksRequest::setStatus));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getLimit, ListBatchTasksRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getMarker, ListBatchTasksRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getOffset, ListBatchTasksRequest::setOffset));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchTasksRequest::getInstanceId, ListBatchTasksRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryBatchTaskRequest, RetryBatchTaskResponse> retryBatchTask =
        genForRetryBatchTask();

    private static HttpRequestDef<RetryBatchTaskRequest, RetryBatchTaskResponse> genForRetryBatchTask() {
        // basic
        HttpRequestDef.Builder<RetryBatchTaskRequest, RetryBatchTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RetryBatchTaskRequest.class, RetryBatchTaskResponse.class)
                .withName("RetryBatchTask")
                .withUri("/v5/iot/{project_id}/batchtasks/{task_id}/retry")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryBatchTaskRequest::getTaskId, RetryBatchTaskRequest::setTaskId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryBatchTaskRequest::getInstanceId, RetryBatchTaskRequest::setInstanceId));
        builder.<BatchTargets>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchTargets.class),
            f -> f.withMarshaller(RetryBatchTaskRequest::getBody, RetryBatchTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchTaskRequest, ShowBatchTaskResponse> showBatchTask =
        genForShowBatchTask();

    private static HttpRequestDef<ShowBatchTaskRequest, ShowBatchTaskResponse> genForShowBatchTask() {
        // basic
        HttpRequestDef.Builder<ShowBatchTaskRequest, ShowBatchTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBatchTaskRequest.class, ShowBatchTaskResponse.class)
                .withName("ShowBatchTask")
                .withUri("/v5/iot/{project_id}/batchtasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchTaskRequest::getTaskId, ShowBatchTaskRequest::setTaskId));
        builder.<String>withRequestField("task_detail_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchTaskRequest::getTaskDetailStatus,
                ShowBatchTaskRequest::setTaskDetailStatus));
        builder.<String>withRequestField("target",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchTaskRequest::getTarget, ShowBatchTaskRequest::setTarget));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBatchTaskRequest::getLimit, ShowBatchTaskRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchTaskRequest::getMarker, ShowBatchTaskRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBatchTaskRequest::getOffset, ShowBatchTaskRequest::setOffset));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchTaskRequest::getInstanceId, ShowBatchTaskRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopBatchTaskRequest, StopBatchTaskResponse> stopBatchTask =
        genForStopBatchTask();

    private static HttpRequestDef<StopBatchTaskRequest, StopBatchTaskResponse> genForStopBatchTask() {
        // basic
        HttpRequestDef.Builder<StopBatchTaskRequest, StopBatchTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopBatchTaskRequest.class, StopBatchTaskResponse.class)
                .withName("StopBatchTask")
                .withUri("/v5/iot/{project_id}/batchtasks/{task_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopBatchTaskRequest::getTaskId, StopBatchTaskRequest::setTaskId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopBatchTaskRequest::getInstanceId, StopBatchTaskRequest::setInstanceId));
        builder.<BatchTargets>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchTargets.class),
            f -> f.withMarshaller(StopBatchTaskRequest::getBody, StopBatchTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBatchTaskFileRequest, DeleteBatchTaskFileResponse> deleteBatchTaskFile =
        genForDeleteBatchTaskFile();

    private static HttpRequestDef<DeleteBatchTaskFileRequest, DeleteBatchTaskFileResponse> genForDeleteBatchTaskFile() {
        // basic
        HttpRequestDef.Builder<DeleteBatchTaskFileRequest, DeleteBatchTaskFileResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteBatchTaskFileRequest.class, DeleteBatchTaskFileResponse.class)
            .withName("DeleteBatchTaskFile")
            .withUri("/v5/iot/{project_id}/batchtask-files/{file_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("file_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBatchTaskFileRequest::getFileId, DeleteBatchTaskFileRequest::setFileId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBatchTaskFileRequest::getInstanceId,
                DeleteBatchTaskFileRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBatchTaskFileResponse::getBody, DeleteBatchTaskFileResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListBatchTaskFilesRequest, ListBatchTaskFilesResponse> listBatchTaskFiles =
        genForListBatchTaskFiles();

    private static HttpRequestDef<ListBatchTaskFilesRequest, ListBatchTaskFilesResponse> genForListBatchTaskFiles() {
        // basic
        HttpRequestDef.Builder<ListBatchTaskFilesRequest, ListBatchTaskFilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBatchTaskFilesRequest.class, ListBatchTaskFilesResponse.class)
                .withName("ListBatchTaskFiles")
                .withUri("/v5/iot/{project_id}/batchtask-files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchTaskFilesRequest::getInstanceId, ListBatchTaskFilesRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadBatchTaskFileRequest, UploadBatchTaskFileResponse> uploadBatchTaskFile =
        genForUploadBatchTaskFile();

    private static HttpRequestDef<UploadBatchTaskFileRequest, UploadBatchTaskFileResponse> genForUploadBatchTaskFile() {
        // basic
        HttpRequestDef.Builder<UploadBatchTaskFileRequest, UploadBatchTaskFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadBatchTaskFileRequest.class, UploadBatchTaskFileResponse.class)
                .withName("UploadBatchTaskFile")
                .withUri("/v5/iot/{project_id}/batchtask-files")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadBatchTaskFileRequest::getInstanceId,
                UploadBatchTaskFileRequest::setInstanceId));
        builder.<UploadBatchTaskFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadBatchTaskFileRequestBody.class),
            f -> f.withMarshaller(UploadBatchTaskFileRequest::getBody, UploadBatchTaskFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddBridgeRequest, AddBridgeResponse> addBridge = genForAddBridge();

    private static HttpRequestDef<AddBridgeRequest, AddBridgeResponse> genForAddBridge() {
        // basic
        HttpRequestDef.Builder<AddBridgeRequest, AddBridgeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddBridgeRequest.class, AddBridgeResponse.class)
                .withName("AddBridge")
                .withUri("/v5/iot/{project_id}/bridges")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddBridgeRequest::getInstanceId, AddBridgeRequest::setInstanceId));
        builder.<AddBridge>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddBridge.class),
            f -> f.withMarshaller(AddBridgeRequest::getBody, AddBridgeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBridgeRequest, DeleteBridgeResponse> deleteBridge = genForDeleteBridge();

    private static HttpRequestDef<DeleteBridgeRequest, DeleteBridgeResponse> genForDeleteBridge() {
        // basic
        HttpRequestDef.Builder<DeleteBridgeRequest, DeleteBridgeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBridgeRequest.class, DeleteBridgeResponse.class)
                .withName("DeleteBridge")
                .withUri("/v5/iot/{project_id}/bridges/{bridge_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bridge_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBridgeRequest::getBridgeId, DeleteBridgeRequest::setBridgeId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBridgeRequest::getInstanceId, DeleteBridgeRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteBridgeResponse::getBody, DeleteBridgeResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListBridgesRequest, ListBridgesResponse> listBridges = genForListBridges();

    private static HttpRequestDef<ListBridgesRequest, ListBridgesResponse> genForListBridges() {
        // basic
        HttpRequestDef.Builder<ListBridgesRequest, ListBridgesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBridgesRequest.class, ListBridgesResponse.class)
                .withName("ListBridges")
                .withUri("/v5/iot/{project_id}/bridges")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBridgesRequest::getLimit, ListBridgesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBridgesRequest::getMarker, ListBridgesRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBridgesRequest::getOffset, ListBridgesRequest::setOffset));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBridgesRequest::getInstanceId, ListBridgesRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetBridgeSecretRequest, ResetBridgeSecretResponse> resetBridgeSecret =
        genForResetBridgeSecret();

    private static HttpRequestDef<ResetBridgeSecretRequest, ResetBridgeSecretResponse> genForResetBridgeSecret() {
        // basic
        HttpRequestDef.Builder<ResetBridgeSecretRequest, ResetBridgeSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetBridgeSecretRequest.class, ResetBridgeSecretResponse.class)
                .withName("ResetBridgeSecret")
                .withUri("/v5/iot/{project_id}/bridges/{bridge_id}/reset-secret")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("bridge_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetBridgeSecretRequest::getBridgeId, ResetBridgeSecretRequest::setBridgeId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetBridgeSecretRequest::getInstanceId, ResetBridgeSecretRequest::setInstanceId));
        builder.<ResetBridgeSecret>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetBridgeSecret.class),
            f -> f.withMarshaller(ResetBridgeSecretRequest::getBody, ResetBridgeSecretRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BroadcastMessageRequest, BroadcastMessageResponse> broadcastMessage =
        genForBroadcastMessage();

    private static HttpRequestDef<BroadcastMessageRequest, BroadcastMessageResponse> genForBroadcastMessage() {
        // basic
        HttpRequestDef.Builder<BroadcastMessageRequest, BroadcastMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BroadcastMessageRequest.class, BroadcastMessageResponse.class)
                .withName("BroadcastMessage")
                .withUri("/v5/iot/{project_id}/broadcast-messages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BroadcastMessageRequest::getInstanceId, BroadcastMessageRequest::setInstanceId));
        builder.<DeviceBroadcastRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeviceBroadcastRequest.class),
            f -> f.withMarshaller(BroadcastMessageRequest::getBody, BroadcastMessageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddCertificateRequest, AddCertificateResponse> addCertificate =
        genForAddCertificate();

    private static HttpRequestDef<AddCertificateRequest, AddCertificateResponse> genForAddCertificate() {
        // basic
        HttpRequestDef.Builder<AddCertificateRequest, AddCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddCertificateRequest.class, AddCertificateResponse.class)
                .withName("AddCertificate")
                .withUri("/v5/iot/{project_id}/certificates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Sp-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCertificateRequest::getSpAuthToken, AddCertificateRequest::setSpAuthToken));
        builder.<String>withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCertificateRequest::getStageAuthToken, AddCertificateRequest::setStageAuthToken));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCertificateRequest::getInstanceId, AddCertificateRequest::setInstanceId));
        builder.<CreateCertificateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCertificateDTO.class),
            f -> f.withMarshaller(AddCertificateRequest::getBody, AddCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckCertificateRequest, CheckCertificateResponse> checkCertificate =
        genForCheckCertificate();

    private static HttpRequestDef<CheckCertificateRequest, CheckCertificateResponse> genForCheckCertificate() {
        // basic
        HttpRequestDef.Builder<CheckCertificateRequest, CheckCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckCertificateRequest.class, CheckCertificateResponse.class)
                .withName("CheckCertificate")
                .withUri("/v5/iot/{project_id}/certificates/{certificate_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckCertificateRequest::getCertificateId,
                CheckCertificateRequest::setCertificateId));
        builder.<String>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckCertificateRequest::getActionId, CheckCertificateRequest::setActionId));
        builder.<String>withRequestField("Sp-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckCertificateRequest::getSpAuthToken, CheckCertificateRequest::setSpAuthToken));
        builder.<String>withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckCertificateRequest::getStageAuthToken,
                CheckCertificateRequest::setStageAuthToken));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckCertificateRequest::getInstanceId, CheckCertificateRequest::setInstanceId));
        builder.<VerifyCertificateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VerifyCertificateDTO.class),
            f -> f.withMarshaller(CheckCertificateRequest::getBody, CheckCertificateRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckCertificateResponse::getBody, CheckCertificateResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificate =
        genForDeleteCertificate();

    private static HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> genForDeleteCertificate() {
        // basic
        HttpRequestDef.Builder<DeleteCertificateRequest, DeleteCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCertificateRequest.class, DeleteCertificateResponse.class)
                .withName("DeleteCertificate")
                .withUri("/v5/iot/{project_id}/certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getCertificateId,
                DeleteCertificateRequest::setCertificateId));
        builder.<String>withRequestField("Sp-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getSpAuthToken, DeleteCertificateRequest::setSpAuthToken));
        builder.<String>withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getStageAuthToken,
                DeleteCertificateRequest::setStageAuthToken));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getInstanceId, DeleteCertificateRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteCertificateResponse::getBody, DeleteCertificateResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> listCertificates =
        genForListCertificates();

    private static HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> genForListCertificates() {
        // basic
        HttpRequestDef.Builder<ListCertificatesRequest, ListCertificatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertificatesRequest.class, ListCertificatesResponse.class)
                .withName("ListCertificates")
                .withUri("/v5/iot/{project_id}/certificates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getAppId, ListCertificatesRequest::setAppId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getLimit, ListCertificatesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getMarker, ListCertificatesRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getOffset, ListCertificatesRequest::setOffset));
        builder.<String>withRequestField("Sp-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getSpAuthToken, ListCertificatesRequest::setSpAuthToken));
        builder.<String>withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getStageAuthToken,
                ListCertificatesRequest::setStageAuthToken));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getInstanceId, ListCertificatesRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificate =
        genForUpdateCertificate();

    private static HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> genForUpdateCertificate() {
        // basic
        HttpRequestDef.Builder<UpdateCertificateRequest, UpdateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCertificateRequest.class, UpdateCertificateResponse.class)
                .withName("UpdateCertificate")
                .withUri("/v5/iot/{project_id}/certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getCertificateId,
                UpdateCertificateRequest::setCertificateId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getInstanceId, UpdateCertificateRequest::setInstanceId));
        builder.<UpdateCertificateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCertificateDTO.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getBody, UpdateCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCommandRequest, CreateCommandResponse> createCommand =
        genForCreateCommand();

    private static HttpRequestDef<CreateCommandRequest, CreateCommandResponse> genForCreateCommand() {
        // basic
        HttpRequestDef.Builder<CreateCommandRequest, CreateCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCommandRequest.class, CreateCommandResponse.class)
                .withName("CreateCommand")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/commands")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCommandRequest::getDeviceId, CreateCommandRequest::setDeviceId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCommandRequest::getInstanceId, CreateCommandRequest::setInstanceId));
        builder.<DeviceCommandRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeviceCommandRequest.class),
            f -> f.withMarshaller(CreateCommandRequest::getBody, CreateCommandRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeviceAuthorizerRequest, CreateDeviceAuthorizerResponse> createDeviceAuthorizer =
        genForCreateDeviceAuthorizer();

    private static HttpRequestDef<CreateDeviceAuthorizerRequest, CreateDeviceAuthorizerResponse> genForCreateDeviceAuthorizer() {
        // basic
        HttpRequestDef.Builder<CreateDeviceAuthorizerRequest, CreateDeviceAuthorizerResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDeviceAuthorizerRequest.class, CreateDeviceAuthorizerResponse.class)
            .withName("CreateDeviceAuthorizer")
            .withUri("/v5/iot/{project_id}/device-authorizers")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDeviceAuthorizerRequest::getInstanceId,
                CreateDeviceAuthorizerRequest::setInstanceId));
        builder.<CreateDeviceAuthorizer>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDeviceAuthorizer.class),
            f -> f.withMarshaller(CreateDeviceAuthorizerRequest::getBody, CreateDeviceAuthorizerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeviceAuthorizerRequest, DeleteDeviceAuthorizerResponse> deleteDeviceAuthorizer =
        genForDeleteDeviceAuthorizer();

    private static HttpRequestDef<DeleteDeviceAuthorizerRequest, DeleteDeviceAuthorizerResponse> genForDeleteDeviceAuthorizer() {
        // basic
        HttpRequestDef.Builder<DeleteDeviceAuthorizerRequest, DeleteDeviceAuthorizerResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDeviceAuthorizerRequest.class, DeleteDeviceAuthorizerResponse.class)
            .withName("DeleteDeviceAuthorizer")
            .withUri("/v5/iot/{project_id}/device-authorizers/{authorizer_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("authorizer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceAuthorizerRequest::getAuthorizerId,
                DeleteDeviceAuthorizerRequest::setAuthorizerId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceAuthorizerRequest::getInstanceId,
                DeleteDeviceAuthorizerRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDeviceAuthorizerResponse::getBody, DeleteDeviceAuthorizerResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListDeviceAuthorizersRequest, ListDeviceAuthorizersResponse> listDeviceAuthorizers =
        genForListDeviceAuthorizers();

    private static HttpRequestDef<ListDeviceAuthorizersRequest, ListDeviceAuthorizersResponse> genForListDeviceAuthorizers() {
        // basic
        HttpRequestDef.Builder<ListDeviceAuthorizersRequest, ListDeviceAuthorizersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDeviceAuthorizersRequest.class, ListDeviceAuthorizersResponse.class)
            .withName("ListDeviceAuthorizers")
            .withUri("/v5/iot/{project_id}/device-authorizers")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("authorizer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceAuthorizersRequest::getAuthorizerName,
                ListDeviceAuthorizersRequest::setAuthorizerName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeviceAuthorizersRequest::getLimit, ListDeviceAuthorizersRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceAuthorizersRequest::getMarker, ListDeviceAuthorizersRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeviceAuthorizersRequest::getOffset, ListDeviceAuthorizersRequest::setOffset));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceAuthorizersRequest::getInstanceId,
                ListDeviceAuthorizersRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceAuthorizerRequest, ShowDeviceAuthorizerResponse> showDeviceAuthorizer =
        genForShowDeviceAuthorizer();

    private static HttpRequestDef<ShowDeviceAuthorizerRequest, ShowDeviceAuthorizerResponse> genForShowDeviceAuthorizer() {
        // basic
        HttpRequestDef.Builder<ShowDeviceAuthorizerRequest, ShowDeviceAuthorizerResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDeviceAuthorizerRequest.class, ShowDeviceAuthorizerResponse.class)
            .withName("ShowDeviceAuthorizer")
            .withUri("/v5/iot/{project_id}/device-authorizers/{authorizer_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("authorizer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceAuthorizerRequest::getAuthorizerId,
                ShowDeviceAuthorizerRequest::setAuthorizerId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceAuthorizerRequest::getInstanceId,
                ShowDeviceAuthorizerRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceAuthorizerRequest, UpdateDeviceAuthorizerResponse> updateDeviceAuthorizer =
        genForUpdateDeviceAuthorizer();

    private static HttpRequestDef<UpdateDeviceAuthorizerRequest, UpdateDeviceAuthorizerResponse> genForUpdateDeviceAuthorizer() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceAuthorizerRequest, UpdateDeviceAuthorizerResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDeviceAuthorizerRequest.class, UpdateDeviceAuthorizerResponse.class)
            .withName("UpdateDeviceAuthorizer")
            .withUri("/v5/iot/{project_id}/device-authorizers/{authorizer_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("authorizer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceAuthorizerRequest::getAuthorizerId,
                UpdateDeviceAuthorizerRequest::setAuthorizerId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceAuthorizerRequest::getInstanceId,
                UpdateDeviceAuthorizerRequest::setInstanceId));
        builder.<UpdateDeviceAuthorizer>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDeviceAuthorizer.class),
            f -> f.withMarshaller(UpdateDeviceAuthorizerRequest::getBody, UpdateDeviceAuthorizerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDeviceGroupRequest, AddDeviceGroupResponse> addDeviceGroup =
        genForAddDeviceGroup();

    private static HttpRequestDef<AddDeviceGroupRequest, AddDeviceGroupResponse> genForAddDeviceGroup() {
        // basic
        HttpRequestDef.Builder<AddDeviceGroupRequest, AddDeviceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddDeviceGroupRequest.class, AddDeviceGroupResponse.class)
                .withName("AddDeviceGroup")
                .withUri("/v5/iot/{project_id}/device-group")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDeviceGroupRequest::getInstanceId, AddDeviceGroupRequest::setInstanceId));
        builder.<AddDeviceGroupDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddDeviceGroupDTO.class),
            f -> f.withMarshaller(AddDeviceGroupRequest::getBody, AddDeviceGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrDeleteDeviceInGroupRequest, CreateOrDeleteDeviceInGroupResponse> createOrDeleteDeviceInGroup =
        genForCreateOrDeleteDeviceInGroup();

    private static HttpRequestDef<CreateOrDeleteDeviceInGroupRequest, CreateOrDeleteDeviceInGroupResponse> genForCreateOrDeleteDeviceInGroup() {
        // basic
        HttpRequestDef.Builder<CreateOrDeleteDeviceInGroupRequest, CreateOrDeleteDeviceInGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateOrDeleteDeviceInGroupRequest.class,
                    CreateOrDeleteDeviceInGroupResponse.class)
                .withName("CreateOrDeleteDeviceInGroup")
                .withUri("/v5/iot/{project_id}/device-group/{group_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOrDeleteDeviceInGroupRequest::getGroupId,
                CreateOrDeleteDeviceInGroupRequest::setGroupId));
        builder.<String>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOrDeleteDeviceInGroupRequest::getActionId,
                CreateOrDeleteDeviceInGroupRequest::setActionId));
        builder.<String>withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOrDeleteDeviceInGroupRequest::getDeviceId,
                CreateOrDeleteDeviceInGroupRequest::setDeviceId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOrDeleteDeviceInGroupRequest::getInstanceId,
                CreateOrDeleteDeviceInGroupRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateOrDeleteDeviceInGroupResponse::getBody,
                CreateOrDeleteDeviceInGroupResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> deleteDeviceGroup =
        genForDeleteDeviceGroup();

    private static HttpRequestDef<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> genForDeleteDeviceGroup() {
        // basic
        HttpRequestDef.Builder<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeviceGroupRequest.class, DeleteDeviceGroupResponse.class)
                .withName("DeleteDeviceGroup")
                .withUri("/v5/iot/{project_id}/device-group/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceGroupRequest::getGroupId, DeleteDeviceGroupRequest::setGroupId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceGroupRequest::getInstanceId, DeleteDeviceGroupRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDeviceGroupResponse::getBody, DeleteDeviceGroupResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListDeviceGroupsRequest, ListDeviceGroupsResponse> listDeviceGroups =
        genForListDeviceGroups();

    private static HttpRequestDef<ListDeviceGroupsRequest, ListDeviceGroupsResponse> genForListDeviceGroups() {
        // basic
        HttpRequestDef.Builder<ListDeviceGroupsRequest, ListDeviceGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDeviceGroupsRequest.class, ListDeviceGroupsResponse.class)
                .withName("ListDeviceGroups")
                .withUri("/v5/iot/{project_id}/device-group")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeviceGroupsRequest::getLimit, ListDeviceGroupsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceGroupsRequest::getMarker, ListDeviceGroupsRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeviceGroupsRequest::getOffset, ListDeviceGroupsRequest::setOffset));
        builder.<String>withRequestField("last_modified_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceGroupsRequest::getLastModifiedTime,
                ListDeviceGroupsRequest::setLastModifiedTime));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceGroupsRequest::getAppId, ListDeviceGroupsRequest::setAppId));
        builder.<String>withRequestField("group_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceGroupsRequest::getGroupType, ListDeviceGroupsRequest::setGroupType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceGroupsRequest::getName, ListDeviceGroupsRequest::setName));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceGroupsRequest::getInstanceId, ListDeviceGroupsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceGroupRequest, ShowDeviceGroupResponse> showDeviceGroup =
        genForShowDeviceGroup();

    private static HttpRequestDef<ShowDeviceGroupRequest, ShowDeviceGroupResponse> genForShowDeviceGroup() {
        // basic
        HttpRequestDef.Builder<ShowDeviceGroupRequest, ShowDeviceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceGroupRequest.class, ShowDeviceGroupResponse.class)
                .withName("ShowDeviceGroup")
                .withUri("/v5/iot/{project_id}/device-group/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceGroupRequest::getGroupId, ShowDeviceGroupRequest::setGroupId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceGroupRequest::getInstanceId, ShowDeviceGroupRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> showDevicesInGroup =
        genForShowDevicesInGroup();

    private static HttpRequestDef<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> genForShowDevicesInGroup() {
        // basic
        HttpRequestDef.Builder<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDevicesInGroupRequest.class, ShowDevicesInGroupResponse.class)
                .withName("ShowDevicesInGroup")
                .withUri("/v5/iot/{project_id}/device-group/{group_id}/devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getGroupId, ShowDevicesInGroupRequest::setGroupId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getLimit, ShowDevicesInGroupRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getMarker, ShowDevicesInGroupRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getOffset, ShowDevicesInGroupRequest::setOffset));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getInstanceId, ShowDevicesInGroupRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> updateDeviceGroup =
        genForUpdateDeviceGroup();

    private static HttpRequestDef<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> genForUpdateDeviceGroup() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDeviceGroupRequest.class, UpdateDeviceGroupResponse.class)
                .withName("UpdateDeviceGroup")
                .withUri("/v5/iot/{project_id}/device-group/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceGroupRequest::getGroupId, UpdateDeviceGroupRequest::setGroupId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceGroupRequest::getInstanceId, UpdateDeviceGroupRequest::setInstanceId));
        builder.<UpdateDeviceGroupDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDeviceGroupDTO.class),
            f -> f.withMarshaller(UpdateDeviceGroupRequest::getBody, UpdateDeviceGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDeviceRequest, AddDeviceResponse> addDevice = genForAddDevice();

    private static HttpRequestDef<AddDeviceRequest, AddDeviceResponse> genForAddDevice() {
        // basic
        HttpRequestDef.Builder<AddDeviceRequest, AddDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddDeviceRequest.class, AddDeviceResponse.class)
                .withName("AddDevice")
                .withUri("/v5/iot/{project_id}/devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDeviceRequest::getInstanceId, AddDeviceRequest::setInstanceId));
        builder.<AddDevice>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDevice.class),
            f -> f.withMarshaller(AddDeviceRequest::getBody, AddDeviceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeviceRequest, DeleteDeviceResponse> deleteDevice = genForDeleteDevice();

    private static HttpRequestDef<DeleteDeviceRequest, DeleteDeviceResponse> genForDeleteDevice() {
        // basic
        HttpRequestDef.Builder<DeleteDeviceRequest, DeleteDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeviceRequest.class, DeleteDeviceResponse.class)
                .withName("DeleteDevice")
                .withUri("/v5/iot/{project_id}/devices/{device_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceRequest::getDeviceId, DeleteDeviceRequest::setDeviceId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceRequest::getInstanceId, DeleteDeviceRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDeviceResponse::getBody, DeleteDeviceResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<FreezeDeviceRequest, FreezeDeviceResponse> freezeDevice = genForFreezeDevice();

    private static HttpRequestDef<FreezeDeviceRequest, FreezeDeviceResponse> genForFreezeDevice() {
        // basic
        HttpRequestDef.Builder<FreezeDeviceRequest, FreezeDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, FreezeDeviceRequest.class, FreezeDeviceResponse.class)
                .withName("FreezeDevice")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/freeze")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(FreezeDeviceRequest::getDeviceId, FreezeDeviceRequest::setDeviceId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(FreezeDeviceRequest::getInstanceId, FreezeDeviceRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(FreezeDeviceResponse::getBody, FreezeDeviceResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListDeviceGroupsByDeviceRequest, ListDeviceGroupsByDeviceResponse> listDeviceGroupsByDevice =
        genForListDeviceGroupsByDevice();

    private static HttpRequestDef<ListDeviceGroupsByDeviceRequest, ListDeviceGroupsByDeviceResponse> genForListDeviceGroupsByDevice() {
        // basic
        HttpRequestDef.Builder<ListDeviceGroupsByDeviceRequest, ListDeviceGroupsByDeviceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ListDeviceGroupsByDeviceRequest.class, ListDeviceGroupsByDeviceResponse.class)
                .withName("ListDeviceGroupsByDevice")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/list-device-group")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceGroupsByDeviceRequest::getDeviceId,
                ListDeviceGroupsByDeviceRequest::setDeviceId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceGroupsByDeviceRequest::getInstanceId,
                ListDeviceGroupsByDeviceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDevicesRequest, ListDevicesResponse> listDevices = genForListDevices();

    private static HttpRequestDef<ListDevicesRequest, ListDevicesResponse> genForListDevices() {
        // basic
        HttpRequestDef.Builder<ListDevicesRequest, ListDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDevicesRequest.class, ListDevicesResponse.class)
                .withName("ListDevices")
                .withUri("/v5/iot/{project_id}/devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getProductId, ListDevicesRequest::setProductId));
        builder.<String>withRequestField("gateway_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getGatewayId, ListDevicesRequest::setGatewayId));
        builder.<Boolean>withRequestField("is_cascade_query",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDevicesRequest::getIsCascadeQuery, ListDevicesRequest::setIsCascadeQuery));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getNodeId, ListDevicesRequest::setNodeId));
        builder.<String>withRequestField("device_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getDeviceName, ListDevicesRequest::setDeviceName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDevicesRequest::getLimit, ListDevicesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getMarker, ListDevicesRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDevicesRequest::getOffset, ListDevicesRequest::setOffset));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getStartTime, ListDevicesRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getEndTime, ListDevicesRequest::setEndTime));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getAppId, ListDevicesRequest::setAppId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getInstanceId, ListDevicesRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetDeviceSecretRequest, ResetDeviceSecretResponse> resetDeviceSecret =
        genForResetDeviceSecret();

    private static HttpRequestDef<ResetDeviceSecretRequest, ResetDeviceSecretResponse> genForResetDeviceSecret() {
        // basic
        HttpRequestDef.Builder<ResetDeviceSecretRequest, ResetDeviceSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetDeviceSecretRequest.class, ResetDeviceSecretResponse.class)
                .withName("ResetDeviceSecret")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetDeviceSecretRequest::getDeviceId, ResetDeviceSecretRequest::setDeviceId));
        builder.<String>withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetDeviceSecretRequest::getActionId, ResetDeviceSecretRequest::setActionId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetDeviceSecretRequest::getInstanceId, ResetDeviceSecretRequest::setInstanceId));
        builder.<ResetDeviceSecret>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetDeviceSecret.class),
            f -> f.withMarshaller(ResetDeviceSecretRequest::getBody, ResetDeviceSecretRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetFingerprintRequest, ResetFingerprintResponse> resetFingerprint =
        genForResetFingerprint();

    private static HttpRequestDef<ResetFingerprintRequest, ResetFingerprintResponse> genForResetFingerprint() {
        // basic
        HttpRequestDef.Builder<ResetFingerprintRequest, ResetFingerprintResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetFingerprintRequest.class, ResetFingerprintResponse.class)
                .withName("ResetFingerprint")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/reset-fingerprint")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetFingerprintRequest::getDeviceId, ResetFingerprintRequest::setDeviceId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetFingerprintRequest::getInstanceId, ResetFingerprintRequest::setInstanceId));
        builder.<ResetFingerprint>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetFingerprint.class),
            f -> f.withMarshaller(ResetFingerprintRequest::getBody, ResetFingerprintRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchDevicesRequest, SearchDevicesResponse> searchDevices =
        genForSearchDevices();

    private static HttpRequestDef<SearchDevicesRequest, SearchDevicesResponse> genForSearchDevices() {
        // basic
        HttpRequestDef.Builder<SearchDevicesRequest, SearchDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchDevicesRequest.class, SearchDevicesResponse.class)
                .withName("SearchDevices")
                .withUri("/v5/iot/{project_id}/search/query-devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchDevicesRequest::getInstanceId, SearchDevicesRequest::setInstanceId));
        builder.<SearchSql>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchSql.class),
            f -> f.withMarshaller(SearchDevicesRequest::getBody, SearchDevicesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceRequest, ShowDeviceResponse> showDevice = genForShowDevice();

    private static HttpRequestDef<ShowDeviceRequest, ShowDeviceResponse> genForShowDevice() {
        // basic
        HttpRequestDef.Builder<ShowDeviceRequest, ShowDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceRequest.class, ShowDeviceResponse.class)
                .withName("ShowDevice")
                .withUri("/v5/iot/{project_id}/devices/{device_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceRequest::getDeviceId, ShowDeviceRequest::setDeviceId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceRequest::getInstanceId, ShowDeviceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnfreezeDeviceRequest, UnfreezeDeviceResponse> unfreezeDevice =
        genForUnfreezeDevice();

    private static HttpRequestDef<UnfreezeDeviceRequest, UnfreezeDeviceResponse> genForUnfreezeDevice() {
        // basic
        HttpRequestDef.Builder<UnfreezeDeviceRequest, UnfreezeDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnfreezeDeviceRequest.class, UnfreezeDeviceResponse.class)
                .withName("UnfreezeDevice")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/unfreeze")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnfreezeDeviceRequest::getDeviceId, UnfreezeDeviceRequest::setDeviceId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnfreezeDeviceRequest::getInstanceId, UnfreezeDeviceRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UnfreezeDeviceResponse::getBody, UnfreezeDeviceResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> updateDevice = genForUpdateDevice();

    private static HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> genForUpdateDevice() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceRequest, UpdateDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDeviceRequest.class, UpdateDeviceResponse.class)
                .withName("UpdateDevice")
                .withUri("/v5/iot/{project_id}/devices/{device_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getDeviceId, UpdateDeviceRequest::setDeviceId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getInstanceId, UpdateDeviceRequest::setInstanceId));
        builder.<UpdateDevice>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDevice.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getBody, UpdateDeviceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeviceProxyRequest, CreateDeviceProxyResponse> createDeviceProxy =
        genForCreateDeviceProxy();

    private static HttpRequestDef<CreateDeviceProxyRequest, CreateDeviceProxyResponse> genForCreateDeviceProxy() {
        // basic
        HttpRequestDef.Builder<CreateDeviceProxyRequest, CreateDeviceProxyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDeviceProxyRequest.class, CreateDeviceProxyResponse.class)
                .withName("CreateDeviceProxy")
                .withUri("/v5/iot/{project_id}/device-proxies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDeviceProxyRequest::getInstanceId, CreateDeviceProxyRequest::setInstanceId));
        builder.<AddDeviceProxy>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDeviceProxy.class),
            f -> f.withMarshaller(CreateDeviceProxyRequest::getBody, CreateDeviceProxyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeviceProxyRequest, DeleteDeviceProxyResponse> deleteDeviceProxy =
        genForDeleteDeviceProxy();

    private static HttpRequestDef<DeleteDeviceProxyRequest, DeleteDeviceProxyResponse> genForDeleteDeviceProxy() {
        // basic
        HttpRequestDef.Builder<DeleteDeviceProxyRequest, DeleteDeviceProxyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeviceProxyRequest.class, DeleteDeviceProxyResponse.class)
                .withName("DeleteDeviceProxy")
                .withUri("/v5/iot/{project_id}/device-proxies/{proxy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceProxyRequest::getProxyId, DeleteDeviceProxyRequest::setProxyId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceProxyRequest::getInstanceId, DeleteDeviceProxyRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDeviceProxyResponse::getBody, DeleteDeviceProxyResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListDeviceProxiesRequest, ListDeviceProxiesResponse> listDeviceProxies =
        genForListDeviceProxies();

    private static HttpRequestDef<ListDeviceProxiesRequest, ListDeviceProxiesResponse> genForListDeviceProxies() {
        // basic
        HttpRequestDef.Builder<ListDeviceProxiesRequest, ListDeviceProxiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDeviceProxiesRequest.class, ListDeviceProxiesResponse.class)
                .withName("ListDeviceProxies")
                .withUri("/v5/iot/{project_id}/device-proxies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceProxiesRequest::getAppId, ListDeviceProxiesRequest::setAppId));
        builder.<String>withRequestField("proxy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceProxiesRequest::getProxyName, ListDeviceProxiesRequest::setProxyName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeviceProxiesRequest::getLimit, ListDeviceProxiesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceProxiesRequest::getMarker, ListDeviceProxiesRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeviceProxiesRequest::getOffset, ListDeviceProxiesRequest::setOffset));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceProxiesRequest::getInstanceId, ListDeviceProxiesRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceProxyRequest, ShowDeviceProxyResponse> showDeviceProxy =
        genForShowDeviceProxy();

    private static HttpRequestDef<ShowDeviceProxyRequest, ShowDeviceProxyResponse> genForShowDeviceProxy() {
        // basic
        HttpRequestDef.Builder<ShowDeviceProxyRequest, ShowDeviceProxyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceProxyRequest.class, ShowDeviceProxyResponse.class)
                .withName("ShowDeviceProxy")
                .withUri("/v5/iot/{project_id}/device-proxies/{proxy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceProxyRequest::getProxyId, ShowDeviceProxyRequest::setProxyId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceProxyRequest::getInstanceId, ShowDeviceProxyRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceProxyRequest, UpdateDeviceProxyResponse> updateDeviceProxy =
        genForUpdateDeviceProxy();

    private static HttpRequestDef<UpdateDeviceProxyRequest, UpdateDeviceProxyResponse> genForUpdateDeviceProxy() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceProxyRequest, UpdateDeviceProxyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDeviceProxyRequest.class, UpdateDeviceProxyResponse.class)
                .withName("UpdateDeviceProxy")
                .withUri("/v5/iot/{project_id}/device-proxies/{proxy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceProxyRequest::getProxyId, UpdateDeviceProxyRequest::setProxyId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceProxyRequest::getInstanceId, UpdateDeviceProxyRequest::setInstanceId));
        builder.<UpdateDeviceProxy>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDeviceProxy.class),
            f -> f.withMarshaller(UpdateDeviceProxyRequest::getBody, UpdateDeviceProxyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceShadowRequest, ShowDeviceShadowResponse> showDeviceShadow =
        genForShowDeviceShadow();

    private static HttpRequestDef<ShowDeviceShadowRequest, ShowDeviceShadowResponse> genForShowDeviceShadow() {
        // basic
        HttpRequestDef.Builder<ShowDeviceShadowRequest, ShowDeviceShadowResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceShadowRequest.class, ShowDeviceShadowResponse.class)
                .withName("ShowDeviceShadow")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/shadow")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceShadowRequest::getDeviceId, ShowDeviceShadowRequest::setDeviceId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceShadowRequest::getInstanceId, ShowDeviceShadowRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceShadowDesiredDataRequest, UpdateDeviceShadowDesiredDataResponse> updateDeviceShadowDesiredData =
        genForUpdateDeviceShadowDesiredData();

    private static HttpRequestDef<UpdateDeviceShadowDesiredDataRequest, UpdateDeviceShadowDesiredDataResponse> genForUpdateDeviceShadowDesiredData() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceShadowDesiredDataRequest, UpdateDeviceShadowDesiredDataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateDeviceShadowDesiredDataRequest.class,
                    UpdateDeviceShadowDesiredDataResponse.class)
                .withName("UpdateDeviceShadowDesiredData")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/shadow")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceShadowDesiredDataRequest::getDeviceId,
                UpdateDeviceShadowDesiredDataRequest::setDeviceId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceShadowDesiredDataRequest::getInstanceId,
                UpdateDeviceShadowDesiredDataRequest::setInstanceId));
        builder.<UpdateDesireds>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDesireds.class),
            f -> f.withMarshaller(UpdateDeviceShadowDesiredDataRequest::getBody,
                UpdateDeviceShadowDesiredDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRoutingFlowControlPolicyRequest, CreateRoutingFlowControlPolicyResponse> createRoutingFlowControlPolicy =
        genForCreateRoutingFlowControlPolicy();

    private static HttpRequestDef<CreateRoutingFlowControlPolicyRequest, CreateRoutingFlowControlPolicyResponse> genForCreateRoutingFlowControlPolicy() {
        // basic
        HttpRequestDef.Builder<CreateRoutingFlowControlPolicyRequest, CreateRoutingFlowControlPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateRoutingFlowControlPolicyRequest.class,
                    CreateRoutingFlowControlPolicyResponse.class)
                .withName("CreateRoutingFlowControlPolicy")
                .withUri("/v5/iot/{project_id}/routing-rule/flowcontrol-policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRoutingFlowControlPolicyRequest::getInstanceId,
                CreateRoutingFlowControlPolicyRequest::setInstanceId));
        builder.<AddFlowControlPolicy>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddFlowControlPolicy.class),
            f -> f.withMarshaller(CreateRoutingFlowControlPolicyRequest::getBody,
                CreateRoutingFlowControlPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRoutingFlowControlPolicyRequest, DeleteRoutingFlowControlPolicyResponse> deleteRoutingFlowControlPolicy =
        genForDeleteRoutingFlowControlPolicy();

    private static HttpRequestDef<DeleteRoutingFlowControlPolicyRequest, DeleteRoutingFlowControlPolicyResponse> genForDeleteRoutingFlowControlPolicy() {
        // basic
        HttpRequestDef.Builder<DeleteRoutingFlowControlPolicyRequest, DeleteRoutingFlowControlPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteRoutingFlowControlPolicyRequest.class,
                    DeleteRoutingFlowControlPolicyResponse.class)
                .withName("DeleteRoutingFlowControlPolicy")
                .withUri("/v5/iot/{project_id}/routing-rule/flowcontrol-policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRoutingFlowControlPolicyRequest::getPolicyId,
                DeleteRoutingFlowControlPolicyRequest::setPolicyId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRoutingFlowControlPolicyRequest::getInstanceId,
                DeleteRoutingFlowControlPolicyRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRoutingFlowControlPolicyResponse::getBody,
                DeleteRoutingFlowControlPolicyResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListRoutingFlowControlPolicyRequest, ListRoutingFlowControlPolicyResponse> listRoutingFlowControlPolicy =
        genForListRoutingFlowControlPolicy();

    private static HttpRequestDef<ListRoutingFlowControlPolicyRequest, ListRoutingFlowControlPolicyResponse> genForListRoutingFlowControlPolicy() {
        // basic
        HttpRequestDef.Builder<ListRoutingFlowControlPolicyRequest, ListRoutingFlowControlPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRoutingFlowControlPolicyRequest.class,
                    ListRoutingFlowControlPolicyResponse.class)
                .withName("ListRoutingFlowControlPolicy")
                .withUri("/v5/iot/{project_id}/routing-rule/flowcontrol-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("scope",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingFlowControlPolicyRequest::getScope,
                ListRoutingFlowControlPolicyRequest::setScope));
        builder.<String>withRequestField("scope_value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingFlowControlPolicyRequest::getScopeValue,
                ListRoutingFlowControlPolicyRequest::setScopeValue));
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingFlowControlPolicyRequest::getPolicyName,
                ListRoutingFlowControlPolicyRequest::setPolicyName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRoutingFlowControlPolicyRequest::getLimit,
                ListRoutingFlowControlPolicyRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingFlowControlPolicyRequest::getMarker,
                ListRoutingFlowControlPolicyRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRoutingFlowControlPolicyRequest::getOffset,
                ListRoutingFlowControlPolicyRequest::setOffset));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingFlowControlPolicyRequest::getInstanceId,
                ListRoutingFlowControlPolicyRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRoutingFlowControlPolicyRequest, ShowRoutingFlowControlPolicyResponse> showRoutingFlowControlPolicy =
        genForShowRoutingFlowControlPolicy();

    private static HttpRequestDef<ShowRoutingFlowControlPolicyRequest, ShowRoutingFlowControlPolicyResponse> genForShowRoutingFlowControlPolicy() {
        // basic
        HttpRequestDef.Builder<ShowRoutingFlowControlPolicyRequest, ShowRoutingFlowControlPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowRoutingFlowControlPolicyRequest.class,
                    ShowRoutingFlowControlPolicyResponse.class)
                .withName("ShowRoutingFlowControlPolicy")
                .withUri("/v5/iot/{project_id}/routing-rule/flowcontrol-policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRoutingFlowControlPolicyRequest::getPolicyId,
                ShowRoutingFlowControlPolicyRequest::setPolicyId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRoutingFlowControlPolicyRequest::getInstanceId,
                ShowRoutingFlowControlPolicyRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRoutingFlowControlPolicyRequest, UpdateRoutingFlowControlPolicyResponse> updateRoutingFlowControlPolicy =
        genForUpdateRoutingFlowControlPolicy();

    private static HttpRequestDef<UpdateRoutingFlowControlPolicyRequest, UpdateRoutingFlowControlPolicyResponse> genForUpdateRoutingFlowControlPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateRoutingFlowControlPolicyRequest, UpdateRoutingFlowControlPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateRoutingFlowControlPolicyRequest.class,
                    UpdateRoutingFlowControlPolicyResponse.class)
                .withName("UpdateRoutingFlowControlPolicy")
                .withUri("/v5/iot/{project_id}/routing-rule/flowcontrol-policy/{policy_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoutingFlowControlPolicyRequest::getPolicyId,
                UpdateRoutingFlowControlPolicyRequest::setPolicyId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoutingFlowControlPolicyRequest::getInstanceId,
                UpdateRoutingFlowControlPolicyRequest::setInstanceId));
        builder.<UpdateFlowControlPolicy>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFlowControlPolicy.class),
            f -> f.withMarshaller(UpdateRoutingFlowControlPolicyRequest::getBody,
                UpdateRoutingFlowControlPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddFunctionsRequest, AddFunctionsResponse> addFunctions = genForAddFunctions();

    private static HttpRequestDef<AddFunctionsRequest, AddFunctionsResponse> genForAddFunctions() {
        // basic
        HttpRequestDef.Builder<AddFunctionsRequest, AddFunctionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddFunctionsRequest.class, AddFunctionsResponse.class)
                .withName("AddFunctions")
                .withUri("/v5/iot/{project_id}/product-functions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddFunctionsRequest::getInstanceId, AddFunctionsRequest::setInstanceId));
        builder.<String>withRequestField("Sp-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddFunctionsRequest::getSpAuthToken, AddFunctionsRequest::setSpAuthToken));
        builder.<String>withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddFunctionsRequest::getStageAuthToken, AddFunctionsRequest::setStageAuthToken));
        builder.<FunctionRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FunctionRequestDTO.class),
            f -> f.withMarshaller(AddFunctionsRequest::getBody, AddFunctionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFunctionsRequest, DeleteFunctionsResponse> deleteFunctions =
        genForDeleteFunctions();

    private static HttpRequestDef<DeleteFunctionsRequest, DeleteFunctionsResponse> genForDeleteFunctions() {
        // basic
        HttpRequestDef.Builder<DeleteFunctionsRequest, DeleteFunctionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFunctionsRequest.class, DeleteFunctionsResponse.class)
                .withName("DeleteFunctions")
                .withUri("/v5/iot/{project_id}/product-functions/{function_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("function_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFunctionsRequest::getFunctionId, DeleteFunctionsRequest::setFunctionId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFunctionsRequest::getInstanceId, DeleteFunctionsRequest::setInstanceId));
        builder.<String>withRequestField("Sp-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFunctionsRequest::getSpAuthToken, DeleteFunctionsRequest::setSpAuthToken));
        builder.<String>withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFunctionsRequest::getStageAuthToken,
                DeleteFunctionsRequest::setStageAuthToken));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteFunctionsResponse::getBody, DeleteFunctionsResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListFunctionsRequest, ListFunctionsResponse> listFunctions =
        genForListFunctions();

    private static HttpRequestDef<ListFunctionsRequest, ListFunctionsResponse> genForListFunctions() {
        // basic
        HttpRequestDef.Builder<ListFunctionsRequest, ListFunctionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFunctionsRequest.class, ListFunctionsResponse.class)
                .withName("ListFunctions")
                .withUri("/v5/iot/{project_id}/product-functions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionsRequest::getAppId, ListFunctionsRequest::setAppId));
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionsRequest::getProductId, ListFunctionsRequest::setProductId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionsRequest::getInstanceId, ListFunctionsRequest::setInstanceId));
        builder.<String>withRequestField("Sp-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionsRequest::getSpAuthToken, ListFunctionsRequest::setSpAuthToken));
        builder.<String>withRequestField("Stage-Auth-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFunctionsRequest::getStageAuthToken, ListFunctionsRequest::setStageAuthToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMessageRequest, CreateMessageResponse> createMessage =
        genForCreateMessage();

    private static HttpRequestDef<CreateMessageRequest, CreateMessageResponse> genForCreateMessage() {
        // basic
        HttpRequestDef.Builder<CreateMessageRequest, CreateMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMessageRequest.class, CreateMessageResponse.class)
                .withName("CreateMessage")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/messages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMessageRequest::getDeviceId, CreateMessageRequest::setDeviceId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMessageRequest::getInstanceId, CreateMessageRequest::setInstanceId));
        builder.<DeviceMessageRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeviceMessageRequest.class),
            f -> f.withMarshaller(CreateMessageRequest::getBody, CreateMessageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDeviceMessagesRequest, ListDeviceMessagesResponse> listDeviceMessages =
        genForListDeviceMessages();

    private static HttpRequestDef<ListDeviceMessagesRequest, ListDeviceMessagesResponse> genForListDeviceMessages() {
        // basic
        HttpRequestDef.Builder<ListDeviceMessagesRequest, ListDeviceMessagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDeviceMessagesRequest.class, ListDeviceMessagesResponse.class)
                .withName("ListDeviceMessages")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/messages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceMessagesRequest::getDeviceId, ListDeviceMessagesRequest::setDeviceId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceMessagesRequest::getInstanceId, ListDeviceMessagesRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceMessageRequest, ShowDeviceMessageResponse> showDeviceMessage =
        genForShowDeviceMessage();

    private static HttpRequestDef<ShowDeviceMessageRequest, ShowDeviceMessageResponse> genForShowDeviceMessage() {
        // basic
        HttpRequestDef.Builder<ShowDeviceMessageRequest, ShowDeviceMessageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceMessageRequest.class, ShowDeviceMessageResponse.class)
                .withName("ShowDeviceMessage")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/messages/{message_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceMessageRequest::getDeviceId, ShowDeviceMessageRequest::setDeviceId));
        builder.<String>withRequestField("message_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceMessageRequest::getMessageId, ShowDeviceMessageRequest::setMessageId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceMessageRequest::getInstanceId, ShowDeviceMessageRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOtaPackageRequest, CreateOtaPackageResponse> createOtaPackage =
        genForCreateOtaPackage();

    private static HttpRequestDef<CreateOtaPackageRequest, CreateOtaPackageResponse> genForCreateOtaPackage() {
        // basic
        HttpRequestDef.Builder<CreateOtaPackageRequest, CreateOtaPackageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateOtaPackageRequest.class, CreateOtaPackageResponse.class)
                .withName("CreateOtaPackage")
                .withUri("/v5/iot/{project_id}/ota-upgrades/packages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOtaPackageRequest::getInstanceId, CreateOtaPackageRequest::setInstanceId));
        builder.<CreateOtaPackage>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOtaPackage.class),
            f -> f.withMarshaller(CreateOtaPackageRequest::getBody, CreateOtaPackageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteOtaPackageRequest, DeleteOtaPackageResponse> deleteOtaPackage =
        genForDeleteOtaPackage();

    private static HttpRequestDef<DeleteOtaPackageRequest, DeleteOtaPackageResponse> genForDeleteOtaPackage() {
        // basic
        HttpRequestDef.Builder<DeleteOtaPackageRequest, DeleteOtaPackageResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteOtaPackageRequest.class, DeleteOtaPackageResponse.class)
                .withName("DeleteOtaPackage")
                .withUri("/v5/iot/{project_id}/ota-upgrades/packages/{package_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("package_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOtaPackageRequest::getPackageId, DeleteOtaPackageRequest::setPackageId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOtaPackageRequest::getInstanceId, DeleteOtaPackageRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteOtaPackageResponse::getBody, DeleteOtaPackageResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListOtaPackageInfoRequest, ListOtaPackageInfoResponse> listOtaPackageInfo =
        genForListOtaPackageInfo();

    private static HttpRequestDef<ListOtaPackageInfoRequest, ListOtaPackageInfoResponse> genForListOtaPackageInfo() {
        // basic
        HttpRequestDef.Builder<ListOtaPackageInfoRequest, ListOtaPackageInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOtaPackageInfoRequest.class, ListOtaPackageInfoResponse.class)
                .withName("ListOtaPackageInfo")
                .withUri("/v5/iot/{project_id}/ota-upgrades/packages")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOtaPackageInfoRequest::getAppId, ListOtaPackageInfoRequest::setAppId));
        builder.<String>withRequestField("package_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOtaPackageInfoRequest::getPackageType,
                ListOtaPackageInfoRequest::setPackageType));
        builder.<String>withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOtaPackageInfoRequest::getProductId, ListOtaPackageInfoRequest::setProductId));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOtaPackageInfoRequest::getVersion, ListOtaPackageInfoRequest::setVersion));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOtaPackageInfoRequest::getLimit, ListOtaPackageInfoRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOtaPackageInfoRequest::getMarker, ListOtaPackageInfoRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOtaPackageInfoRequest::getOffset, ListOtaPackageInfoRequest::setOffset));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOtaPackageInfoRequest::getInstanceId, ListOtaPackageInfoRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOtaPackageRequest, ShowOtaPackageResponse> showOtaPackage =
        genForShowOtaPackage();

    private static HttpRequestDef<ShowOtaPackageRequest, ShowOtaPackageResponse> genForShowOtaPackage() {
        // basic
        HttpRequestDef.Builder<ShowOtaPackageRequest, ShowOtaPackageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOtaPackageRequest.class, ShowOtaPackageResponse.class)
                .withName("ShowOtaPackage")
                .withUri("/v5/iot/{project_id}/ota-upgrades/packages/{package_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("package_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOtaPackageRequest::getPackageId, ShowOtaPackageRequest::setPackageId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOtaPackageRequest::getInstanceId, ShowOtaPackageRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BindDevicePolicyRequest, BindDevicePolicyResponse> bindDevicePolicy =
        genForBindDevicePolicy();

    private static HttpRequestDef<BindDevicePolicyRequest, BindDevicePolicyResponse> genForBindDevicePolicy() {
        // basic
        HttpRequestDef.Builder<BindDevicePolicyRequest, BindDevicePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BindDevicePolicyRequest.class, BindDevicePolicyResponse.class)
                .withName("BindDevicePolicy")
                .withUri("/v5/iot/{project_id}/device-policies/{policy_id}/bind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BindDevicePolicyRequest::getPolicyId, BindDevicePolicyRequest::setPolicyId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BindDevicePolicyRequest::getInstanceId, BindDevicePolicyRequest::setInstanceId));
        builder.<BindDevicePolicy>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BindDevicePolicy.class),
            f -> f.withMarshaller(BindDevicePolicyRequest::getBody, BindDevicePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDevicePolicyRequest, CreateDevicePolicyResponse> createDevicePolicy =
        genForCreateDevicePolicy();

    private static HttpRequestDef<CreateDevicePolicyRequest, CreateDevicePolicyResponse> genForCreateDevicePolicy() {
        // basic
        HttpRequestDef.Builder<CreateDevicePolicyRequest, CreateDevicePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDevicePolicyRequest.class, CreateDevicePolicyResponse.class)
                .withName("CreateDevicePolicy")
                .withUri("/v5/iot/{project_id}/device-policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDevicePolicyRequest::getInstanceId, CreateDevicePolicyRequest::setInstanceId));
        builder.<CreateDevicePolicy>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDevicePolicy.class),
            f -> f.withMarshaller(CreateDevicePolicyRequest::getBody, CreateDevicePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDevicePolicyRequest, DeleteDevicePolicyResponse> deleteDevicePolicy =
        genForDeleteDevicePolicy();

    private static HttpRequestDef<DeleteDevicePolicyRequest, DeleteDevicePolicyResponse> genForDeleteDevicePolicy() {
        // basic
        HttpRequestDef.Builder<DeleteDevicePolicyRequest, DeleteDevicePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDevicePolicyRequest.class, DeleteDevicePolicyResponse.class)
                .withName("DeleteDevicePolicy")
                .withUri("/v5/iot/{project_id}/device-policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDevicePolicyRequest::getPolicyId, DeleteDevicePolicyRequest::setPolicyId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDevicePolicyRequest::getInstanceId, DeleteDevicePolicyRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDevicePolicyResponse::getBody, DeleteDevicePolicyResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListDevicePoliciesRequest, ListDevicePoliciesResponse> listDevicePolicies =
        genForListDevicePolicies();

    private static HttpRequestDef<ListDevicePoliciesRequest, ListDevicePoliciesResponse> genForListDevicePolicies() {
        // basic
        HttpRequestDef.Builder<ListDevicePoliciesRequest, ListDevicePoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDevicePoliciesRequest.class, ListDevicePoliciesResponse.class)
                .withName("ListDevicePolicies")
                .withUri("/v5/iot/{project_id}/device-policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicePoliciesRequest::getAppId, ListDevicePoliciesRequest::setAppId));
        builder.<String>withRequestField("policy_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicePoliciesRequest::getPolicyName, ListDevicePoliciesRequest::setPolicyName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDevicePoliciesRequest::getLimit, ListDevicePoliciesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicePoliciesRequest::getMarker, ListDevicePoliciesRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDevicePoliciesRequest::getOffset, ListDevicePoliciesRequest::setOffset));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicePoliciesRequest::getInstanceId, ListDevicePoliciesRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDevicePolicyRequest, ShowDevicePolicyResponse> showDevicePolicy =
        genForShowDevicePolicy();

    private static HttpRequestDef<ShowDevicePolicyRequest, ShowDevicePolicyResponse> genForShowDevicePolicy() {
        // basic
        HttpRequestDef.Builder<ShowDevicePolicyRequest, ShowDevicePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDevicePolicyRequest.class, ShowDevicePolicyResponse.class)
                .withName("ShowDevicePolicy")
                .withUri("/v5/iot/{project_id}/device-policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDevicePolicyRequest::getPolicyId, ShowDevicePolicyRequest::setPolicyId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDevicePolicyRequest::getInstanceId, ShowDevicePolicyRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTargetsInDevicePolicyRequest, ShowTargetsInDevicePolicyResponse> showTargetsInDevicePolicy =
        genForShowTargetsInDevicePolicy();

    private static HttpRequestDef<ShowTargetsInDevicePolicyRequest, ShowTargetsInDevicePolicyResponse> genForShowTargetsInDevicePolicy() {
        // basic
        HttpRequestDef.Builder<ShowTargetsInDevicePolicyRequest, ShowTargetsInDevicePolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowTargetsInDevicePolicyRequest.class,
                    ShowTargetsInDevicePolicyResponse.class)
                .withName("ShowTargetsInDevicePolicy")
                .withUri("/v5/iot/{project_id}/device-policies/{policy_id}/list-targets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTargetsInDevicePolicyRequest::getPolicyId,
                ShowTargetsInDevicePolicyRequest::setPolicyId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTargetsInDevicePolicyRequest::getInstanceId,
                ShowTargetsInDevicePolicyRequest::setInstanceId));
        builder.<ShowTargetsInDevicePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowTargetsInDevicePolicyRequestBody.class),
            f -> f.withMarshaller(ShowTargetsInDevicePolicyRequest::getBody,
                ShowTargetsInDevicePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnbindDevicePolicyRequest, UnbindDevicePolicyResponse> unbindDevicePolicy =
        genForUnbindDevicePolicy();

    private static HttpRequestDef<UnbindDevicePolicyRequest, UnbindDevicePolicyResponse> genForUnbindDevicePolicy() {
        // basic
        HttpRequestDef.Builder<UnbindDevicePolicyRequest, UnbindDevicePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnbindDevicePolicyRequest.class, UnbindDevicePolicyResponse.class)
                .withName("UnbindDevicePolicy")
                .withUri("/v5/iot/{project_id}/device-policies/{policy_id}/unbind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnbindDevicePolicyRequest::getPolicyId, UnbindDevicePolicyRequest::setPolicyId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnbindDevicePolicyRequest::getInstanceId, UnbindDevicePolicyRequest::setInstanceId));
        builder.<UnBindDevicePolicy>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnBindDevicePolicy.class),
            f -> f.withMarshaller(UnbindDevicePolicyRequest::getBody, UnbindDevicePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDevicePolicyRequest, UpdateDevicePolicyResponse> updateDevicePolicy =
        genForUpdateDevicePolicy();

    private static HttpRequestDef<UpdateDevicePolicyRequest, UpdateDevicePolicyResponse> genForUpdateDevicePolicy() {
        // basic
        HttpRequestDef.Builder<UpdateDevicePolicyRequest, UpdateDevicePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDevicePolicyRequest.class, UpdateDevicePolicyResponse.class)
                .withName("UpdateDevicePolicy")
                .withUri("/v5/iot/{project_id}/device-policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDevicePolicyRequest::getPolicyId, UpdateDevicePolicyRequest::setPolicyId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDevicePolicyRequest::getInstanceId, UpdateDevicePolicyRequest::setInstanceId));
        builder.<UpdateDevicePolicy>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDevicePolicy.class),
            f -> f.withMarshaller(UpdateDevicePolicyRequest::getBody, UpdateDevicePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProductRequest, CreateProductResponse> createProduct =
        genForCreateProduct();

    private static HttpRequestDef<CreateProductRequest, CreateProductResponse> genForCreateProduct() {
        // basic
        HttpRequestDef.Builder<CreateProductRequest, CreateProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProductRequest.class, CreateProductResponse.class)
                .withName("CreateProduct")
                .withUri("/v5/iot/{project_id}/products")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProductRequest::getInstanceId, CreateProductRequest::setInstanceId));
        builder.<AddProduct>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddProduct.class),
            f -> f.withMarshaller(CreateProductRequest::getBody, CreateProductRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProductRequest, DeleteProductResponse> deleteProduct =
        genForDeleteProduct();

    private static HttpRequestDef<DeleteProductRequest, DeleteProductResponse> genForDeleteProduct() {
        // basic
        HttpRequestDef.Builder<DeleteProductRequest, DeleteProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteProductRequest.class, DeleteProductResponse.class)
                .withName("DeleteProduct")
                .withUri("/v5/iot/{project_id}/products/{product_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProductRequest::getProductId, DeleteProductRequest::setProductId));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProductRequest::getAppId, DeleteProductRequest::setAppId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProductRequest::getInstanceId, DeleteProductRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteProductResponse::getBody, DeleteProductResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListProductsRequest, ListProductsResponse> listProducts = genForListProducts();

    private static HttpRequestDef<ListProductsRequest, ListProductsResponse> genForListProducts() {
        // basic
        HttpRequestDef.Builder<ListProductsRequest, ListProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProductsRequest.class, ListProductsResponse.class)
                .withName("ListProducts")
                .withUri("/v5/iot/{project_id}/products")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductsRequest::getLimit, ListProductsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getMarker, ListProductsRequest::setMarker));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getAppId, ListProductsRequest::setAppId));
        builder.<String>withRequestField("product_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getProductName, ListProductsRequest::setProductName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductsRequest::getOffset, ListProductsRequest::setOffset));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getInstanceId, ListProductsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProductRequest, ShowProductResponse> showProduct = genForShowProduct();

    private static HttpRequestDef<ShowProductRequest, ShowProductResponse> genForShowProduct() {
        // basic
        HttpRequestDef.Builder<ShowProductRequest, ShowProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProductRequest.class, ShowProductResponse.class)
                .withName("ShowProduct")
                .withUri("/v5/iot/{project_id}/products/{product_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductRequest::getProductId, ShowProductRequest::setProductId));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductRequest::getAppId, ShowProductRequest::setAppId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductRequest::getInstanceId, ShowProductRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProductRequest, UpdateProductResponse> updateProduct =
        genForUpdateProduct();

    private static HttpRequestDef<UpdateProductRequest, UpdateProductResponse> genForUpdateProduct() {
        // basic
        HttpRequestDef.Builder<UpdateProductRequest, UpdateProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProductRequest.class, UpdateProductResponse.class)
                .withName("UpdateProduct")
                .withUri("/v5/iot/{project_id}/products/{product_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProductRequest::getProductId, UpdateProductRequest::setProductId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProductRequest::getInstanceId, UpdateProductRequest::setInstanceId));
        builder.<UpdateProduct>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProduct.class),
            f -> f.withMarshaller(UpdateProductRequest::getBody, UpdateProductRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPropertiesRequest, ListPropertiesResponse> listProperties =
        genForListProperties();

    private static HttpRequestDef<ListPropertiesRequest, ListPropertiesResponse> genForListProperties() {
        // basic
        HttpRequestDef.Builder<ListPropertiesRequest, ListPropertiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPropertiesRequest.class, ListPropertiesResponse.class)
                .withName("ListProperties")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/properties")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPropertiesRequest::getDeviceId, ListPropertiesRequest::setDeviceId));
        builder.<String>withRequestField("service_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPropertiesRequest::getServiceId, ListPropertiesRequest::setServiceId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPropertiesRequest::getInstanceId, ListPropertiesRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePropertiesRequest, UpdatePropertiesResponse> updateProperties =
        genForUpdateProperties();

    private static HttpRequestDef<UpdatePropertiesRequest, UpdatePropertiesResponse> genForUpdateProperties() {
        // basic
        HttpRequestDef.Builder<UpdatePropertiesRequest, UpdatePropertiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePropertiesRequest.class, UpdatePropertiesResponse.class)
                .withName("UpdateProperties")
                .withUri("/v5/iot/{project_id}/devices/{device_id}/properties")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePropertiesRequest::getDeviceId, UpdatePropertiesRequest::setDeviceId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePropertiesRequest::getInstanceId, UpdatePropertiesRequest::setInstanceId));
        builder.<DevicePropertiesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DevicePropertiesRequest.class),
            f -> f.withMarshaller(UpdatePropertiesRequest::getBody, UpdatePropertiesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProvisioningTemplateRequest, CreateProvisioningTemplateResponse> createProvisioningTemplate =
        genForCreateProvisioningTemplate();

    private static HttpRequestDef<CreateProvisioningTemplateRequest, CreateProvisioningTemplateResponse> genForCreateProvisioningTemplate() {
        // basic
        HttpRequestDef.Builder<CreateProvisioningTemplateRequest, CreateProvisioningTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateProvisioningTemplateRequest.class,
                    CreateProvisioningTemplateResponse.class)
                .withName("CreateProvisioningTemplate")
                .withUri("/v5/iot/{project_id}/provisioning-templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProvisioningTemplateRequest::getInstanceId,
                CreateProvisioningTemplateRequest::setInstanceId));
        builder.<CreateProvisioningTemplate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProvisioningTemplate.class),
            f -> f.withMarshaller(CreateProvisioningTemplateRequest::getBody,
                CreateProvisioningTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProvisioningTemplateRequest, DeleteProvisioningTemplateResponse> deleteProvisioningTemplate =
        genForDeleteProvisioningTemplate();

    private static HttpRequestDef<DeleteProvisioningTemplateRequest, DeleteProvisioningTemplateResponse> genForDeleteProvisioningTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteProvisioningTemplateRequest, DeleteProvisioningTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteProvisioningTemplateRequest.class,
                    DeleteProvisioningTemplateResponse.class)
                .withName("DeleteProvisioningTemplate")
                .withUri("/v5/iot/{project_id}/provisioning-templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProvisioningTemplateRequest::getTemplateId,
                DeleteProvisioningTemplateRequest::setTemplateId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProvisioningTemplateRequest::getInstanceId,
                DeleteProvisioningTemplateRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteProvisioningTemplateResponse::getBody,
                DeleteProvisioningTemplateResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListProvisioningTemplatesRequest, ListProvisioningTemplatesResponse> listProvisioningTemplates =
        genForListProvisioningTemplates();

    private static HttpRequestDef<ListProvisioningTemplatesRequest, ListProvisioningTemplatesResponse> genForListProvisioningTemplates() {
        // basic
        HttpRequestDef.Builder<ListProvisioningTemplatesRequest, ListProvisioningTemplatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListProvisioningTemplatesRequest.class,
                    ListProvisioningTemplatesResponse.class)
                .withName("ListProvisioningTemplates")
                .withUri("/v5/iot/{project_id}/provisioning-templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProvisioningTemplatesRequest::getTemplateName,
                ListProvisioningTemplatesRequest::setTemplateName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProvisioningTemplatesRequest::getLimit,
                ListProvisioningTemplatesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProvisioningTemplatesRequest::getMarker,
                ListProvisioningTemplatesRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProvisioningTemplatesRequest::getOffset,
                ListProvisioningTemplatesRequest::setOffset));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProvisioningTemplatesRequest::getInstanceId,
                ListProvisioningTemplatesRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProvisioningTemplateRequest, ShowProvisioningTemplateResponse> showProvisioningTemplate =
        genForShowProvisioningTemplate();

    private static HttpRequestDef<ShowProvisioningTemplateRequest, ShowProvisioningTemplateResponse> genForShowProvisioningTemplate() {
        // basic
        HttpRequestDef.Builder<ShowProvisioningTemplateRequest, ShowProvisioningTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowProvisioningTemplateRequest.class, ShowProvisioningTemplateResponse.class)
                .withName("ShowProvisioningTemplate")
                .withUri("/v5/iot/{project_id}/provisioning-templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProvisioningTemplateRequest::getTemplateId,
                ShowProvisioningTemplateRequest::setTemplateId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProvisioningTemplateRequest::getInstanceId,
                ShowProvisioningTemplateRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProvisioningTemplateRequest, UpdateProvisioningTemplateResponse> updateProvisioningTemplate =
        genForUpdateProvisioningTemplate();

    private static HttpRequestDef<UpdateProvisioningTemplateRequest, UpdateProvisioningTemplateResponse> genForUpdateProvisioningTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateProvisioningTemplateRequest, UpdateProvisioningTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateProvisioningTemplateRequest.class,
                    UpdateProvisioningTemplateResponse.class)
                .withName("UpdateProvisioningTemplate")
                .withUri("/v5/iot/{project_id}/provisioning-templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProvisioningTemplateRequest::getTemplateId,
                UpdateProvisioningTemplateRequest::setTemplateId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProvisioningTemplateRequest::getInstanceId,
                UpdateProvisioningTemplateRequest::setInstanceId));
        builder.<UpdateProvisioningTemplate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProvisioningTemplate.class),
            f -> f.withMarshaller(UpdateProvisioningTemplateRequest::getBody,
                UpdateProvisioningTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRoutingRuleRequest, CreateRoutingRuleResponse> createRoutingRule =
        genForCreateRoutingRule();

    private static HttpRequestDef<CreateRoutingRuleRequest, CreateRoutingRuleResponse> genForCreateRoutingRule() {
        // basic
        HttpRequestDef.Builder<CreateRoutingRuleRequest, CreateRoutingRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRoutingRuleRequest.class, CreateRoutingRuleResponse.class)
                .withName("CreateRoutingRule")
                .withUri("/v5/iot/{project_id}/routing-rule/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRoutingRuleRequest::getInstanceId, CreateRoutingRuleRequest::setInstanceId));
        builder.<AddRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddRuleReq.class),
            f -> f.withMarshaller(CreateRoutingRuleRequest::getBody, CreateRoutingRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRuleActionRequest, CreateRuleActionResponse> createRuleAction =
        genForCreateRuleAction();

    private static HttpRequestDef<CreateRuleActionRequest, CreateRuleActionResponse> genForCreateRuleAction() {
        // basic
        HttpRequestDef.Builder<CreateRuleActionRequest, CreateRuleActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRuleActionRequest.class, CreateRuleActionResponse.class)
                .withName("CreateRuleAction")
                .withUri("/v5/iot/{project_id}/routing-rule/actions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRuleActionRequest::getInstanceId, CreateRuleActionRequest::setInstanceId));
        builder.<AddActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddActionReq.class),
            f -> f.withMarshaller(CreateRuleActionRequest::getBody, CreateRuleActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRoutingRuleRequest, DeleteRoutingRuleResponse> deleteRoutingRule =
        genForDeleteRoutingRule();

    private static HttpRequestDef<DeleteRoutingRuleRequest, DeleteRoutingRuleResponse> genForDeleteRoutingRule() {
        // basic
        HttpRequestDef.Builder<DeleteRoutingRuleRequest, DeleteRoutingRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRoutingRuleRequest.class, DeleteRoutingRuleResponse.class)
                .withName("DeleteRoutingRule")
                .withUri("/v5/iot/{project_id}/routing-rule/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRoutingRuleRequest::getRuleId, DeleteRoutingRuleRequest::setRuleId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRoutingRuleRequest::getInstanceId, DeleteRoutingRuleRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRoutingRuleResponse::getBody, DeleteRoutingRuleResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRuleActionRequest, DeleteRuleActionResponse> deleteRuleAction =
        genForDeleteRuleAction();

    private static HttpRequestDef<DeleteRuleActionRequest, DeleteRuleActionResponse> genForDeleteRuleAction() {
        // basic
        HttpRequestDef.Builder<DeleteRuleActionRequest, DeleteRuleActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRuleActionRequest.class, DeleteRuleActionResponse.class)
                .withName("DeleteRuleAction")
                .withUri("/v5/iot/{project_id}/routing-rule/actions/{action_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("action_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleActionRequest::getActionId, DeleteRuleActionRequest::setActionId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleActionRequest::getInstanceId, DeleteRuleActionRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRuleActionResponse::getBody, DeleteRuleActionResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListRoutingRulesRequest, ListRoutingRulesResponse> listRoutingRules =
        genForListRoutingRules();

    private static HttpRequestDef<ListRoutingRulesRequest, ListRoutingRulesResponse> genForListRoutingRules() {
        // basic
        HttpRequestDef.Builder<ListRoutingRulesRequest, ListRoutingRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRoutingRulesRequest.class, ListRoutingRulesResponse.class)
                .withName("ListRoutingRules")
                .withUri("/v5/iot/{project_id}/routing-rule/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingRulesRequest::getResource, ListRoutingRulesRequest::setResource));
        builder.<String>withRequestField("event",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingRulesRequest::getEvent, ListRoutingRulesRequest::setEvent));
        builder.<String>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingRulesRequest::getAppType, ListRoutingRulesRequest::setAppType));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingRulesRequest::getAppId, ListRoutingRulesRequest::setAppId));
        builder.<String>withRequestField("rule_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingRulesRequest::getRuleName, ListRoutingRulesRequest::setRuleName));
        builder.<Boolean>withRequestField("active",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRoutingRulesRequest::getActive, ListRoutingRulesRequest::setActive));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRoutingRulesRequest::getLimit, ListRoutingRulesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingRulesRequest::getMarker, ListRoutingRulesRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRoutingRulesRequest::getOffset, ListRoutingRulesRequest::setOffset));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutingRulesRequest::getInstanceId, ListRoutingRulesRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRuleActionsRequest, ListRuleActionsResponse> listRuleActions =
        genForListRuleActions();

    private static HttpRequestDef<ListRuleActionsRequest, ListRuleActionsResponse> genForListRuleActions() {
        // basic
        HttpRequestDef.Builder<ListRuleActionsRequest, ListRuleActionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRuleActionsRequest.class, ListRuleActionsResponse.class)
                .withName("ListRuleActions")
                .withUri("/v5/iot/{project_id}/routing-rule/actions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleActionsRequest::getRuleId, ListRuleActionsRequest::setRuleId));
        builder.<String>withRequestField("channel",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleActionsRequest::getChannel, ListRuleActionsRequest::setChannel));
        builder.<String>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleActionsRequest::getAppType, ListRuleActionsRequest::setAppType));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleActionsRequest::getAppId, ListRuleActionsRequest::setAppId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleActionsRequest::getLimit, ListRuleActionsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleActionsRequest::getMarker, ListRuleActionsRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleActionsRequest::getOffset, ListRuleActionsRequest::setOffset));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleActionsRequest::getInstanceId, ListRuleActionsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRoutingRuleRequest, ShowRoutingRuleResponse> showRoutingRule =
        genForShowRoutingRule();

    private static HttpRequestDef<ShowRoutingRuleRequest, ShowRoutingRuleResponse> genForShowRoutingRule() {
        // basic
        HttpRequestDef.Builder<ShowRoutingRuleRequest, ShowRoutingRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRoutingRuleRequest.class, ShowRoutingRuleResponse.class)
                .withName("ShowRoutingRule")
                .withUri("/v5/iot/{project_id}/routing-rule/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRoutingRuleRequest::getRuleId, ShowRoutingRuleRequest::setRuleId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRoutingRuleRequest::getInstanceId, ShowRoutingRuleRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRuleActionRequest, ShowRuleActionResponse> showRuleAction =
        genForShowRuleAction();

    private static HttpRequestDef<ShowRuleActionRequest, ShowRuleActionResponse> genForShowRuleAction() {
        // basic
        HttpRequestDef.Builder<ShowRuleActionRequest, ShowRuleActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRuleActionRequest.class, ShowRuleActionResponse.class)
                .withName("ShowRuleAction")
                .withUri("/v5/iot/{project_id}/routing-rule/actions/{action_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("action_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRuleActionRequest::getActionId, ShowRuleActionRequest::setActionId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRuleActionRequest::getInstanceId, ShowRuleActionRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRoutingRuleRequest, UpdateRoutingRuleResponse> updateRoutingRule =
        genForUpdateRoutingRule();

    private static HttpRequestDef<UpdateRoutingRuleRequest, UpdateRoutingRuleResponse> genForUpdateRoutingRule() {
        // basic
        HttpRequestDef.Builder<UpdateRoutingRuleRequest, UpdateRoutingRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRoutingRuleRequest.class, UpdateRoutingRuleResponse.class)
                .withName("UpdateRoutingRule")
                .withUri("/v5/iot/{project_id}/routing-rule/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoutingRuleRequest::getRuleId, UpdateRoutingRuleRequest::setRuleId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoutingRuleRequest::getInstanceId, UpdateRoutingRuleRequest::setInstanceId));
        builder.<UpdateRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRuleReq.class),
            f -> f.withMarshaller(UpdateRoutingRuleRequest::getBody, UpdateRoutingRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRuleActionRequest, UpdateRuleActionResponse> updateRuleAction =
        genForUpdateRuleAction();

    private static HttpRequestDef<UpdateRuleActionRequest, UpdateRuleActionResponse> genForUpdateRuleAction() {
        // basic
        HttpRequestDef.Builder<UpdateRuleActionRequest, UpdateRuleActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRuleActionRequest.class, UpdateRuleActionResponse.class)
                .withName("UpdateRuleAction")
                .withUri("/v5/iot/{project_id}/routing-rule/actions/{action_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("action_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRuleActionRequest::getActionId, UpdateRuleActionRequest::setActionId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRuleActionRequest::getInstanceId, UpdateRuleActionRequest::setInstanceId));
        builder.<UpdateActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateActionReq.class),
            f -> f.withMarshaller(UpdateRuleActionRequest::getBody, UpdateRuleActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeRuleStatusRequest, ChangeRuleStatusResponse> changeRuleStatus =
        genForChangeRuleStatus();

    private static HttpRequestDef<ChangeRuleStatusRequest, ChangeRuleStatusResponse> genForChangeRuleStatus() {
        // basic
        HttpRequestDef.Builder<ChangeRuleStatusRequest, ChangeRuleStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeRuleStatusRequest.class, ChangeRuleStatusResponse.class)
                .withName("ChangeRuleStatus")
                .withUri("/v5/iot/{project_id}/rules/{rule_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeRuleStatusRequest::getRuleId, ChangeRuleStatusRequest::setRuleId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeRuleStatusRequest::getInstanceId, ChangeRuleStatusRequest::setInstanceId));
        builder.<RuleStatus>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RuleStatus.class),
            f -> f.withMarshaller(ChangeRuleStatusRequest::getBody, ChangeRuleStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRuleRequest, CreateRuleResponse> createRule = genForCreateRule();

    private static HttpRequestDef<CreateRuleRequest, CreateRuleResponse> genForCreateRule() {
        // basic
        HttpRequestDef.Builder<CreateRuleRequest, CreateRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRuleRequest.class, CreateRuleResponse.class)
                .withName("CreateRule")
                .withUri("/v5/iot/{project_id}/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRuleRequest::getInstanceId, CreateRuleRequest::setInstanceId));
        builder.<Rule>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Rule.class),
            f -> f.withMarshaller(CreateRuleRequest::getBody, CreateRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> deleteRule = genForDeleteRule();

    private static HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> genForDeleteRule() {
        // basic
        HttpRequestDef.Builder<DeleteRuleRequest, DeleteRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRuleRequest.class, DeleteRuleResponse.class)
                .withName("DeleteRule")
                .withUri("/v5/iot/{project_id}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleRequest::getRuleId, DeleteRuleRequest::setRuleId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleRequest::getInstanceId, DeleteRuleRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRuleResponse::getBody, DeleteRuleResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListRulesRequest, ListRulesResponse> listRules = genForListRules();

    private static HttpRequestDef<ListRulesRequest, ListRulesResponse> genForListRules() {
        // basic
        HttpRequestDef.Builder<ListRulesRequest, ListRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRulesRequest.class, ListRulesResponse.class)
                .withName("ListRules")
                .withUri("/v5/iot/{project_id}/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRulesRequest::getAppId, ListRulesRequest::setAppId));
        builder.<String>withRequestField("rule_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRulesRequest::getRuleType, ListRulesRequest::setRuleType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRulesRequest::getLimit, ListRulesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRulesRequest::getMarker, ListRulesRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRulesRequest::getOffset, ListRulesRequest::setOffset));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRulesRequest::getInstanceId, ListRulesRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRuleRequest, ShowRuleResponse> showRule = genForShowRule();

    private static HttpRequestDef<ShowRuleRequest, ShowRuleResponse> genForShowRule() {
        // basic
        HttpRequestDef.Builder<ShowRuleRequest, ShowRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRuleRequest.class, ShowRuleResponse.class)
                .withName("ShowRule")
                .withUri("/v5/iot/{project_id}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRuleRequest::getRuleId, ShowRuleRequest::setRuleId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRuleRequest::getInstanceId, ShowRuleRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRuleRequest, UpdateRuleResponse> updateRule = genForUpdateRule();

    private static HttpRequestDef<UpdateRuleRequest, UpdateRuleResponse> genForUpdateRule() {
        // basic
        HttpRequestDef.Builder<UpdateRuleRequest, UpdateRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRuleRequest.class, UpdateRuleResponse.class)
                .withName("UpdateRule")
                .withUri("/v5/iot/{project_id}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRuleRequest::getRuleId, UpdateRuleRequest::setRuleId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRuleRequest::getInstanceId, UpdateRuleRequest::setInstanceId));
        builder.<Rule>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Rule.class),
            f -> f.withMarshaller(UpdateRuleRequest::getBody, UpdateRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourcesByTagsRequest, ListResourcesByTagsResponse> listResourcesByTags =
        genForListResourcesByTags();

    private static HttpRequestDef<ListResourcesByTagsRequest, ListResourcesByTagsResponse> genForListResourcesByTags() {
        // basic
        HttpRequestDef.Builder<ListResourcesByTagsRequest, ListResourcesByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListResourcesByTagsRequest.class, ListResourcesByTagsResponse.class)
                .withName("ListResourcesByTags")
                .withUri("/v5/iot/{project_id}/tags/query-resources")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourcesByTagsRequest::getLimit, ListResourcesByTagsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesByTagsRequest::getMarker, ListResourcesByTagsRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourcesByTagsRequest::getOffset, ListResourcesByTagsRequest::setOffset));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcesByTagsRequest::getInstanceId,
                ListResourcesByTagsRequest::setInstanceId));
        builder.<QueryResourceByTagsDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(QueryResourceByTagsDTO.class),
            f -> f.withMarshaller(ListResourcesByTagsRequest::getBody, ListResourcesByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TagDeviceRequest, TagDeviceResponse> tagDevice = genForTagDevice();

    private static HttpRequestDef<TagDeviceRequest, TagDeviceResponse> genForTagDevice() {
        // basic
        HttpRequestDef.Builder<TagDeviceRequest, TagDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, TagDeviceRequest.class, TagDeviceResponse.class)
                .withName("TagDevice")
                .withUri("/v5/iot/{project_id}/tags/bind-resource")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(TagDeviceRequest::getInstanceId, TagDeviceRequest::setInstanceId));
        builder.<BindTagsDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BindTagsDTO.class),
            f -> f.withMarshaller(TagDeviceRequest::getBody, TagDeviceRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(TagDeviceResponse::getBody, TagDeviceResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UntagDeviceRequest, UntagDeviceResponse> untagDevice = genForUntagDevice();

    private static HttpRequestDef<UntagDeviceRequest, UntagDeviceResponse> genForUntagDevice() {
        // basic
        HttpRequestDef.Builder<UntagDeviceRequest, UntagDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UntagDeviceRequest.class, UntagDeviceResponse.class)
                .withName("UntagDevice")
                .withUri("/v5/iot/{project_id}/tags/unbind-resource")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UntagDeviceRequest::getInstanceId, UntagDeviceRequest::setInstanceId));
        builder.<UnbindTagsDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UnbindTagsDTO.class),
            f -> f.withMarshaller(UntagDeviceRequest::getBody, UntagDeviceRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UntagDeviceResponse::getBody, UntagDeviceResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<AddTunnelRequest, AddTunnelResponse> addTunnel = genForAddTunnel();

    private static HttpRequestDef<AddTunnelRequest, AddTunnelResponse> genForAddTunnel() {
        // basic
        HttpRequestDef.Builder<AddTunnelRequest, AddTunnelResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddTunnelRequest.class, AddTunnelResponse.class)
                .withName("AddTunnel")
                .withUri("/v5/iot/{project_id}/tunnels")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddTunnelRequest::getInstanceId, AddTunnelRequest::setInstanceId));
        builder.<AddTunnelDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddTunnelDto.class),
            f -> f.withMarshaller(AddTunnelRequest::getBody, AddTunnelRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CloseDeviceTunnelRequest, CloseDeviceTunnelResponse> closeDeviceTunnel =
        genForCloseDeviceTunnel();

    private static HttpRequestDef<CloseDeviceTunnelRequest, CloseDeviceTunnelResponse> genForCloseDeviceTunnel() {
        // basic
        HttpRequestDef.Builder<CloseDeviceTunnelRequest, CloseDeviceTunnelResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CloseDeviceTunnelRequest.class, CloseDeviceTunnelResponse.class)
                .withName("CloseDeviceTunnel")
                .withUri("/v5/iot/{project_id}/tunnels/{tunnel_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tunnel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CloseDeviceTunnelRequest::getTunnelId, CloseDeviceTunnelRequest::setTunnelId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CloseDeviceTunnelRequest::getInstanceId, CloseDeviceTunnelRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CloseDeviceTunnelResponse::getBody, CloseDeviceTunnelResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeviceTunnelRequest, DeleteDeviceTunnelResponse> deleteDeviceTunnel =
        genForDeleteDeviceTunnel();

    private static HttpRequestDef<DeleteDeviceTunnelRequest, DeleteDeviceTunnelResponse> genForDeleteDeviceTunnel() {
        // basic
        HttpRequestDef.Builder<DeleteDeviceTunnelRequest, DeleteDeviceTunnelResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeviceTunnelRequest.class, DeleteDeviceTunnelResponse.class)
                .withName("DeleteDeviceTunnel")
                .withUri("/v5/iot/{project_id}/tunnels/{tunnel_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tunnel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceTunnelRequest::getTunnelId, DeleteDeviceTunnelRequest::setTunnelId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceTunnelRequest::getInstanceId, DeleteDeviceTunnelRequest::setInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDeviceTunnelResponse::getBody, DeleteDeviceTunnelResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListDeviceTunnelsRequest, ListDeviceTunnelsResponse> listDeviceTunnels =
        genForListDeviceTunnels();

    private static HttpRequestDef<ListDeviceTunnelsRequest, ListDeviceTunnelsResponse> genForListDeviceTunnels() {
        // basic
        HttpRequestDef.Builder<ListDeviceTunnelsRequest, ListDeviceTunnelsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDeviceTunnelsRequest.class, ListDeviceTunnelsResponse.class)
                .withName("ListDeviceTunnels")
                .withUri("/v5/iot/{project_id}/tunnels")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceTunnelsRequest::getDeviceId, ListDeviceTunnelsRequest::setDeviceId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceTunnelsRequest::getInstanceId, ListDeviceTunnelsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceTunnelRequest, ShowDeviceTunnelResponse> showDeviceTunnel =
        genForShowDeviceTunnel();

    private static HttpRequestDef<ShowDeviceTunnelRequest, ShowDeviceTunnelResponse> genForShowDeviceTunnel() {
        // basic
        HttpRequestDef.Builder<ShowDeviceTunnelRequest, ShowDeviceTunnelResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceTunnelRequest.class, ShowDeviceTunnelResponse.class)
                .withName("ShowDeviceTunnel")
                .withUri("/v5/iot/{project_id}/tunnels/{tunnel_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tunnel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceTunnelRequest::getTunnelId, ShowDeviceTunnelRequest::setTunnelId));
        builder.<String>withRequestField("Instance-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceTunnelRequest::getInstanceId, ShowDeviceTunnelRequest::setInstanceId));

        // response

        return builder.build();
    }

}
