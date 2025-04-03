# Use official Node.js image
FROM node:18-alpine

# Set working directory inside the container
WORKDIR /app

# Set environment variable to allow OpenSSL legacy algorithms
ENV NODE_OPTIONS=--openssl-legacy-provider

# Copy package.json and package-lock.json first to install dependencies
COPY package.json package-lock.json ./

# Install dependencies
RUN npm install

# Copy the rest of the frontend code
COPY . .

# Build the frontend app
RUN npm run build

# Use Nginx to serve the frontend in production
FROM nginx:alpine
COPY --from=0 /app/build /usr/share/nginx/html

# Expose port 80
EXPOSE 80

# Start Nginx
CMD ["nginx", "-g", "daemon off;"]
