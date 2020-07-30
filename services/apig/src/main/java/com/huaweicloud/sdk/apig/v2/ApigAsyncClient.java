package com.huaweicloud.sdk.apig.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.apig.v2.model.*;

public class ApigAsyncClient {
    protected HcClient hcClient;

    public ApigAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ApigAsyncClient> newBuilder() {
        return new ClientBuilder<>(ApigAsyncClient::new);
    }


    public CompletableFuture<AssociateCertificateV2Response> associateCertificateV2Async(AssociateCertificateV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.associateCertificateV2);
    }

    public CompletableFuture<AssociateDomainV2Response> associateDomainV2Async(AssociateDomainV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.associateDomainV2);
    }

    public CompletableFuture<AssociateSignatureKeyV2Response> associateSignatureKeyV2Async(AssociateSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.associateSignatureKeyV2);
    }

    public CompletableFuture<CreateEnvironmentV2Response> createEnvironmentV2Async(CreateEnvironmentV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createEnvironmentV2);
    }

    public CompletableFuture<CreateEnvironmentVariableV2Response> createEnvironmentVariableV2Async(CreateEnvironmentVariableV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createEnvironmentVariableV2);
    }

    public CompletableFuture<CreateRequestThrottlingPolicyV2Response> createRequestThrottlingPolicyV2Async(CreateRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createRequestThrottlingPolicyV2);
    }

    public CompletableFuture<CreateSignatureKeyV2Response> createSignatureKeyV2Async(CreateSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createSignatureKeyV2);
    }

    public CompletableFuture<CreateSpecialThrottlingConfigurationV2Response> createSpecialThrottlingConfigurationV2Async(CreateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createSpecialThrottlingConfigurationV2);
    }

    public CompletableFuture<DeleteEnvironmentV2Response> deleteEnvironmentV2Async(DeleteEnvironmentV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteEnvironmentV2);
    }

    public CompletableFuture<DeleteEnvironmentVariableV2Response> deleteEnvironmentVariableV2Async(DeleteEnvironmentVariableV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteEnvironmentVariableV2);
    }

    public CompletableFuture<DeleteRequestThrottlingPolicyV2Response> deleteRequestThrottlingPolicyV2Async(DeleteRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteRequestThrottlingPolicyV2);
    }

    public CompletableFuture<DeleteSignatureKeyV2Response> deleteSignatureKeyV2Async(DeleteSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteSignatureKeyV2);
    }

    public CompletableFuture<DeleteSpecialThrottlingConfigurationV2Response> deleteSpecialThrottlingConfigurationV2Async(DeleteSpecialThrottlingConfigurationV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteSpecialThrottlingConfigurationV2);
    }

    public CompletableFuture<DisassociateCertificateV2Response> disassociateCertificateV2Async(DisassociateCertificateV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.disassociateCertificateV2);
    }

    public CompletableFuture<DisassociateDomainV2Response> disassociateDomainV2Async(DisassociateDomainV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.disassociateDomainV2);
    }

    public CompletableFuture<DisassociateSignatureKeyV2Response> disassociateSignatureKeyV2Async(DisassociateSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.disassociateSignatureKeyV2);
    }

    public CompletableFuture<ListApiGroupsQuantitiesV2Response> listApiGroupsQuantitiesV2Async(ListApiGroupsQuantitiesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApiGroupsQuantitiesV2);
    }

    public CompletableFuture<ListApiQuantitiesV2Response> listApiQuantitiesV2Async(ListApiQuantitiesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApiQuantitiesV2);
    }

    public CompletableFuture<ListApisBindedToSignatureKeyV2Response> listApisBindedToSignatureKeyV2Async(ListApisBindedToSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisBindedToSignatureKeyV2);
    }

    public CompletableFuture<ListApisNotBoundWithSignatureKeyV2Response> listApisNotBoundWithSignatureKeyV2Async(ListApisNotBoundWithSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisNotBoundWithSignatureKeyV2);
    }

    public CompletableFuture<ListAppQuantitiesV2Response> listAppQuantitiesV2Async(ListAppQuantitiesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAppQuantitiesV2);
    }

    public CompletableFuture<ListEnvironmentVariablesV2Response> listEnvironmentVariablesV2Async(ListEnvironmentVariablesV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listEnvironmentVariablesV2);
    }

    public CompletableFuture<ListEnvironmentsV2Response> listEnvironmentsV2Async(ListEnvironmentsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listEnvironmentsV2);
    }

    public CompletableFuture<ListRequestThrottlingPolicyV2Response> listRequestThrottlingPolicyV2Async(ListRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listRequestThrottlingPolicyV2);
    }

    public CompletableFuture<ListSignatureKeysBindedToApiV2Response> listSignatureKeysBindedToApiV2Async(ListSignatureKeysBindedToApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listSignatureKeysBindedToApiV2);
    }

    public CompletableFuture<ListSignatureKeysV2Response> listSignatureKeysV2Async(ListSignatureKeysV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listSignatureKeysV2);
    }

    public CompletableFuture<ListSpecialThrottlingConfigurationsV2Response> listSpecialThrottlingConfigurationsV2Async(ListSpecialThrottlingConfigurationsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listSpecialThrottlingConfigurationsV2);
    }

    public CompletableFuture<ShowDetailsOfDomainNameCertificateV2Response> showDetailsOfDomainNameCertificateV2Async(ShowDetailsOfDomainNameCertificateV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfDomainNameCertificateV2);
    }

    public CompletableFuture<ShowDetailsOfEnvironmentVariableV2Response> showDetailsOfEnvironmentVariableV2Async(ShowDetailsOfEnvironmentVariableV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfEnvironmentVariableV2);
    }

    public CompletableFuture<ShowDetailsOfRequestThrottlingPolicyV2Response> showDetailsOfRequestThrottlingPolicyV2Async(ShowDetailsOfRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfRequestThrottlingPolicyV2);
    }

    public CompletableFuture<UpdateEnvironmentV2Response> updateEnvironmentV2Async(UpdateEnvironmentV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateEnvironmentV2);
    }

    public CompletableFuture<UpdateRequestThrottlingPolicyV2Response> updateRequestThrottlingPolicyV2Async(UpdateRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateRequestThrottlingPolicyV2);
    }

    public CompletableFuture<UpdateSignatureKeyV2Response> updateSignatureKeyV2Async(UpdateSignatureKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateSignatureKeyV2);
    }

    public CompletableFuture<UpdateSpecialThrottlingConfigurationV2Response> updateSpecialThrottlingConfigurationV2Async(UpdateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateSpecialThrottlingConfigurationV2);
    }

    public CompletableFuture<AssociateRequestThrottlingPolicyV2Response> associateRequestThrottlingPolicyV2Async(AssociateRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.associateRequestThrottlingPolicyV2);
    }

    public CompletableFuture<BatchDisassociateThrottlingPolicyV2Response> batchDisassociateThrottlingPolicyV2Async(BatchDisassociateThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.batchDisassociateThrottlingPolicyV2);
    }

    public CompletableFuture<CreateApiGroupV2Response> createApiGroupV2Async(CreateApiGroupV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createApiGroupV2);
    }

    public CompletableFuture<CreateApiV2Response> createApiV2Async(CreateApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createApiV2);
    }

    public CompletableFuture<CreateOrDeletePublishRecordForApiV2Response> createOrDeletePublishRecordForApiV2Async(CreateOrDeletePublishRecordForApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createOrDeletePublishRecordForApiV2);
    }

    public CompletableFuture<DeleteApiGroupV2Response> deleteApiGroupV2Async(DeleteApiGroupV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteApiGroupV2);
    }

    public CompletableFuture<DeleteApiV2Response> deleteApiV2Async(DeleteApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteApiV2);
    }

    public CompletableFuture<DisassociateRequestThrottlingPolicyV2Response> disassociateRequestThrottlingPolicyV2Async(DisassociateRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.disassociateRequestThrottlingPolicyV2);
    }

    public CompletableFuture<ListApiGroupsV2Response> listApiGroupsV2Async(ListApiGroupsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApiGroupsV2);
    }

    public CompletableFuture<ListApisBindedToRequestThrottlingPolicyV2Response> listApisBindedToRequestThrottlingPolicyV2Async(ListApisBindedToRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisBindedToRequestThrottlingPolicyV2);
    }

    public CompletableFuture<ListApisUnbindedToRequestThrottlingPolicyV2Response> listApisUnbindedToRequestThrottlingPolicyV2Async(ListApisUnbindedToRequestThrottlingPolicyV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisUnbindedToRequestThrottlingPolicyV2);
    }

    public CompletableFuture<ListApisV2Response> listApisV2Async(ListApisV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisV2);
    }

    public CompletableFuture<ListRequestThrottlingPoliciesBindedToApiV2Response> listRequestThrottlingPoliciesBindedToApiV2Async(ListRequestThrottlingPoliciesBindedToApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listRequestThrottlingPoliciesBindedToApiV2);
    }

    public CompletableFuture<ShowDetailsOfApiGroupV2Response> showDetailsOfApiGroupV2Async(ShowDetailsOfApiGroupV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfApiGroupV2);
    }

    public CompletableFuture<ShowDetailsOfApiV2Response> showDetailsOfApiV2Async(ShowDetailsOfApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfApiV2);
    }

    public CompletableFuture<UpdateApiGroupV2Response> updateApiGroupV2Async(UpdateApiGroupV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateApiGroupV2);
    }

    public CompletableFuture<UpdateApiV2Response> updateApiV2Async(UpdateApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateApiV2);
    }

    public CompletableFuture<CancelingAuthorizationV2Response> cancelingAuthorizationV2Async(CancelingAuthorizationV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.cancelingAuthorizationV2);
    }

    public CompletableFuture<CheckAppV2Response> checkAppV2Async(CheckAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.checkAppV2);
    }

    public CompletableFuture<CreateAnAppV2Response> createAnAppV2Async(CreateAnAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createAnAppV2);
    }

    public CompletableFuture<CreateAuthorizingAppsV2Response> createAuthorizingAppsV2Async(CreateAuthorizingAppsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.createAuthorizingAppsV2);
    }

    public CompletableFuture<DeleteAppV2Response> deleteAppV2Async(DeleteAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.deleteAppV2);
    }

    public CompletableFuture<ListApisBindedToAppV2Response> listApisBindedToAppV2Async(ListApisBindedToAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisBindedToAppV2);
    }

    public CompletableFuture<ListApisUnbindedToAppV2Response> listApisUnbindedToAppV2Async(ListApisUnbindedToAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listApisUnbindedToAppV2);
    }

    public CompletableFuture<ListAppsBindedToApiV2Response> listAppsBindedToApiV2Async(ListAppsBindedToApiV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAppsBindedToApiV2);
    }

    public CompletableFuture<ListAppsV2Response> listAppsV2Async(ListAppsV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.listAppsV2);
    }

    public CompletableFuture<ResettingAppSecretV2Response> resettingAppSecretV2Async(ResettingAppSecretV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.resettingAppSecretV2);
    }

    public CompletableFuture<ShowDetailsOfAppV2Response> showDetailsOfAppV2Async(ShowDetailsOfAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.showDetailsOfAppV2);
    }

    public CompletableFuture<UpdateAppV2Response> updateAppV2Async(UpdateAppV2Request request) {
        return hcClient.asyncInvokeHttp(request, ApigMeta.updateAppV2);
    }

}