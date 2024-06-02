FROM node:20-alpine

WORKDIR /app

COPY package.json package-lock.json ./

RUN npm install

COPY src ./src
COPY index.html ./
COPY .eslintrc.cjs ./
COPY README.md ./
COPY tsconfig.json ./
COPY tsconfig.node.json ./
COPY vite.config.ts ./

RUN npm run build

EXPOSE 5173

CMD ["npm", "run", "start"]