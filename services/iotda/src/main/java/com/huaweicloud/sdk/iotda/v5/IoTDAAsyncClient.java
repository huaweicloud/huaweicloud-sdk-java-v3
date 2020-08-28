package com.huaweicloud.sdk.iotda.v5;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.iotda.v5.model.*;

public class IoTDAAsyncClient {
    protected HcClient hcClient;

    public IoTDAAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IoTDAAsyncClient> newBuilder() {
        return new ClientBuilder<>(IoTDAAsyncClient::new);
    }


    public CompletableFuture<AddApplicationResponse> addApplicationAsync(AddApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.addApplication);
    }

    public CompletableFuture<DeleteApplicationResponse> deleteApplicationAsync(DeleteApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteApplication);
    }

    public CompletableFuture<ShowApplicationResponse> showApplicationAsync(ShowApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showApplication);
    }

    public CompletableFuture<ShowApplicationsResponse> showApplicationsAsync(ShowApplicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showApplications);
    }

    public CompletableFuture<CreateAsyncCommandResponse> createAsyncCommandAsync(CreateAsyncCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createAsyncCommand);
    }

    public CompletableFuture<ShowAsyncDeviceCommandResponse> showAsyncDeviceCommandAsync(ShowAsyncDeviceCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showAsyncDeviceCommand);
    }

    public CompletableFuture<CreateBatchTaskResponse> createBatchTaskAsync(CreateBatchTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createBatchTask);
    }

    public CompletableFuture<ListBatchTasksResponse> listBatchTasksAsync(ListBatchTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listBatchTasks);
    }

    public CompletableFuture<ShowBatchTaskResponse> showBatchTaskAsync(ShowBatchTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showBatchTask);
    }

    public CompletableFuture<DeleteBatchTaskFileResponse> deleteBatchTaskFileAsync(DeleteBatchTaskFileRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteBatchTaskFile);
    }

    public CompletableFuture<ListBatchTaskFilesResponse> listBatchTaskFilesAsync(ListBatchTaskFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listBatchTaskFiles);
    }

    public CompletableFuture<AddCertificateResponse> addCertificateAsync(AddCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.addCertificate);
    }

    public CompletableFuture<CheckCertificateResponse> checkCertificateAsync(CheckCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.checkCertificate);
    }

    public CompletableFuture<DeleteCertificateResponse> deleteCertificateAsync(DeleteCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteCertificate);
    }

    public CompletableFuture<ListCertificatesResponse> listCertificatesAsync(ListCertificatesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listCertificates);
    }

    public CompletableFuture<CreateCommandResponse> createCommandAsync(CreateCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createCommand);
    }

    public CompletableFuture<AddDeviceGroupResponse> addDeviceGroupAsync(AddDeviceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.addDeviceGroup);
    }

    public CompletableFuture<CreateOrDeleteDeviceInGroupResponse> createOrDeleteDeviceInGroupAsync(CreateOrDeleteDeviceInGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createOrDeleteDeviceInGroup);
    }

    public CompletableFuture<DeleteDeviceGroupResponse> deleteDeviceGroupAsync(DeleteDeviceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteDeviceGroup);
    }

    public CompletableFuture<ListDeviceGroupsResponse> listDeviceGroupsAsync(ListDeviceGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listDeviceGroups);
    }

    public CompletableFuture<ShowDeviceGroupResponse> showDeviceGroupAsync(ShowDeviceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showDeviceGroup);
    }

    public CompletableFuture<ShowDevicesInGroupResponse> showDevicesInGroupAsync(ShowDevicesInGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showDevicesInGroup);
    }

    public CompletableFuture<UpdateDeviceGroupResponse> updateDeviceGroupAsync(UpdateDeviceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateDeviceGroup);
    }

    public CompletableFuture<AddDeviceResponse> addDeviceAsync(AddDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.addDevice);
    }

    public CompletableFuture<DeleteDeviceResponse> deleteDeviceAsync(DeleteDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteDevice);
    }

    public CompletableFuture<FreezeDeviceResponse> freezeDeviceAsync(FreezeDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.freezeDevice);
    }

    public CompletableFuture<ListDevicesResponse> listDevicesAsync(ListDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listDevices);
    }

    public CompletableFuture<ResetDeviceSecretResponse> resetDeviceSecretAsync(ResetDeviceSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.resetDeviceSecret);
    }

    public CompletableFuture<ShowDeviceResponse> showDeviceAsync(ShowDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showDevice);
    }

    public CompletableFuture<UnfreezeDeviceResponse> unfreezeDeviceAsync(UnfreezeDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.unfreezeDevice);
    }

    public CompletableFuture<UpdateDeviceResponse> updateDeviceAsync(UpdateDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateDevice);
    }

    public CompletableFuture<ShowDeviceShadowResponse> showDeviceShadowAsync(ShowDeviceShadowRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showDeviceShadow);
    }

    public CompletableFuture<UpdateDeviceShadowDesiredDataResponse> updateDeviceShadowDesiredDataAsync(UpdateDeviceShadowDesiredDataRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateDeviceShadowDesiredData);
    }

    public CompletableFuture<CreateMessageResponse> createMessageAsync(CreateMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createMessage);
    }

    public CompletableFuture<ListDeviceMessagesResponse> listDeviceMessagesAsync(ListDeviceMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listDeviceMessages);
    }

    public CompletableFuture<ShowDeviceMessageResponse> showDeviceMessageAsync(ShowDeviceMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showDeviceMessage);
    }

    public CompletableFuture<CreateProductResponse> createProductAsync(CreateProductRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createProduct);
    }

    public CompletableFuture<DeleteProductResponse> deleteProductAsync(DeleteProductRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteProduct);
    }

    public CompletableFuture<ListProductsResponse> listProductsAsync(ListProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listProducts);
    }

    public CompletableFuture<ShowProductResponse> showProductAsync(ShowProductRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showProduct);
    }

    public CompletableFuture<UpdateProductResponse> updateProductAsync(UpdateProductRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateProduct);
    }

    public CompletableFuture<ListPropertiesResponse> listPropertiesAsync(ListPropertiesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listProperties);
    }

    public CompletableFuture<UpdatePropertiesResponse> updatePropertiesAsync(UpdatePropertiesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateProperties);
    }

    public CompletableFuture<ChangeRuleStatusResponse> changeRuleStatusAsync(ChangeRuleStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.changeRuleStatus);
    }

    public CompletableFuture<CreateRuleResponse> createRuleAsync(CreateRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createRule);
    }

    public CompletableFuture<DeleteRuleResponse> deleteRuleAsync(DeleteRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteRule);
    }

    public CompletableFuture<ListRulesResponse> listRulesAsync(ListRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listRules);
    }

    public CompletableFuture<ShowRuleResponse> showRuleAsync(ShowRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showRule);
    }

    public CompletableFuture<UpdateRuleResponse> updateRuleAsync(UpdateRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateRule);
    }

    public CompletableFuture<CreateSubscriptionResponse> createSubscriptionAsync(CreateSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createSubscription);
    }

    public CompletableFuture<DeleteSubscriptionResponse> deleteSubscriptionAsync(DeleteSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteSubscription);
    }

    public CompletableFuture<ListSubscriptionsResponse> listSubscriptionsAsync(ListSubscriptionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listSubscriptions);
    }

    public CompletableFuture<ShowSubscriptionResponse> showSubscriptionAsync(ShowSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showSubscription);
    }

    public CompletableFuture<UpdateSubscriptionResponse> updateSubscriptionAsync(UpdateSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateSubscription);
    }

    public CompletableFuture<ListResourcesByTagsResponse> listResourcesByTagsAsync(ListResourcesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listResourcesByTags);
    }

    public CompletableFuture<TagDeviceResponse> tagDeviceAsync(TagDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.tagDevice);
    }

    public CompletableFuture<UntagDeviceResponse> untagDeviceAsync(UntagDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.untagDevice);
    }

}