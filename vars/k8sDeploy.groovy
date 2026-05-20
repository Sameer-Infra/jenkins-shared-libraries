def call() {

    sh """
        echo "Starting Kubernetes Deployment..."

        kubectl version --client

        kubectl apply -f k8s-namespace.yaml
        kubectl apply -f k8s-configmap.yaml
        kubectl apply -f k8s-secret.yaml
        kubectl apply -f k8s-deployment.yaml
        kubectl apply -f k8s-service.yaml
        kubectl apply -f k8s-ingress.yaml
        kubectl apply -f k8s-hpa.yaml

        kubectl get all -n dev

        echo "All Kubernetes resources deployed successfully 🚀"
    """
}
