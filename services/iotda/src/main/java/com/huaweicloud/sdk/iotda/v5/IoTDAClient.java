package com.huaweicloud.sdk.iotda.v5;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.iotda.v5.model.*;

public class IoTDAClient {
    protected HcClient hcClient;

    public IoTDAClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IoTDAClient> newBuilder() {
        return new ClientBuilder<>(IoTDAClient::new);
    }

    public AddApplicationResponse addApplication(AddApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.addApplication);
    }

    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteApplication);
    }

    public ShowApplicationResponse showApplication(ShowApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showApplication);
    }

    public ShowApplicationsResponse showApplications(ShowApplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showApplications);
    }

    public CreateBatchTaskResponse createBatchTask(CreateBatchTaskRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createBatchTask);
    }

    public ListBatchTasksResponse listBatchTasks(ListBatchTasksRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listBatchTasks);
    }

    public ShowBatchTaskResponse showBatchTask(ShowBatchTaskRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showBatchTask);
    }

    public AddCertificateResponse addCertificate(AddCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.addCertificate);
    }

    public CheckCertificateResponse checkCertificate(CheckCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.checkCertificate);
    }

    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteCertificate);
    }

    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listCertificates);
    }

    public CreateCommandResponse createCommand(CreateCommandRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createCommand);
    }

    public AddDeviceGroupResponse addDeviceGroup(AddDeviceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.addDeviceGroup);
    }

    public CreateOrDeleteDeviceInGroupResponse createOrDeleteDeviceInGroup(CreateOrDeleteDeviceInGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createOrDeleteDeviceInGroup);
    }

    public DeleteDeviceGroupResponse deleteDeviceGroup(DeleteDeviceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteDeviceGroup);
    }

    public ListDeviceGroupsResponse listDeviceGroups(ListDeviceGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listDeviceGroups);
    }

    public ShowDeviceGroupResponse showDeviceGroup(ShowDeviceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showDeviceGroup);
    }

    public ShowDevicesInGroupResponse showDevicesInGroup(ShowDevicesInGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showDevicesInGroup);
    }

    public UpdateDeviceGroupResponse updateDeviceGroup(UpdateDeviceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateDeviceGroup);
    }

    public AddDeviceResponse addDevice(AddDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.addDevice);
    }

    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteDevice);
    }

    public FreezeDeviceResponse freezeDevice(FreezeDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.freezeDevice);
    }

    public ListDevicesResponse listDevices(ListDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listDevices);
    }

    public ResetDeviceSecretResponse resetDeviceSecret(ResetDeviceSecretRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.resetDeviceSecret);
    }

    public ShowDeviceResponse showDevice(ShowDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showDevice);
    }

    public UnfreezeDeviceResponse unfreezeDevice(UnfreezeDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.unfreezeDevice);
    }

    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateDevice);
    }

    public ShowDeviceShadowResponse showDeviceShadow(ShowDeviceShadowRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showDeviceShadow);
    }

    public UpdateDeviceShadowDesiredDataResponse updateDeviceShadowDesiredData(UpdateDeviceShadowDesiredDataRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateDeviceShadowDesiredData);
    }

    public CreateMessageResponse createMessage(CreateMessageRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createMessage);
    }

    public ListDeviceMessagesResponse listDeviceMessages(ListDeviceMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listDeviceMessages);
    }

    public ShowDeviceMessageResponse showDeviceMessage(ShowDeviceMessageRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showDeviceMessage);
    }

    public CreateProductResponse createProduct(CreateProductRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createProduct);
    }

    public DeleteProductResponse deleteProduct(DeleteProductRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteProduct);
    }

    public ListProductsResponse listProducts(ListProductsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listProducts);
    }

    public ShowProductResponse showProduct(ShowProductRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showProduct);
    }

    public UpdateProductResponse updateProduct(UpdateProductRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateProduct);
    }

    public ListPropertiesResponse listProperties(ListPropertiesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listProperties);
    }

    public UpdatePropertiesResponse updateProperties(UpdatePropertiesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateProperties);
    }

    public ChangeRuleStatusResponse changeRuleStatus(ChangeRuleStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.changeRuleStatus);
    }

    public CreateRuleResponse createRule(CreateRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createRule);
    }

    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteRule);
    }

    public ListRulesResponse listRules(ListRulesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listRules);
    }

    public ShowRuleResponse showRule(ShowRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showRule);
    }

    public UpdateRuleResponse updateRule(UpdateRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateRule);
    }

    public CreateSubscriptionResponse createSubscription(CreateSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createSubscription);
    }

    public DeleteSubscriptionResponse deleteSubscription(DeleteSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteSubscription);
    }

    public ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listSubscriptions);
    }

    public ShowSubscriptionResponse showSubscription(ShowSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showSubscription);
    }

    public UpdateSubscriptionResponse updateSubscription(UpdateSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateSubscription);
    }

    public ListResourcesByTagsResponse listResourcesByTags(ListResourcesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listResourcesByTags);
    }

    public TagDeviceResponse tagDevice(TagDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.tagDevice);
    }

    public UntagDeviceResponse untagDevice(UntagDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.untagDevice);
    }

}