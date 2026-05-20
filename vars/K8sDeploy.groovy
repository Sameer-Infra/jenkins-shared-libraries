def call() {

    sh """
        echo "Starting Kubernetes Deployment..."

        kubectl version --client

        kubectl apply -f K8s-Namespace.yaml
        kubectl apply -f K8s-Configmap.yaml
        kubectl apply -f K8s-Deployment.yaml
        kubectl apply -f K8s-Service.yaml
        kubectl apply -f K8s-Ingress.yaml
        kubectl apply -f K8s-hpa.yaml

        kubectl get all -n dev

        echo "All Kubernetes resources deployed successfully 🚀"
    """
}
