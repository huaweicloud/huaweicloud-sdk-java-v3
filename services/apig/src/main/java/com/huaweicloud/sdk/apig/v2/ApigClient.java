package com.huaweicloud.sdk.apig.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.apig.v2.model.*;

public class ApigClient {
    protected HcClient hcClient;

    public ApigClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ApigClient> newBuilder() {
        return new ClientBuilder<>(ApigClient::new);
    }

    public AssociateCertificateV2Response associateCertificateV2(AssociateCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.associateCertificateV2);
    }

    public AssociateDomainV2Response associateDomainV2(AssociateDomainV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.associateDomainV2);
    }

    public AssociateSignatureKeyV2Response associateSignatureKeyV2(AssociateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.associateSignatureKeyV2);
    }

    public CreateEnvironmentV2Response createEnvironmentV2(CreateEnvironmentV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createEnvironmentV2);
    }

    public CreateEnvironmentVariableV2Response createEnvironmentVariableV2(CreateEnvironmentVariableV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createEnvironmentVariableV2);
    }

    public CreateRequestThrottlingPolicyV2Response createRequestThrottlingPolicyV2(CreateRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createRequestThrottlingPolicyV2);
    }

    public CreateSignatureKeyV2Response createSignatureKeyV2(CreateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createSignatureKeyV2);
    }

    public CreateSpecialThrottlingConfigurationV2Response createSpecialThrottlingConfigurationV2(CreateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createSpecialThrottlingConfigurationV2);
    }

    public DeleteEnvironmentV2Response deleteEnvironmentV2(DeleteEnvironmentV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteEnvironmentV2);
    }

    public DeleteEnvironmentVariableV2Response deleteEnvironmentVariableV2(DeleteEnvironmentVariableV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteEnvironmentVariableV2);
    }

    public DeleteRequestThrottlingPolicyV2Response deleteRequestThrottlingPolicyV2(DeleteRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteRequestThrottlingPolicyV2);
    }

    public DeleteSignatureKeyV2Response deleteSignatureKeyV2(DeleteSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteSignatureKeyV2);
    }

    public DeleteSpecialThrottlingConfigurationV2Response deleteSpecialThrottlingConfigurationV2(DeleteSpecialThrottlingConfigurationV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteSpecialThrottlingConfigurationV2);
    }

    public DisassociateCertificateV2Response disassociateCertificateV2(DisassociateCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.disassociateCertificateV2);
    }

    public DisassociateDomainV2Response disassociateDomainV2(DisassociateDomainV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.disassociateDomainV2);
    }

    public DisassociateSignatureKeyV2Response disassociateSignatureKeyV2(DisassociateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.disassociateSignatureKeyV2);
    }

    public ListApiGroupsQuantitiesV2Response listApiGroupsQuantitiesV2(ListApiGroupsQuantitiesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApiGroupsQuantitiesV2);
    }

    public ListApiQuantitiesV2Response listApiQuantitiesV2(ListApiQuantitiesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApiQuantitiesV2);
    }

    public ListApisBindedToSignatureKeyV2Response listApisBindedToSignatureKeyV2(ListApisBindedToSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisBindedToSignatureKeyV2);
    }

    public ListApisNotBoundWithSignatureKeyV2Response listApisNotBoundWithSignatureKeyV2(ListApisNotBoundWithSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisNotBoundWithSignatureKeyV2);
    }

    public ListAppQuantitiesV2Response listAppQuantitiesV2(ListAppQuantitiesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listAppQuantitiesV2);
    }

    public ListEnvironmentVariablesV2Response listEnvironmentVariablesV2(ListEnvironmentVariablesV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listEnvironmentVariablesV2);
    }

    public ListEnvironmentsV2Response listEnvironmentsV2(ListEnvironmentsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listEnvironmentsV2);
    }

    public ListRequestThrottlingPolicyV2Response listRequestThrottlingPolicyV2(ListRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listRequestThrottlingPolicyV2);
    }

    public ListSignatureKeysBindedToApiV2Response listSignatureKeysBindedToApiV2(ListSignatureKeysBindedToApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listSignatureKeysBindedToApiV2);
    }

    public ListSignatureKeysV2Response listSignatureKeysV2(ListSignatureKeysV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listSignatureKeysV2);
    }

    public ListSpecialThrottlingConfigurationsV2Response listSpecialThrottlingConfigurationsV2(ListSpecialThrottlingConfigurationsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listSpecialThrottlingConfigurationsV2);
    }

    public ShowDetailsOfDomainNameCertificateV2Response showDetailsOfDomainNameCertificateV2(ShowDetailsOfDomainNameCertificateV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfDomainNameCertificateV2);
    }

    public ShowDetailsOfEnvironmentVariableV2Response showDetailsOfEnvironmentVariableV2(ShowDetailsOfEnvironmentVariableV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfEnvironmentVariableV2);
    }

    public ShowDetailsOfRequestThrottlingPolicyV2Response showDetailsOfRequestThrottlingPolicyV2(ShowDetailsOfRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfRequestThrottlingPolicyV2);
    }

    public UpdateEnvironmentV2Response updateEnvironmentV2(UpdateEnvironmentV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateEnvironmentV2);
    }

    public UpdateRequestThrottlingPolicyV2Response updateRequestThrottlingPolicyV2(UpdateRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateRequestThrottlingPolicyV2);
    }

    public UpdateSignatureKeyV2Response updateSignatureKeyV2(UpdateSignatureKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateSignatureKeyV2);
    }

    public UpdateSpecialThrottlingConfigurationV2Response updateSpecialThrottlingConfigurationV2(UpdateSpecialThrottlingConfigurationV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateSpecialThrottlingConfigurationV2);
    }

    public AssociateRequestThrottlingPolicyV2Response associateRequestThrottlingPolicyV2(AssociateRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.associateRequestThrottlingPolicyV2);
    }

    public BatchDisassociateThrottlingPolicyV2Response batchDisassociateThrottlingPolicyV2(BatchDisassociateThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.batchDisassociateThrottlingPolicyV2);
    }

    public CreateApiGroupV2Response createApiGroupV2(CreateApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createApiGroupV2);
    }

    public CreateApiV2Response createApiV2(CreateApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createApiV2);
    }

    public CreateOrDeletePublishRecordForApiV2Response createOrDeletePublishRecordForApiV2(CreateOrDeletePublishRecordForApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createOrDeletePublishRecordForApiV2);
    }

    public DeleteApiGroupV2Response deleteApiGroupV2(DeleteApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteApiGroupV2);
    }

    public DeleteApiV2Response deleteApiV2(DeleteApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteApiV2);
    }

    public DisassociateRequestThrottlingPolicyV2Response disassociateRequestThrottlingPolicyV2(DisassociateRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.disassociateRequestThrottlingPolicyV2);
    }

    public ListApiGroupsV2Response listApiGroupsV2(ListApiGroupsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApiGroupsV2);
    }

    public ListApisBindedToRequestThrottlingPolicyV2Response listApisBindedToRequestThrottlingPolicyV2(ListApisBindedToRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisBindedToRequestThrottlingPolicyV2);
    }

    public ListApisUnbindedToRequestThrottlingPolicyV2Response listApisUnbindedToRequestThrottlingPolicyV2(ListApisUnbindedToRequestThrottlingPolicyV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisUnbindedToRequestThrottlingPolicyV2);
    }

    public ListApisV2Response listApisV2(ListApisV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisV2);
    }

    public ListRequestThrottlingPoliciesBindedToApiV2Response listRequestThrottlingPoliciesBindedToApiV2(ListRequestThrottlingPoliciesBindedToApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listRequestThrottlingPoliciesBindedToApiV2);
    }

    public ShowDetailsOfApiGroupV2Response showDetailsOfApiGroupV2(ShowDetailsOfApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfApiGroupV2);
    }

    public ShowDetailsOfApiV2Response showDetailsOfApiV2(ShowDetailsOfApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfApiV2);
    }

    public UpdateApiGroupV2Response updateApiGroupV2(UpdateApiGroupV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateApiGroupV2);
    }

    public UpdateApiV2Response updateApiV2(UpdateApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateApiV2);
    }

    public CancelingAuthorizationV2Response cancelingAuthorizationV2(CancelingAuthorizationV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.cancelingAuthorizationV2);
    }

    public CheckAppV2Response checkAppV2(CheckAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.checkAppV2);
    }

    public CreateAnAppV2Response createAnAppV2(CreateAnAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createAnAppV2);
    }

    public CreateAuthorizingAppsV2Response createAuthorizingAppsV2(CreateAuthorizingAppsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.createAuthorizingAppsV2);
    }

    public DeleteAppV2Response deleteAppV2(DeleteAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.deleteAppV2);
    }

    public ListApisBindedToAppV2Response listApisBindedToAppV2(ListApisBindedToAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisBindedToAppV2);
    }

    public ListApisUnbindedToAppV2Response listApisUnbindedToAppV2(ListApisUnbindedToAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listApisUnbindedToAppV2);
    }

    public ListAppsBindedToApiV2Response listAppsBindedToApiV2(ListAppsBindedToApiV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listAppsBindedToApiV2);
    }

    public ListAppsV2Response listAppsV2(ListAppsV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.listAppsV2);
    }

    public ResettingAppSecretV2Response resettingAppSecretV2(ResettingAppSecretV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.resettingAppSecretV2);
    }

    public ShowDetailsOfAppV2Response showDetailsOfAppV2(ShowDetailsOfAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.showDetailsOfAppV2);
    }

    public UpdateAppV2Response updateAppV2(UpdateAppV2Request request) {
        return hcClient.syncInvokeHttp(request, ApigMeta.updateAppV2);
    }

}