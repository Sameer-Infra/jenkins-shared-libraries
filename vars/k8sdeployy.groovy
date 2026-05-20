def call(String folder = "k8s", String namespace = "dev") {

    sh """
        echo "🚀 Starting Kubernetes Deployment..."

        # Kubernetes version check
        kubectl version --client

        # Namespace create if not exists
        kubectl create namespace ${namespace} --dry-run=client -o yaml | kubectl apply -f -

        # Apply all YAML files
        kubectl apply -f ${folder}/

        # Wait for rollout (optional but good)
        kubectl get pods -n ${namespace}

        echo "✅ Deployment Done Successfully"
    """
}
